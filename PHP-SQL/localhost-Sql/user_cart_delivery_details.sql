-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2021 at 10:13 PM
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
-- Table structure for table `user_cart_delivery_details`
--

CREATE TABLE `user_cart_delivery_details` (
  `id` int(11) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `location` varchar(1000) NOT NULL,
  `cart_name` varchar(100) NOT NULL,
  `count` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_cart_delivery_details`
--

INSERT INTO `user_cart_delivery_details` (`id`, `user_name`, `phone`, `location`, `cart_name`, `count`) VALUES
(1, 'saruj', '', '', 'fruit', 10),
(2, 'vg', 'vc', 'cx', 'pizza', 4),
(3, 'saruj', '01516174937', 'chawkbazar, Chittagong ', 'French Fries', 3),
(4, 'saruj', '01516174937', 'chawkbazar, Chittagong ', 'Pan Cakes', 6),
(5, 'h', 'h', 'u', 'Burger', 1),
(6, 'h', 'h', 'u', 'French Fries', 4),
(7, 'h', 'h', 'u', 'Pasta', 1),
(8, 'h', 'h', 'u', 'Ice Cream', 1),
(9, 'saruj', '0178**********', 'no location, you can serve anywhere?', 'Pasta', 15),
(10, 'saruj', '0178**********', 'no location, you can serve anywhere?', 'Pan Cakes', 5),
(11, 'saruj', '0178**********', 'no location, you can serve anywhere?', 'French Fries', 3),
(12, 'saruj', '0178**********', 'no location, you can serve anywhere?', 'Ice Cream', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_cart_delivery_details`
--
ALTER TABLE `user_cart_delivery_details`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user_cart_delivery_details`
--
ALTER TABLE `user_cart_delivery_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
