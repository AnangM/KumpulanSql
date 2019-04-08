create table tr_payment(
    payment_id char(5) primary key not null,
    regist_id char(6),
    Total_payment numeric,
    Payment_date datetime,
    foreign key (regist_id) references tr_regist(regist_id) on update cascade on delete cascade
    );