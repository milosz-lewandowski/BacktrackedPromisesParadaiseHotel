drop table if exists public.bookings CASCADE;
drop table if exists public.guests CASCADE;
drop table if exists public.rooms CASCADE;

drop sequence if exists hibernate_sequence;

create table public.bookings
(
    booking_id   integer not null auto_increment,
    guest_id     integer,
    room_room_id integer,
    primary key (booking_id)
);

create table public.guests
(
    guest_id     integer not null auto_increment,
    first_name   varchar(255),
    phone_number varchar(255),
    surname      varchar(255),
    primary key (guest_id)
);

create table public.rooms
(
    room_id     integer      not null auto_increment,
    room_number varchar(255) not null,
    primary key (room_id)
);


alter table public.rooms
    add constraint UK_7ljglxlj90ln3lbas4kl983m2 unique (room_number);

alter table public.bookings
    add constraint FKpvlyfwhomknrbmo2d20src5vi
        foreign key (guest_id)
            references public.guests;

alter table public.bookings
    add constraint FKrrqbdy8kgocfh3uerpcj2k9j2
        foreign key (room_room_id)
            references public.rooms;

-- create sequence hibernate_sequence increment by 1;

insert into PUBLIC.GUESTS (FIRST_NAME, SURNAME, PHONE_NUMBER)
VALUES ('g1', 'g1', '997');
insert into PUBLIC.GUESTS (FIRST_NAME, SURNAME, PHONE_NUMBER)
VALUES ('g2', 'g2', '998');
insert into PUBLIC.GUESTS (FIRST_NAME, SURNAME, PHONE_NUMBER)
VALUES ('g3', 'g3', '999');
insert into PUBLIC.GUESTS (FIRST_NAME, SURNAME, PHONE_NUMBER)
VALUES ('g4', 'g4', '112');

insert into PUBLIC.ROOMS (ROOM_NUMBER)
VALUES ('r1');
insert into PUBLIC.ROOMS (ROOM_NUMBER)
VALUES ('r2');
insert into PUBLIC.ROOMS (ROOM_NUMBER)
VALUES ('r3');
insert into PUBLIC.ROOMS (ROOM_NUMBER)
VALUES ('r4');

insert into PUBLIC.BOOKINGS (GUEST_ID, ROOM_ROOM_ID)
VALUES (1, 1);
insert into PUBLIC.BOOKINGS (GUEST_ID, ROOM_ROOM_ID)
VALUES (2, 2);
insert into PUBLIC.BOOKINGS (GUEST_ID, ROOM_ROOM_ID)
VALUES (2, 3);
insert into PUBLIC.BOOKINGS (GUEST_ID, ROOM_ROOM_ID)
VALUES (2, 4);
