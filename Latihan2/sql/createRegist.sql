create table tr_regist(
    regist_id char(6) primary key not null,
    Student_id char(5),
    Jadwal_id char(5) ,
    grade_id char(5) ,
    foreign key (Student_id) references ms_student(Student_id) on update cascade on delete cascade,
    foreign key (Jadwal_id) references tr_jadwal(Jadwal_id) on update cascade on delete cascade,
    foreign key (grade_id) references ms_grade(grade_id) on update cascade on delete cascade
);