USE master;

IF EXISTS (
    SELECT name 
    FROM sys.databases 
    WHERE name = N'dbRegistroEmpleadosCedinet'
)
BEGIN
    DROP DATABASE dbRegistroEmpleadosCedinet;
END

CREATE DATABASE dbRegistroEmpleadosCedinet;

GO

USE dbRegistroEmpleadosCedinet;

CREATE TABLE pais (
id INTEGER PRIMARY KEY IDENTITY(1,1),
nombre VARCHAR(50) NOT NULL);

CREATE TABLE area (
id INTEGER PRIMARY KEY IDENTITY(1,1),
nombre VARCHAR(50) NOT NULL);

CREATE TABLE tipo_identificacion (
id INTEGER PRIMARY KEY IDENTITY(1,1),
codigo VARCHAR(20) NOT NULL,
nombre VARCHAR(50) NOT NULL);

GO

INSERT INTO pais (nombre) VALUES 
('Colombia'),
('Estados Unidos');

GO 

INSERT INTO area (nombre) VALUES
('Administración'),
('Financiera'),
('Compras'),
('Infraestructura'),
('Operación'),
('Talento Humano'),
('Servicios Varios');

GO

INSERT INTO tipo_identificacion (codigo, nombre) VALUES
('CC', 'Cédula de Ciudadanía'),
('CE', 'Cédula de Extranjería'),
('PP', 'Pasaporte'),
('PEP', 'Permiso Especial de Permanencia');

GO

CREATE TABLE empleados (
id INTEGER PRIMARY KEY IDENTITY(1,1),
primer_apellido VARCHAR(50) NOT NULL,
segundo_apellido VARCHAR(50) NOT NULL,
primer_nombre VARCHAR(50) NOT NULL,
otros_nombres VARCHAR(50) NULL,
pais_id INTEGER NOT NULL,
tipo_identificacion_id INTEGER NOT NULL,
numero_identificacion VARCHAR(20) NOT NULL UNIQUE,
correo VARCHAR(300) NOT NULL UNIQUE,
fecha_ingreso DATE NOT NULL,
area_id INTEGER NOT NULL,
estado VARCHAR(10) NOT NULL,
-- campos de auditoria --
fecha_registro DATETIME NOT NULL DEFAULT GETDATE(),
FOREIGN KEY (pais_id) REFERENCES pais(id),
FOREIGN KEY (area_id) REFERENCES area(id),
FOREIGN KEY (tipo_identificacion_id) REFERENCES tipo_identificacion(id));

INSERT INTO empleados (
    primer_apellido, segundo_apellido, primer_nombre, otros_nombres,
    pais_id, tipo_identificacion_id, numero_identificacion,
    correo, fecha_ingreso, area_id, estado
) VALUES
('HOLGUIN', 'GOMEZ', 'SEBASTIAN', NULL, 1, 1, '1026152201', 'sebastian.holguin@cidenet.com.co', '2025-06-19', 2, 'ACTIVO'),
('RAMIREZ', 'LOPEZ', 'ANDREA', 'MARIA', 2, 3, '1234567', 'andrea.ramirez@cidenet.com.us', '2025-06-15', 1, 'ACTIVO'),
('CASTRO', 'DIAZ', 'JUAN', NULL, 1, 2, '987654321', 'juan.castro@cidenet.com.co', '2025-06-10', 4, 'ACTIVO'),
('SANCHEZ', 'MEJIA', 'ADRIANA', 'MARIA', 2, 4, '43682873', 'adriana.sanchez@cidenet.com.us', '2025-06-18', 3, 'ACTIVO'),
('MARULANDA', 'TORO', 'JENNIFER', NULL, 1, 1, '1017158775', 'jennifer.marulanda@cidenet.com.co', '2025-06-20', 6, 'ACTIVO');


