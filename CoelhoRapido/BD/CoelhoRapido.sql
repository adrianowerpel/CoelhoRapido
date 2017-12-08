create database coelho_rapido;
use coelho_rapido;

create table cliente(
id_cliente int not null auto_increment,
nome_cli varchar(50) not null,
cpf char(11) not null,
endereco varchar(50) not null,
sexo char(9) not null,
data_nasc varchar(11) not null,
primary key(id_cliente),
unique(cpf));

create table motorista(
id_motorista int not null auto_increment,
nome_mot varchar(50) not null,
cnh char(11) not null,
categoria char(1) not null,
endereco varchar(50) not null,
sexo char(9) not null,
data_nasc varchar(11) not null,
status_mot varchar(20) not null,
primary key(id_motorista),
unique(cnh));


create table administrador(
id_admin int not null auto_increment,
nome_admin varchar(50) not null,
codigo char(11) not null,
endereco varchar(50) not null,
sexo char(9) not null,
data_nasc varchar(11) not null,
primary key(id_admin),
unique(codigo));

create table cidade_entrega(
id_cidade int not null auto_increment,
nome_cid varchar(50) not null,
distancia double(10,2) not null,
tempo_entrega varchar(15) not null,
valor_entrega double(10,2) not null,
primary key(id_cidade));

create table pedidos(
id_pedido int not null auto_increment,
descricao varchar(100) not null,
cpf_cliente char(11) not null,
cnh_motorista char(11),
cidade_id int not null,
cidade_atual varchar(50) not null,
veiculo varchar(30) not null,
data_pedido varchar(11) not null,
valor_pedido double(10,2) not null,
status varchar(20) not null,
primary key(id_pedido),
constraint fk_cpf_cliente foreign key(cpf_cliente) references cliente(cpf),
constraint fk_cnh_motorista foreign key(cnh_motorista) references motorista(cnh),
constraint fk_id_cidade foreign key(cidade_id) references cidade_entrega(id_cidade));

create table login(
id_login int not null auto_increment,
cpf_login char(11),
cnh_login char(11),
cod_login char(11),
senha varchar(30) not null,
primary key(id_login),
unique(cpf_login),
unique(cnh_login),
unique(cod_login),
constraint fk_cpf_login foreign key (cpf_login) references cliente (cpf),
constraint fk_cnh_login foreign key (cnh_login) references motorista (cnh),
constraint fk_cod_login foreign key (cod_login) references administrador (codigo));