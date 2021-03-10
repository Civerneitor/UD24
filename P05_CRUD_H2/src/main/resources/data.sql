
DROP table IF EXISTS Trabajadores;

create table Trabajadores(
	id int auto_increment primary key,
	nombre varchar(250),
	apellido varchar(250),
	direccion varchar(250),
	dni integer,
	cargo enum('PROGRAMADOR','ANALISTA','ENCARGADO') not null,
	salario int default 0,
	fecha date
);

insert into Trabajadores(nombre, apellido,direccion,dni,cargo,fecha)values('Jose','Marin','calle imaginaria 1',123456789, 'ANALISTA', NOW());
insert into Trabajadores(nombre, apellido,direccion,dni,cargo,fecha)values('Juan','Lopez','calle imaginaria 2',122222222, 'PROGRAMADOR', NOW());
insert into Trabajadores(nombre, apellido,direccion,dni,cargo,fecha)values('Pedro','Guillem','calle imaginaria 3',123333333, 'ANALISTA', NOW());
insert into Trabajadores(nombre, apellido,direccion,dni,cargo,fecha)values('Jordi','Martin','calle imaginaria 4',123444444, 'PROGRAMADOR', NOW());
insert into Trabajadores(nombre, apellido,direccion,dni,cargo,fecha)values('Jonatan','Vicente','calle imaginaria 5',123455555, 'ENCARGADO', NOW());