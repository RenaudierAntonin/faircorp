package com.esme.spring.faircorp.hello;

import com.esme.spring.faircorp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/rooms")
@Transactional
public class RoomControler {

    @Autowired
    private RoomDao roomDao;

    @Autowired
    private LightDao lightDao;

    private RoomDaoImpl roomDaoImpl;
    private LightDaoImpl lightDaoImpl;

    @GetMapping
    public List<RoomDto> findAll() {
        return roomDao.findAll()
                .stream()
                .map(RoomDto::new)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}/{room}")
    public RoomDto findById(@PathVariable Long id) {
        return roomDao.findById(id).map(room -> new RoomDto(room)).orElse(null);
    }


    @PostMapping
    public RoomDto create(@RequestBody RoomDto dto) {
        Room room = null;
        if (dto.getId() != null) {
            room = roomDao.findById(dto.getId()).orElse(null);
        }

        if (room == null) {
            room = roomDao.save(new Room(dto.getFloor(),dto.getName()));
        }

        else {
            room.setFloor(dto.getFloor());
            room.setName(dto.getName());
            roomDao.save(room);
        }

        return new RoomDto(room);
    }
    @DeleteMapping(path ="/{id]")
    public void delete(@PathVariable Long id) {

        Room room = roomDaoImpl.FindRoomById(id);

        List<Light> list = lightDaoImpl.findOnRoomId(room);

        for (int i=0;i<list.size();i++) {
            lightDao.deleteById(list.get(i).getId());
        }

        roomDao.deleteById(id);
    }
}
