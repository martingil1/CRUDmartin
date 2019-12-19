use dbapiabogados;

alter table user change column photo photo longblob;
alter table clientuser change column nro_caso nro_caso int(10) not null unique;

select * from client;
select * from user;
select * from clientuser;
