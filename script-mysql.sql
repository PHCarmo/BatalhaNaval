/*drop database batalha_naval;*/
create database batalha_naval;
use batalha_naval;

create table historico(
id int not null auto_increment primary key,
player varchar(40) not null,
vidas int not null,
situacao varchar(6) not null,
dt datetime not null
);

create table conquistas(
id int not null auto_increment primary key,
nome varchar(40) not null,
progresso int not null
);

insert into conquistas(nome, progresso) VALUES
('Jogador I',0),
('Jogador II',0),
('Jogador III',0),
('Profundezas',0),
('Ostentação',0),
('Travessia',0),
('Peso Pesado',0),
('Cineasta',0),
('Afogado',0),
('Perfect',0);