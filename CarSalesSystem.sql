-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 28-05-2015 a las 00:51:27
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `CarSalesSystem`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Empleado`
--

CREATE TABLE IF NOT EXISTS `Empleado` (
`id` int(10) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `tipoUsuario` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Imagen`
--

CREATE TABLE IF NOT EXISTS `Imagen` (
`id` int(10) NOT NULL,
  `ruta` varchar(1000) DEFAULT NULL,
  `idVehiculo` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Reservador`
--

CREATE TABLE IF NOT EXISTS `Reservador` (
`id` int(10) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Vehiculo`
--

CREATE TABLE IF NOT EXISTS `Vehiculo` (
`id` int(10) NOT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `ano` int(4) DEFAULT NULL,
  `kilometraje` int(10) DEFAULT NULL,
  `precio` int(10) DEFAULT NULL,
  `stock` int(5) DEFAULT NULL,
  `nuevo` int(1) DEFAULT NULL,
  `fechaIngreso` varchar(10) DEFAULT NULL,
  `detalles` varchar(3000) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Venta`
--

CREATE TABLE IF NOT EXISTS `Venta` (
`id` int(10) NOT NULL,
  `idVehiculo` int(10) NOT NULL,
  `idVendedor` int(10) DEFAULT NULL,
  `idReservador` int(10) NOT NULL,
  `estaVendido` int(1) DEFAULT NULL,
  `fechaVenta` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Empleado`
--
ALTER TABLE `Empleado`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `Imagen`
--
ALTER TABLE `Imagen`
 ADD PRIMARY KEY (`id`), ADD KEY `FKImagen533383` (`idVehiculo`);

--
-- Indices de la tabla `Reservador`
--
ALTER TABLE `Reservador`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `Vehiculo`
--
ALTER TABLE `Vehiculo`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `Venta`
--
ALTER TABLE `Venta`
 ADD PRIMARY KEY (`id`), ADD KEY `FKVenta472460` (`idVendedor`), ADD KEY `FKVenta739989` (`idReservador`), ADD KEY `FKVenta393433` (`idVehiculo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Empleado`
--
ALTER TABLE `Empleado`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `Imagen`
--
ALTER TABLE `Imagen`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `Reservador`
--
ALTER TABLE `Reservador`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `Vehiculo`
--
ALTER TABLE `Vehiculo`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `Venta`
--
ALTER TABLE `Venta`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Imagen`
--
ALTER TABLE `Imagen`
ADD CONSTRAINT `FKImagen533383` FOREIGN KEY (`idVehiculo`) REFERENCES `Vehiculo` (`id`);

--
-- Filtros para la tabla `Venta`
--
ALTER TABLE `Venta`
ADD CONSTRAINT `FKVenta393433` FOREIGN KEY (`idVehiculo`) REFERENCES `Vehiculo` (`id`),
ADD CONSTRAINT `FKVenta472460` FOREIGN KEY (`idVendedor`) REFERENCES `Empleado` (`id`),
ADD CONSTRAINT `FKVenta739989` FOREIGN KEY (`idReservador`) REFERENCES `Reservador` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
