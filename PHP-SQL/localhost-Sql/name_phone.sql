-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2021 at 10:12 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stama_soft_all_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `name_phone`
--

CREATE TABLE `name_phone` (
  `id` int(15) NOT NULL,
  `name` varchar(100) NOT NULL,
  `phone` int(255) NOT NULL,
  `image` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `name_phone`
--

INSERT INTO `name_phone` (`id`, `name`, `phone`, `image`) VALUES
(1, 'Sarose Datta', 1516174937, 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(2, 'Naimur', 1726174937, 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(3, 'Shoubon', 1636174945, 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(4, 'Nabila', 1856174998, 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(5, 'Sowrav', 1726174937, 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(6, 'Abidul Islam', 1726174937, 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(7, 'Roky Das', 1726174937, 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(8, 'Rofiqul', 1726174937, 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `name_phone`
--
ALTER TABLE `name_phone`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `name_phone`
--
ALTER TABLE `name_phone`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
