package com.esme.spring.faircorp.hello;

import com.esme.spring.faircorp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/buildings")
@Transactional
public class BuildingControler {

    @Autowired
    private BuildingDao buildingDao;

    @Autowired
    private RoomDao roomDao;

    @Autowired
    private LightDao lightDao;

    private BuildingDaoImpl buildingDaoImpl;

    private RoomDaoImpl roomDaoImpl;

    private LightDaoImpl lightDaoImpl;

    @GetMapping
    public List<BuildingDto> findAll() {
        return buildingDao.findAll()
                .stream()
                .map(BuildingDto::new)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public BuildingDto findById(@PathVariable Long id) {
        return buildingDao.findById(id).map(building -> new BuildingDto(building)).orElse(null);
    }

    @PostMapping
    public BuildingDto create(@RequestBody BuildingDto dto) {
        Building building = null;
        if (dto.getId() != null) {
            building = buildingDao.findById(dto.getId()).orElse(null);
        }

        if (building == null) {
            building = buildingDao.save(new Building(dto.getName()));
        }
        else {
            building.setName(dto.getName());
            buildingDao.save(building);
        }

        return new BuildingDto(building);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        Building building = buildingDaoImpl.findBuildingById(id);

        List<Room> list = roomDaoImpl.FindRoomByBuilding(building);

        for (int i=0;i<list.size();i++) {
            List<Light> listl = lightDaoImpl.findOnRoomId(list.get(i));

            for (int j=0;j<list.size();j++) {
                lightDao.deleteById(listl.get(j).getId());
            }

            roomDao.deleteById(list.get(i).getId());
        }
        buildingDao.deleteById(id);}
}
