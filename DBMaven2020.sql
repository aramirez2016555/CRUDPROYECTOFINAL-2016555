drop database if exists DBPruebaMaven2020;

create database DBPruebaMaven2020;
use DBPruebaMaven2020;

<<<<<<< HEAD
create table Persona(
=======
create table Persona(){
>>>>>>> developer
    idPersona int not null auto_increment,
    dpiPersona varchar(13) not null,
    nombresPersona varchar(50),

    primary key PK_idPersona (idPersona)
<<<<<<< HEAD
);
=======
}
>>>>>>> developer

insert into Persona (dpiPersona, nombresPersona) values
("9783026233972", "Javier Daniel Contreras Garc&iacute;a"),
("9783021233972", "Jairo Luciano Godoy Ram&iacute;rez"),
("9783020913971", "Larry Damian Garc&iacute;a Gozo"),
("9783021107612", "Karen Alondra P&eacute;rez"),
("9783021103123", "Alma Katerin Gutierrez"),
("9783021287352", "Daniela Patricia Montesori P&eacute;rez");