select*from tbl_book;

create table tbl_member
(
memId varchar(20) primary key,
pwd varchar(255) not null
);

desc tbl_member;



delete from tbl_member;
insert into tbl_member values('mem1','1111',0);
insert into tbl_member values('mgr1','1111',1);


desc tbl_lend;
select*from tbl_lend;

create table tbl_lend(
lid int AUTO_INCREMENT primary key,
bookcode int not null,
memId varchar(45) not null,
startDate Date,
endDate date

);

delete table tbl_lend;

DESC `libdb`.`tbl_lend`;

select*from tbl_lend;

select*from tbl_book;

select*from tbl_member;

delete from tbl_member;

insert into tbl_member  values(
'mem1','1111',1);
insert into tbl_member  values(
'mgr1','1111',2);


