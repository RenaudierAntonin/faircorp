INSERT INTO BUILDING(ID, NAME) VALUES(1, '158');
INSERT INTO BUILDING(ID, NAME) VALUES(2, 'EF');

INSERT INTO ROOM(ID, NAME, FLOOR) VALUES(1, 'F1', 1);
INSERT INTO ROOM(ID, NAME, FLOOR) VALUES(2, 'F2', 2);
INSERT INTO ROOM(ID, NAME, FLOOR) VALUES(3, 'S129', 1);


INSERT INTO BUILDING_ROOMS (BUILDING_ID, ROOMS_ID) VALUES (1, 1);
INSERT INTO BUILDING_ROOMS (BUILDING_ID, ROOMS_ID) VALUES (1, 2);
INSERT INTO BUILDING_ROOMS (BUILDING_ID, ROOMS_ID) VALUES (2, 3);

INSERT INTO LIGHT(ID, LEVEL, STATUS) VALUES (1, 8, 'ON');
INSERT INTO LIGHT(ID, LEVEL, STATUS) VALUES (2, 0, 'OFF');
INSERT INTO LIGHT(ID, LEVEL, STATUS) VALUES (3, 4, 'OFF');
INSERT INTO LIGHT(ID, LEVEL, STATUS) VALUES (4, 2, 'ON');
INSERT INTO LIGHT(ID, LEVEL, STATUS) VALUES (5, 3, 'OFF');
INSERT INTO LIGHT(ID, LEVEL, STATUS) VALUES (6, 9, 'OFF');

INSERT INTO ROOM_LIGHTS (ROOM_ID, LIGHTS_ID) VALUES (1, 1);
INSERT INTO ROOM_LIGHTS (ROOM_ID, LIGHTS_ID) VALUES (2, 2);
INSERT INTO ROOM_LIGHTS (ROOM_ID, LIGHTS_ID) VALUES (2, 3);
INSERT INTO ROOM_LIGHTS (ROOM_ID, LIGHTS_ID) VALUES (3, 4);
INSERT INTO ROOM_LIGHTS (ROOM_ID, LIGHTS_ID) VALUES (3, 5);
INSERT INTO ROOM_LIGHTS (ROOM_ID, LIGHTS_ID) VALUES (3, 6);