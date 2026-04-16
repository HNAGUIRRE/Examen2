CREATE DATABASE IF NOT EXISTS examen2_aguirre;
USE examen2_aguirre;
CREATE TABLE propietario (
    id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);
CREATE TABLE inmueble (
    numero INT PRIMARY KEY,
    fecha_compra DATE NOT NULL,
    estado VARCHAR(50) NOT NULL,
    propietario_id INT NOT NULL,
    CONSTRAINT fk_inmueble_propietario
    FOREIGN KEY (propietario_id) REFERENCES propietario(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);
CREATE TABLE apartamento (
    numero INT PRIMARY KEY,
    numero_piso INT NOT NULL,
    CONSTRAINT fk_apto_inmueble
    FOREIGN KEY (numero) REFERENCES inmueble(numero)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);
CREATE TABLE casa (
    numero INT PRIMARY KEY,
    cantidad_pisos INT NOT NULL,
    CONSTRAINT fk_casa_inmueble
    FOREIGN KEY (numero) REFERENCES inmueble(numero)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);
INSERT INTO propietario (id, nombre) VALUES
(1, 'Juan'),
(2, 'Carlos');

INSERT INTO inmueble (numero, fecha_compra, estado, propietario_id) VALUES
(101, '2024-01-10', 'Nuevo', 1),
(102, '2024-02-15', 'Usado', 2);

INSERT INTO apartamento (numero, numero_piso) VALUES
(101, 5);

INSERT INTO casa (numero, cantidad_pisos) VALUES
(102, 2);
SELECT * FROM propietario;
SELECT * FROM inmueble;
SELECT * FROM apartamento;
SELECT * FROM casa;
SELECT i.numero, i.estado, p.nombre
FROM inmueble i
JOIN propietario p ON i.propietario_id = p.id;