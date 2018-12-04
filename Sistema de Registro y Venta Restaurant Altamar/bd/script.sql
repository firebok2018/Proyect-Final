drop database  if exists Empresa; 

create database Empresa;

use Empresa;

create table tipoUsuario(
id_tipo int(11) primary key,
nomTipo varchar(45)
);
create table Usuarios(
idUser char(5) primary key ,
Usuario char(5) Unique,
pwdUser varchar(45),
Correo varchar(45),
nomUser varchar(45),
apeUser varchar(60),
last_Sesion varchar(30),
time_SignIn varchar(30),
id_tipo int(11) ,
idCon boolean,
idAct boolean,
idCons boolean,
foreign key (id_tipo) references tipoUsuario(id_tipo)
);
create table TipoMesa(
idTipo int(11) primary key,
nomTipo varchar(40)
);
create table NumMesa(
idMesa char(5) not null,
numMesa int(11) primary key,
numSillas int(11) default 4,
estado int(11),
foreign key (estado) references TipoMesa(idTipo)
);

create table TipoProductos(
idTipo_Pro int(11) primary key,
nomTip_pro varchar(45)
);
create table Productos(
CodPro char(5) ,
nomPro varchar(45),
idTipo_Pro int(11) ,
stock int(11),
precio double,
primary key (CodPro, idTipo_Pro),
foreign key(idTipo_Pro) references TipoProductos(idTipo_Pro)
);
create table menu(
idMenu int(11) primary key,
nomMenu varchar(45),
foreign key (idMenu) references TipoProductos(idTipo_Pro)
);
create table Bebidas(
idBebida int(11) primary key,
nomBebida varchar(45),
foreign key (idBebida) references TipoProductos(idTipo_Pro)
);
create table Extras(
idExtras int(11) primary key,
nomExtras varchar(45),
foreign key (idExtras) references TipoProductos(idTipo_Pro)
);
create table Clientes(
CodCli char(5) primary key,
dniCli int(8),
nomCli varchar(45),
apeCli varchar(65),
telefono int(9),
numMesa int(11),
estado  int(11),
foreign key (numMesa) references NumMesa(numMesa),
foreign key (estado) references TipoMesa(idTipo)
);
create table Venta(
numVenta char(5) primary key,
codCli char(5),
nomX varchar(200),
tipo int(1),
descripcion varchar(200),
cant int(2) default 1,
nomV char(5),
foreign key (tipo)references Productos(idTipo_Pro),
foreign key (codCli) references Clientes(CodCli),
foreign key (nomV) references Usuarios(Usuario)
);

#drop table TipoMesa;
#drop table nummesa;
#drop table Productos;
#drop table Clientes;
#drop table Platillos;
#drop table Usuarios;
#drop table venta;

-- select*from tipoUsuario;
-- select*from Usuarios;
-- select*from NumMesa;
-- select*from TipoMesa;
-- select*from TipoProductos;
-- select*from Productos;
-- select*from Clientes;
-- select*from Venta;






#por defecto

insert into tipoUsuario values(0,'Seleccione..');
insert into tipoUsuario values(1,'Usuario');
insert into tipoUsuario values(2,'Administrador');

insert into TipoMesa values(0,'libre');
insert into TipoMesa values(1,'Disponible');
insert into TipoMesa values(2,'Completo');

insert into TipoProductos values(0,'Seleccione ...');
insert into TipoProductos values(1,'Menú');
insert into TipoProductos values(2,'Bebidas');
insert into TipoProductos values(3,'Extras');

#SignIn
delimiter $$
drop procedure if exists verificar_user $$
create procedure verificar_user(xuser char(5),pwd varchar(50))
begin
	select*from usuarios where Usuario=xuser and pwdUser=sha1(pwd);
end $$
delimiter ;
#CRUD DE LA TABLA TIPOS USUARIOS
delimiter $$
drop procedure if exists add_User $$
create procedure add_User(codUsr char(5),Usr char(5),pwd varchar(5000),email varchar(45),
nom varchar(45),ape varchar(60),ls varchar(30),tm varchar(30),prv int(2),c boolean,a boolean,cn boolean)
begin
	INSERT INTO Usuarios values(codUsr,Usr,sha1(pwd),email,nom,ape,ls,tm,prv,c,a,cn);
end $$
delimiter ;
call add_user('WILKL','WILKL','³2:17♀n-0╣↓↓→☼ı3"$!°O=/%%$?D0DS# ↔q2H£$','firebokinc@gmail.com','Wil','Incautipa flores',
curdate(),'12:12:12',2,true,true,true);


delimiter $$
drop procedure if exists update_User $$
create procedure update_User(cUsr char(5),Usr char(5),pwd varchar(5000),email varchar(45),
nom varchar(45),ape varchar(60),ls varchar(30),tm varchar(30),prv int(2),c boolean,a boolean,cn boolean)
begin
	update usuarios set idUser=cUsr,Usuario=Usr,pwdUser=sha1(pwd),Correo=email,
    nomUser=nom,apeUser=ape,last_Sesion=ls,time_SignIn=tm,id_tipo=prv,idCon=c,idAct=a,idCons=cn where idUser=cUsr;
end $$
delimiter ;

delimiter $$
drop procedure if exists delete_user $$
create procedure delete_user(xuser char(5))
begin
	delete from usuarios where idUser=xuser;
end $$
delimiter ;

delimiter $$
drop procedure if exists ls_user $$
create procedure ls_user()
begin
SELECT*FROM usuarios;
end $$
delimiter ;

#CRUD DE LA TABLA NUMMESA
select*from NumMesa;
delimiter $$
DROP PROCEDURE IF EXISTs ls_mesa $$
create procedure ls_mesa()
begin
	select*from NumMesa;
end $$
delimiter ;

DELIMITER $$
DROP PROCEDURE IF EXISTs add_mesa $$
CREATE PROCEDURE add_mesa(cod char(5),num int(11),sillas INT(11),estado int(11))
begin
	INSERT INTO NumMesa VALUES(cod,num,sillas,estado);
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs update_mesa $$
create procedure update_mesa(c char(5),n int(11),s INT(11),e int(11))
begin
	update NumMesa set idMesa=c,numMesa=n,numSillas=s,estado=e where numMesa=n;
end $$
delimiter ;

delimiter $$
drop procedure if exists delete_mesa $$
create procedure delete_mesa(num int(11))
begin
	delete from NumMesa where numMesa=num;
end $$
delimiter ;

DELIMITER $$
DROP PROCEDURE IF EXISTs num_mesa $$
create procedure num_mesa(num int(11))
begin
	select (numSillas) from NumMesa where numMesa=num;
end $$
delimiter ;

DELIMITER $$
DROP PROCEDURE IF EXISTs search_mesa $$
create procedure search_mesa(num int(11))
begin
	select*from NumMesa where numMesa=num;
end $$
delimiter ;

#CRUD DEL LA TABLA PRODUCTOS
DELIMITER $$
DROP PROCEDURE IF EXISTs search_producto $$
create procedure search_producto( cod char (5))
begin
	select*from productos where CodPro=cod;
end $$
delimiter ;

select*from productos;
delimiter $$
DROP PROCEDURE IF EXISTs add_producto $$
create procedure add_producto(cod char(5),nom varchar(45),tipo int(11),stock int(11),precio double)
begin
	insert into productos  values (cod,nom,tipo,stock,precio);
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs update_producto $$
create procedure update_producto(c char(5),n varchar(45),t int(11),s int(11),p double)
begin
	update productos set CodPro=c,nomPro=n,idTipo_pro=t,stock=s,precio=p where CodPro=c;
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs delete_producto $$
create procedure delete_producto(cod char(5))
begin
	delete from productos where CodPro=cod;
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs ls_productos $$
create procedure ls_productos()
begin
	select*from productos;
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs ls_TipoPro $$
create procedure ls_TipoPro()
begin
	select*from TipoProductos;
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs ls_MTipoPro $$
create procedure ls_MTipoPro(tip int(1))
begin
	select*from Productos where idTipo_Pro=tip;
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs ls_BTipoPro $$
create procedure ls_BTipoPro(tip int(1))
begin
	select*from Productos where idTipo_Pro=tip;
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs ls_ETipoPro $$
create procedure ls_ETipoPro(tip int(1))
begin
	select*from Productos where idTipo_Pro=tip;
end $$
delimiter ;

#CRUD DE LA TABLA CLIENTES
DELIMITER $$
DROP PROCEDURE IF EXISTs search_cliente $$
create procedure search_cliente( cod char (5))
begin
	select*from clientes where CodCli=cod;
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs add_cliente $$
create procedure add_cliente(cod char(5),dni int(8),nom varchar(45),apell varchar(65),fono int(9),mesa int(11) ,est int(11))
begin
	insert into Clientes values(cod,dni,nom,apell,fono,mesa,est);
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs update_cliente $$
create procedure update_cliente(c char(5),d int(8),n varchar(45),a varchar(65),f int(9),m int(11) ,e int(11))
begin
	update Clientes set CodCli=c,dniCli=d,nomCli=n,apeCli=a,telefono=f,numMesa=m,estado=e where CodCli=c;
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs delete_cliente $$
create procedure delete_cliente(cod char(5))
begin
	delete from Clientes where CodCli=cod;
end $$
delimiter ;  

delimiter $$
DROP PROCEDURE IF EXISTs ls_Cliente $$
create procedure ls_Cliente()
begin
	select*from Clientes;
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs add_usuario $$
create procedure add_usuario(usr char(5),pw varchar(45),email varchar(50),nom varchar(45),ape varchar(60), d varchar(30),t varchar(30), priv int(11))
begin
	insert into usuarios values(null,usr,pw,email,nom,ape,d,t,priv);
end $$
delimiter ;

#CRUD VENTAS
delimiter $$
drop procedure if exists ls_venta $$
create procedure ls_venta()
begin 
 select*from Venta;
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs add_Venta $$
create procedure add_Venta(nVen char(5),nomc char(5),x varchar(200),tipo int(11),des varchar(200),cant int(11),usrV char(5))
begin
	insert into Venta values(nVen,nomc,x,tipo,des,cant,usrV);
end $$
delimiter ;

delimiter $$
DROP PROCEDURE IF EXISTs update_venta $$
create procedure update_venta(nVen char(5),nomc char(5),x varchar(200),tip int(11),des varchar(200),ca int(11),usrV char(5))
begin
	update venta set numVenta=nVen,codCli=nomc,nomX=x,tipo=tip,descripcion=des,cant=ca,nomV=usrV where numVenta=nVen;
end $$
delimiter ;

delimiter $$
drop procedure if exists delete_venta $$
create procedure delete_venta(nv char(5))
begin 
	delete from Venta where numVenta=nv;
end $$
delimiter ;

delimiter $$
drop procedure if exists consultaCli $$
create procedure consultaCli(cod char(5))
begin 
	select v.Codcli, case when tipo=1 then 'Menu'
									when tipo=2 then 'Bebidas'
                                        when tipo= 3 then 'Extras'
                                        end as 'Tipo',p.nomPro,p.precio,cant,(cant*precio)
                                        from venta as v inner join productos as p
		on v.tipo=p.idTipo_Pro where Codcli=cod;
end $$
delimiter ;







