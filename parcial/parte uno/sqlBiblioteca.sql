
CREATE DATABASE BibliotecaCorhuila;


USE BibliotecaCorhuila;

CREATE TABLE Usuario (
    UsuarioID INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Tipo VARCHAR(20) CHECK (Tipo IN ('Administrador', 'Visitante'))
);

CREATE TABLE Sala (
    SalaID INT PRIMARY KEY,
    Nombre VARCHAR(50)
);

CREATE TABLE Libro (
    LibroID INT PRIMARY KEY,
    Titulo VARCHAR(100),
    Categoria VARCHAR(50),
    SalaID INT,
    FOREIGN KEY (SalaID) REFERENCES Sala(SalaID)
);

CREATE TABLE Prestamo (
    PrestamoID INT PRIMARY KEY,
    UsuarioID INT,
    LibroID INT,
    FechaPrestamo DATE,
    FechaDevolucion DATE,
    FOREIGN KEY (UsuarioID) REFERENCES Usuario(UsuarioID),
    FOREIGN KEY (LibroID) REFERENCES Libro(LibroID)
);

INSERT INTO Usuario (UsuarioID, Nombre, Tipo) VALUES
(1, 'Admin1', 'Administrador'),
(2, 'Visitante1', 'Visitante'),
(3, 'Visitante2', 'Visitante');

INSERT INTO Sala (SalaID, Nombre) VALUES
(1, 'Sala informatica'),
(2, 'Sala sistemas'),
(3, 'Sala laboratorios');

INSERT INTO Libro (LibroID, Titulo, Categoria, SalaID) VALUES
(101, 'Libro1', 'Ficción', 1),
(102, 'Libro2', 'No Ficción', 2),
(103, 'Libro3', 'Misterio', 3);

INSERT INTO Prestamo (PrestamoID, UsuarioID, LibroID, FechaPrestamo, FechaDevolucion) VALUES
(201, 2, 101, '2024-01-18', '2024-02-01'),
(202, 3, 102, '2024-01-20', '2024-02-05'),
(203, 2, 103, '2024-01-22', NULL);

select * from Prestamo;
select * from Libro;
select * from Sala;
select * from Usuario;









