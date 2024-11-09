CREATE DATABASE IF NOT EXISTS tienda_peces;
USE tienda_peces;

-- Crear tabla 'trabajadores'
CREATE TABLE IF NOT EXISTS trabajador (
    id_trabajador INT AUTO_INCREMENT PRIMARY KEY, 
    rut VARCHAR(10) NOT NULL,       -- rut trabajador               
    dv CHAR(1) NOT NULL,            -- dv del trabajador
    nombre VARCHAR(255) NOT NULL,   -- nombre del trabajador
    telefono VARCHAR(15) NOT NULL,  -- telefono del trabajador
    email VARCHAR(255) NOT NULL     -- email del trabajador
);

-- Insertar algunos trabajadores
INSERT INTO trabajador (rut, dv, nombre, telefono, email) VALUES
('12345678', '9', 'Carlos Soto', '987654321', 'carlos.soto@mail.com'),
('23456789', 'K', 'Ana Ruiz', '987654322', 'ana.ruiz@mail.com'),
('34567890', '1', 'Luis Fernández', '987654323', 'luis.fernandez@mail.com'),
('45678901', 'k', 'María Pérez', '987654324', 'maria.perez@mail.com'),
('56789012', '3', 'Pedro García', '987654325', 'pedro.garcia@mail.com');

CREATE TABLE IF NOT EXISTS usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,   -- id usuario 
    user VARCHAR(50) NOT NULL,                    -- usuario para ingresar      
    password VARCHAR(255) NOT NULL,               -- contraseña del usuario
    id_trabajador INT NOT NULL,                   -- id del trabajador
    FOREIGN KEY (id_trabajador) REFERENCES trabajador(id_trabajador) 
        ON DELETE CASCADE ON UPDATE CASCADE      
);

INSERT INTO usuario (user, password, id_trabajador) VALUES
('carlos.soto', 'password123', 1),
('ana.ruiz', 'password123', 2),
('luis.fernandez', 'password123', 3),
('maria.perez', 'password123', 4),
('pedro.garcia', 'password123', 5);

CREATE TABLE IF NOT EXISTS historial_ingresos (
    id INT AUTO_INCREMENT PRIMARY KEY,          -- id autoincrementada    
    fecha_hora_ingreso DATETIME NOT NULL,        -- fecha y hora ingreso
    fecha_hora_salida DATETIME NOT NULL,         -- fecha y hora salida
    id_trabajador INT NOT NULL,                  -- id del trabajador que ingresa o sale
    FOREIGN KEY (id_trabajador) REFERENCES trabajador(id_trabajador)
        ON DELETE CASCADE ON UPDATE CASCADE      
);

INSERT INTO historial_ingresos (fecha_hora_ingreso, fecha_hora_salida, id_trabajador) VALUES
('2024-11-06 08:00:00', '2024-11-06 17:00:00', 1),
('2024-11-06 09:00:00', '2024-11-06 18:00:00', 2),
('2024-11-06 08:30:00', '2024-11-06 17:30:00', 3),
('2024-11-06 10:00:00', '2024-11-06 19:00:00', 4),
('2024-11-06 07:45:00', '2024-11-06 16:45:00', 5);

CREATE TABLE IF NOT EXISTS cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,   -- id autoincrementado para el cliente
    rutCliente VARCHAR(10) NOT NULL,  
    dv CHAR(1) NOT NULL,                         -- RUT del cliente
    nombre_cliente VARCHAR(255) NOT NULL,        -- Nombre del cliente
    telefono_cliente VARCHAR(15) NOT NULL        -- Teléfono del cliente
);

-- Insertar clientes
INSERT INTO cliente (rutCliente, dv, nombre_cliente, telefono_cliente) VALUES
('12345678', '9', 'Juan Pérez', '987654321'),
('23456789', 'K', 'Ana López', '987654322'),
('34567890', '1', 'Luis García', '987654323'),
('45678901', '2', 'María Fernández', '987654324'),
('56789012', '3', 'Carlos Sánchez', '987654325'),
('67890123', '4', 'Elena Ramírez', '987654326'),
('78901234', '5', 'José Martínez', '987654327'),
('89012345', '6', 'Laura Díaz', '987654328'),
('90123456', '7', 'Fernando Gómez', '987654329'),
('01234567', '8', 'Isabel Ruiz', '987654330');

CREATE TABLE IF NOT EXISTS productos (
    id_producto VARCHAR(10) PRIMARY KEY,   -- Código único del pez
    color VARCHAR(100),                    -- Color (para PezTropical)
    tamaño INT,                            -- Tamaño (para PezDorado)
    edad INT,                              -- Edad (para PezKoi)
    especie VARCHAR(100) NOT NULL,         -- Especie del pez (Tropical, Dorado, Koi)
    precio INT NOT NULL,                   -- Precio del pez
    stock INT NOT NULL,                    -- Stock disponible del pez
    img VARCHAR(255)                       -- URL de la imagen
);

-- Insertar datos de PezTropical
INSERT INTO productos (id_producto, color, especie, precio, stock) VALUES
('aa01', 'Amarillo', 'Tropical', 15000, 74),
('aa02', 'Rojo', 'Tropical', 17000, 29),
('aa03', 'Verde', 'Tropical', 15250, 83),
('aa04', 'Naranjo', 'Tropical', 16500, 56),
('aa05', 'Rosado', 'Tropical', 18250, 12),
('aa06', 'Blanco y Negro', 'Tropical', 20000, 97),
('aa07', 'Azul', 'Tropical', 19750, 41);

-- Insertar datos de PezDorado
INSERT INTO productos (id_producto, tamaño, especie, precio, stock) VALUES
('ab01', 65, 'Pez Dorado', 20000, 75),
('ab02', 30, 'Pez Dorado', 15250, 45),
('ab03', 12, 'Pez Dorado', 16250, 91),
('ab04', 10, 'Pez Dorado', 19750, 47),
('ab05', 50, 'Pez Dorado', 18250, 59),
('ab06', 36, 'Pez Dorado', 12000, 22),
('ab07', 43, 'Pez Dorado', 17990, 76);

-- Insertar datos de PezKoi
INSERT INTO productos (id_producto, edad, especie, precio, stock) VALUES
('ac01', 21, 'Pez Koi', 14250, 88),
('ac02', 35, 'Pez Koi', 25000, 35),
('ac03', 30, 'Pez Koi', 20500, 51),
('ac04', 12, 'Pez Koi', 12000, 64),
('ac05', 3, 'Pez Koi', 7000, 27),
('ac06', 27, 'Pez Koi', 17250, 53);

CREATE TABLE IF NOT EXISTS venta (
    folio_venta INT AUTO_INCREMENT PRIMARY KEY,    -- código del folio que se autoincrementa y es la key
    valor_total INT NOT NULL,                       -- valor total de la venta
    cajero_id INT NOT NULL,                         -- id del cajero
    fecha_venta DATETIME NOT NULL,                  -- se almacena la fecha del sistema
    id_cliente INT NOT NULL,                        -- id del cliente que realiza la compra
    FOREIGN KEY (cajero_id) REFERENCES trabajador(id_trabajador)
        ON DELETE CASCADE ON UPDATE CASCADE,       -- relación con la tabla trabajador
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
        ON DELETE CASCADE ON UPDATE CASCADE        -- relación con la tabla cliente
);

-- Insertar 10 ventas
INSERT INTO venta (valor_total, cajero_id, fecha_venta, id_cliente) VALUES
(118000, 1, '2024-11-06 10:30:00', 1),
(125000, 1, '2024-11-06 12:00:00', 2),
(134000, 1, '2024-11-06 14:30:00', 3),
(121250, 2, '2024-11-06 16:00:00', 4),
(128000, 2, '2024-11-06 18:30:00', 5),
(130000, 3, '2024-11-07 10:00:00', 6),
(122000, 4, '2024-11-07 12:30:00', 7),
(138500, 5, '2024-11-07 15:00:00', 8),
(110000, 1, '2024-11-07 17:30:00', 9),
(119000, 3, '2024-11-07 19:00:00', 10);

CREATE TABLE IF NOT EXISTS detalle_venta (
    id_detalle_venta INT AUTO_INCREMENT PRIMARY KEY,    -- id detalle
    folio_venta INT NOT NULL,                            -- folio de venta
    id_producto VARCHAR(10) NOT NULL,                    -- id del producto
    cantidad INT NOT NULL,                               -- cantidad de productos
    precio INT NOT NULL,                                 -- precio unitario
    FOREIGN KEY (folio_venta) REFERENCES venta(folio_venta)
        ON DELETE CASCADE ON UPDATE CASCADE,            -- relación con tabla venta
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
        ON DELETE CASCADE ON UPDATE CASCADE             -- relación con tabla productos
);

-- Insertar detalles de ventas
INSERT INTO detalle_venta (folio_venta, id_producto, cantidad, precio) VALUES
(1, 'aa01', 2, 15000),
(1, 'ab01', 1, 20000),
(2, 'aa02', 1, 17000),
(2, 'ab02', 2, 15250),
(3, 'aa03', 1, 15250),
(3, 'ab03', 2, 16250),
(4, 'aa04', 1, 16500),
(4, 'ab04', 1, 19750),
(5, 'aa05', 1, 18250),
(5, 'ab05', 2, 18250);
