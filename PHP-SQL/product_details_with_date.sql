-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2021 at 05:11 AM
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
-- Table structure for table `product_details_with_date`
--

CREATE TABLE `product_details_with_date` (
  `id` int(11) NOT NULL,
  `name` varchar(1000) NOT NULL,
  `des` varchar(1000) NOT NULL,
  `price` decimal(65,2) NOT NULL,
  `entrydate` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product_details_with_date`
--

INSERT INTO `product_details_with_date` (`id`, `name`, `des`, `price`, `entrydate`) VALUES
(1, 'Jackfruit', 'jackfruit is our national fruit', '200.00', '2021-05-01 08:55:00'),
(2, 'Manga', 'Manga is called the king of fruit.', '350.00', '2021-05-05 08:56:40'),
(3, 'Orange', 'The color of orange is the same of it\'s name', '250.00', '2021-05-12 08:57:49'),
(4, 'Guyaba', 'Guyaba is a ordinary fruit', '150.00', '2021-05-16 08:57:49'),
(5, 'Pizz', 'Pizza is a spicy food', '650.00', '2021-05-20 08:58:33'),
(6, 'Burger', 'Burger  is a spicy food.', '850.00', '2021-04-01 08:58:33'),
(7, 'Chili Chiken', 'Chili Chiken is a spicy food', '900.00', '2021-05-04 08:59:25'),
(8, 'Mutton Curry', 'Mutton Curry  is a spicy food.', '1100.00', '2021-04-07 08:59:25'),
(9, 'Realme C25 ', 'Product details of Realme C25 Smartphone - 6.5 inch - 4GB RAM - 128GB ROM - 48MP Camera', '12000.00', '2021-04-12 09:03:33'),
(10, 'Realme AirDots ', 'Wireless Earphones work by connecting, or pairing, with the device you want to use, through a radio or infrared signal. ', '550.00', '2021-04-22 09:03:33'),
(11, 'TVS Radeon 110cc', 'Product details of TVS Radeon 110cc Motor Bike', '120000.00', '2021-03-10 09:04:49'),
(12, 'TVS MAX 125 ST\r\n', 'TVS MAX 125 ST which is an “off-roader” or “dirt bike”. Special ‘Button Tyres’ for better grip in off-road conditions and on corners.', '250000.00', '2021-03-18 09:04:49'),
(13, 'Flat TV - Black\r\n', 'Product details of 32\" LED Flat TV - Black', '18000.00', '2021-03-26 09:06:19'),
(14, 'Flat TV - Blue', 'Product details of 32\" LED Flat TV - Black', '20000.00', '2021-03-31 09:06:19');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product_details_with_date`
--
ALTER TABLE `product_details_with_date`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product_details_with_date`
--
ALTER TABLE `product_details_with_date`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
