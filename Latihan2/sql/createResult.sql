create table tr_result(
    Result_id char(5) primary key not null,
    program_id char(5),
    student_id char(5),
    Written_test varchar(4),
    Oral_test varchar(4),
    Note varchar(10),
    foreign key (program_id) references ms_program(Program_id) on update cascade on delete cascade,
    foreign key (student_id) references ms_student(Student_id) on update cascade on delete cascade
);