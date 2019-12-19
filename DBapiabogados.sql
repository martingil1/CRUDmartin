create database if not exists  dbapiabogados;

use dbapiabogados;

create table if not exists user(
	
	id_user int (5) not null auto_increment,
    name varchar (50) not null,
    surname varchar (50) not null,
    license varchar (50) not null,
    phone varchar (30) not null,
    mail varchar (40) not null,
    specialty varchar (50) not null,
    rate float not null,
    adress varchar (50) not null,
    photo longblob not null,
    
	constraint PK_user
    primary key (id_user)
    

)engine = InnoDB;


create table if not exists client(
	
	id_client int (5) not null auto_increment,
    name varchar (50) not null,
    surname varchar (50) not null,
    phone varchar (30) not null,
    description varchar (200) not null,

    constraint PK_client
    primary key (id_client)
    

)engine = InnoDB;



