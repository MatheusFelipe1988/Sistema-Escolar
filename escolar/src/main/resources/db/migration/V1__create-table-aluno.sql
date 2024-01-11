create table aluno(
id int not null auto_increment,
nome varchar(256),
sobreNome varchar(256),
cpf varchar(256),
boletim decimal(10,2),
unique key matricula,
primary key(id));