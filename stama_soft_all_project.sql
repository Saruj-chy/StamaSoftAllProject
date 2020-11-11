-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 11, 2020 at 07:35 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

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
-- Table structure for table `country_name`
--

CREATE TABLE `country_name` (
  `id` int(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  `image` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `country_name`
--

INSERT INTO `country_name` (`id`, `name`, `country`, `image`) VALUES
(1, 'Chittagong', 'Bangladesh', 'https://bit.ly/3n4Adpp'),
(2, 'Dilli', 'India', 'https://bit.ly/38nSqKx'),
(3, 'Istambul', 'Pakistan', 'https://bit.ly/3n82VWu'),
(4, 'Californiya', 'USA', 'https://bit.ly/3perXow'),
(5, 'Katmundu', 'Nepal', 'https://bit.ly/32vfvHh'),
(6, 'averest', 'Butan', 'https://bit.ly/36jEn5R'),
(7, 'Parish', 'France', 'https://bit.ly/3kaB4Db');

-- --------------------------------------------------------

--
-- Table structure for table `name_phone`
--

CREATE TABLE `name_phone` (
  `id` int(15) NOT NULL,
  `name` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `image` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `name_phone`
--

INSERT INTO `name_phone` (`id`, `name`, `phone`, `image`) VALUES
(1, 'Sarose Datta', '01516174937', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(2, 'Naimur', '01726174937', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(3, 'Shoubon', '01636174945', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(4, 'Nabila', '01856174998', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(5, 'Sowrav', '01726174937', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(6, 'Abidul Islam', '01726174937', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(7, 'Roky Das', '01726174937', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU'),
(8, 'Rofiqul', '01726174937', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSdxNKplD7D4F45FkdqbCWmFcYKor0bQigj6w&usqp=CAU');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `country_name`
--
ALTER TABLE `country_name`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `name_phone`
--
ALTER TABLE `name_phone`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `country_name`
--
ALTER TABLE `country_name`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `name_phone`
--
ALTER TABLE `name_phone`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
