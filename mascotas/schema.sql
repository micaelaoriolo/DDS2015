
    create table Humano (
        id bigint generated by default as identity (start with 1),
        nombre varchar(255),
        primary key (id)
    )

    create table Mascota (
        id bigint generated by default as identity (start with 1),
        nombre varchar(255),
        id_duenio bigint,
        primary key (id)
    )

    alter table Mascota 
        add constraint FK_l2iwgyayv4ovd8h1w7xok7sq 
        foreign key (id_duenio) 
        references Humano
