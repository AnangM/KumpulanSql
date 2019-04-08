create table trh_absensi(
    absensi_id char(2) primary key not null,
    jadwal_id char(5),
    Pertemuan1_date varchar(15),
    Pertemuan2_date varchar(15),
    Pertemuan3_date varchar(15),
    Pertemuan4_date varchar(15),
    Pertemuan5_date varchar(15),
    Pertemuan6_date varchar(15),
    Pertemuan7_date varchar(15),
    Pertemuan8_date varchar(15),
    Pertemuan9_date varchar(15),
    Pertemuan10_date varchar(15),
    Pertemuan11_date varchar(15),
    Pertemuan12_date varchar(15),
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