create table trh_absensi(
    absensi_id char(2) primary key not null,
    jadwal_id char(5),
    Pertemuan1_date datetime,
    Pertemuan2_date datetime,
    Pertemuan3_date datetime,
    Pertemuan4_date datetime,
    Pertemuan5_date datetime,
    Pertemuan6_date datetime,
    Pertemuan7_date datetime,
    Pertemuan8_date datetime,
    Pertemuan9_date datetime,
    Pertemuan10_date datetime,
    Pertemuan11_date datetime,
    Pertemuan12_date datetime,
    foreign key (jadwal_id) references tr_jadwal(Jadwal_id) on update cascade on delete cascade
);

create table trd_absensi(
    absensi_id char(2),
    student_id char(5),
    Pertemuan_1 varchar(5),
    Pertemuan_2 varchar(5),
    Pertemuan_3 varchar(5),
    Pertemuan_4 varchar(5),
    Pertemuan_5 varchar(5),
    Pertemuan_6 varchar(5),
    Pertemuan_7 varchar(5),
    Pertemuan_8 varchar(5),
    Pertemuan_9 varchar(5),
    Pertemuan_10 varchar(5),
    Pertemuan_11 varchar(5),
    Pertemuan_12 varchar(5),
    primary key(absensi_id, student_id)
);