-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-06-2016 a las 06:44:09
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ventas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `rut` varchar(15) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `edad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`rut`, `nombre`, `edad`) VALUES
('111', 'macarena', 24),
('221', 'Bryan', 23),
('2323', 'sjdskjd', 0),
('3434j', 'Claudia', 21),
('44444', 'Hector', 72),
('676767', 'caca', 23),
('777', 'sjdskjd', 111),
('977765', 'AKSJAK', 34),
('9865780', 'EPE', 34),
('999', 'sjdskjd', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `id` int(11) NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` int(11) NOT NULL,
  `rut_cliente` varchar(15) NOT NULL,
  `cod_producto` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`id`, `fecha`, `cantidad`, `precio`, `rut_cliente`, `cod_producto`) VALUES
(1, '05/31/2016', 2, 0, '18338', '12'),
(2, '06/01/2016', 3, 0, '3434', '54545'),
(3, '06/01/2016', 2, 0, '99', '12'),
(4, '06/01/2016', 2, 0, '99', '121212'),
(5, '06/01/2016', 9, 0, '8908856', '12'),
(6, '06/01/2016', 34, 0, '111', '12'),
(7, '06/01/2016', 3, 0, '111', '12'),
(8, '06/01/2016', 3, 0, '111', '12'),
(9, '06/01/2016', 3, 0, '111', '12'),
(10, '06/01/2016', 3, 0, '111', '12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codigo` varchar(6) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `stock` int(11) NOT NULL,
  `precio` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codigo`, `nombre`, `stock`, `precio`) VALUES
('12', 'promo 60 piezas', 23, '$11.000'),
('121212', 'promo 50 piezas', 56, '$9.000'),
('232323', 'bebida 1L', 80, ''),
('54545', 'promo bebida + 20 piezas', 23, ''),
('676767', 'pan amasado', 34, '600'),
('99', 'mantequilla', 23, '$560');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`rut`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
