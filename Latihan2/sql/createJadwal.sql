create table tr_jadwal(
    Jadwal_id char(5) primary key not null,
    Day_ varchar(10),
    Time_ varchar(10),
    Program_id char(5),
    Room char(3),
    tutor_id char(5),
    foreign key (Program_id) references ms_program(Program_id) on update cascade on delete cascade,
    foreign key (tutor_id) references ms_tutor(Tutor_id) on update cascade on delete cascade

);