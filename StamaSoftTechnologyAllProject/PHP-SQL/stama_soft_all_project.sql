-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 18, 2021 at 02:08 PM
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
-- Table structure for table `all_file`
--

CREATE TABLE `all_file` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `url` varchar(1000) NOT NULL,
  `file_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `all_file`
--

INSERT INTO `all_file` (`id`, `name`, `url`, `file_id`) VALUES
(111, '2nd-sem-exam-2019.pdf', 'http://192.168.1.5/android/StamaSoft_Technology/pdf_upload_download/allFile/2nd-sem-exam-2019.pdf', 1),
(112, 'S5._RFV-06.10.docx', 'http://192.168.1.5/android/StamaSoft_Technology/pdf_upload_download/allFile/S5._RFV-06.10.docx', 2),
(113, '2Full Video- Ek Do Teen Film Version.mp3', 'http://192.168.1.5/android/StamaSoft_Technology/pdf_upload_download/allFile/2Full Video- Ek Do Teen Film Version.mp3', 3),
(114, 'vidma_recorder_17012021_091425.mp4', 'http://192.168.1.5/android/StamaSoft_Technology/pdf_upload_download/allFile/vidma_recorder_17012021_091425.mp4', 4);

-- --------------------------------------------------------

--
-- Table structure for table `all_file_name`
--

CREATE TABLE `all_file_name` (
  `file_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `all_file_name`
--

INSERT INTO `all_file_name` (`file_id`, `name`) VALUES
(1, 'pdf'),
(2, 'docx'),
(3, 'audio'),
(4, 'video');

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
-- Table structure for table `food_price`
--

CREATE TABLE `food_price` (
  `id` int(100) NOT NULL,
  `name` varchar(1000) NOT NULL,
  `price` decimal(55,2) NOT NULL,
  `image` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `food_price`
--

INSERT INTO `food_price` (`id`, `name`, `price`, `image`) VALUES
(1, 'Pasta', '120.50', 'https://www.listchallenges.com/f/items/57fc372f-9ae7-44e7-b35d-68c8d5bd8df0.jpg'),
(2, 'French Fries', '250.00', 'https://www.listchallenges.com/f/items/f50faefe-c33e-4cf8-af58-e1ac706037a6.jpg'),
(3, 'Ice Cream', '100.00', 'https://www.listchallenges.com/f/items/392e5f56-d7de-43e5-9c52-cf733bf1b50f.jpg'),
(4, 'Pan Cakes', '250.50', 'https://www.listchallenges.com/f/items/bc00e0dc-7106-495f-b552-e66dd6e7bd48.jpg'),
(5, 'Burger', '25.00', 'https://www.listchallenges.com/f/items/d7e7dd13-3215-452a-ab68-ac773aef252f.jpg'),
(6, 'Pizza ', '500.00', 'https://www.listchallenges.com/f/items/e8bd412f-c092-4e68-8de9-c0d9710acf0d.jpg'),
(7, 'Pumpkin Pie', '97.00', 'https://www.listchallenges.com/f/items/18b75101-e6f2-4871-9ba5-b73ccb5af982.jpg'),
(8, 'Chicken Pot Pie', '999.00', 'https://www.listchallenges.com/f/items/e06f16cb-b070-41ca-b76b-57d049907991.jpg'),
(9, 'Apple Pie', '222.00', 'https://www.listchallenges.com/f/items/de6fa648-c131-4fe5-b7b3-93aba37f8393.jpg'),
(10, 'Bagel', '54.00', 'https://www.listchallenges.com/f/items/eccbec53-118d-4ba9-b366-4b04a314250f.jpg'),
(11, 'Muffins', '233.99', 'https://www.listchallenges.com/f/items/19e42544-47ce-4e1d-b02c-9090a4eb7da3.jpg'),
(12, 'Ice Cream Cake', '449.00', 'https://www.listchallenges.com/f/items/e85931a3-4545-4506-b180-e45ef8b4ce4c.jpg'),
(13, 'Chece Cake', '333.88', 'https://www.listchallenges.com/f/items/8e94cdde-9960-4486-a1e7-37904b4315b9.jpg'),
(14, 'Cheetos', '1200.66', 'https://www.listchallenges.com/f/items/1111b971-2ed7-46b3-934d-0a11d476da84.jpg'),
(15, 'Tacos', '777.00', 'https://www.listchallenges.com/f/items/2ab012b4-8cfe-4ff9-adf5-3d455d1b4f25.jpg'),
(16, 'Pasta extra', '120.50', 'https://www.listchallenges.com/f/items/57fc372f-9ae7-44e7-b35d-68c8d5bd8df0.jpg'),
(17, 'French Fries extra', '250.00', 'https://www.listchallenges.com/f/items/f50faefe-c33e-4cf8-af58-e1ac706037a6.jpg'),
(18, 'Ice Cream extra', '100.00', 'https://www.listchallenges.com/f/items/392e5f56-d7de-43e5-9c52-cf733bf1b50f.jpg'),
(20, 'Pan Cakes extra', '250.50', 'https://www.listchallenges.com/f/items/bc00e0dc-7106-495f-b552-e66dd6e7bd48.jpg'),
(21, 'Burger extra', '25.00', 'https://www.listchallenges.com/f/items/d7e7dd13-3215-452a-ab68-ac773aef252f.jpg'),
(22, 'Pizza  extra', '500.00', 'https://www.listchallenges.com/f/items/e8bd412f-c092-4e68-8de9-c0d9710acf0d.jpg'),
(23, 'Pumpkin Pie extra', '97.00', 'https://www.listchallenges.com/f/items/18b75101-e6f2-4871-9ba5-b73ccb5af982.jpg'),
(24, 'Chicken Pot Pie extra', '999.00', 'https://www.listchallenges.com/f/items/e06f16cb-b070-41ca-b76b-57d049907991.jpg'),
(25, 'Apple Pie extra', '222.00', 'https://www.listchallenges.com/f/items/de6fa648-c131-4fe5-b7b3-93aba37f8393.jpg'),
(26, 'Bagel extra', '54.00', 'https://www.listchallenges.com/f/items/eccbec53-118d-4ba9-b366-4b04a314250f.jpg'),
(27, 'Muffins extra', '233.99', 'https://www.listchallenges.com/f/items/19e42544-47ce-4e1d-b02c-9090a4eb7da3.jpg'),
(28, 'Ice Cream Cake extra', '449.00', 'https://www.listchallenges.com/f/items/e85931a3-4545-4506-b180-e45ef8b4ce4c.jpg'),
(29, 'Chece Cake extra', '333.88', 'https://www.listchallenges.com/f/items/8e94cdde-9960-4486-a1e7-37904b4315b9.jpg'),
(30, 'Cheetos extra', '1200.66', 'https://www.listchallenges.com/f/items/1111b971-2ed7-46b3-934d-0a11d476da84.jpg'),
(31, 'Tacos extra', '777.00', 'https://www.listchallenges.com/f/items/2ab012b4-8cfe-4ff9-adf5-3d455d1b4f25.jpg'),
(32, 'Briyaniextra', '100.00', 'https://www.listchallenges.com/f/items/2ab012b4-8cfe-4ff9-adf5-3d455d1b4f25.jpg'),
(33, 'Pasta masala', '120.50', 'https://www.listchallenges.com/f/items/57fc372f-9ae7-44e7-b35d-68c8d5bd8df0.jpg'),
(34, 'French Fries masala', '250.00', 'https://www.listchallenges.com/f/items/f50faefe-c33e-4cf8-af58-e1ac706037a6.jpg'),
(35, 'Ice Cream masala', '100.00', 'https://www.listchallenges.com/f/items/392e5f56-d7de-43e5-9c52-cf733bf1b50f.jpg'),
(36, 'Pan Cakes masala', '250.50', 'https://www.listchallenges.com/f/items/bc00e0dc-7106-495f-b552-e66dd6e7bd48.jpg'),
(37, 'Burger masala', '25.00', 'https://www.listchallenges.com/f/items/d7e7dd13-3215-452a-ab68-ac773aef252f.jpg'),
(38, 'Pizza  masala', '500.00', 'https://www.listchallenges.com/f/items/e8bd412f-c092-4e68-8de9-c0d9710acf0d.jpg'),
(39, 'Pumpkin Pie masala', '97.00', 'https://www.listchallenges.com/f/items/18b75101-e6f2-4871-9ba5-b73ccb5af982.jpg'),
(40, 'Chicken Pot Pie masala', '999.00', 'https://www.listchallenges.com/f/items/e06f16cb-b070-41ca-b76b-57d049907991.jpg'),
(41, 'Apple Pie masala', '222.00', 'https://www.listchallenges.com/f/items/de6fa648-c131-4fe5-b7b3-93aba37f8393.jpg'),
(42, 'Bagel masala', '54.00', 'https://www.listchallenges.com/f/items/eccbec53-118d-4ba9-b366-4b04a314250f.jpg'),
(43, 'Muffins masala', '233.99', 'https://www.listchallenges.com/f/items/19e42544-47ce-4e1d-b02c-9090a4eb7da3.jpg'),
(44, 'Ice Cream Cake masala', '449.00', 'https://www.listchallenges.com/f/items/e85931a3-4545-4506-b180-e45ef8b4ce4c.jpg'),
(45, 'Chece Cake masala', '333.88', 'https://www.listchallenges.com/f/items/8e94cdde-9960-4486-a1e7-37904b4315b9.jpg'),
(46, 'Cheetos masala', '1200.66', 'https://www.listchallenges.com/f/items/1111b971-2ed7-46b3-934d-0a11d476da84.jpg'),
(47, 'Tacos masala', '777.00', 'https://www.listchallenges.com/f/items/2ab012b4-8cfe-4ff9-adf5-3d455d1b4f25.jpg'),
(48, 'Pasta chili masala', '120.50', 'https://www.listchallenges.com/f/items/57fc372f-9ae7-44e7-b35d-68c8d5bd8df0.jpg'),
(49, 'French Fries chili masala', '250.00', 'https://www.listchallenges.com/f/items/f50faefe-c33e-4cf8-af58-e1ac706037a6.jpg'),
(50, 'Ice Cream chili masala', '100.00', 'https://www.listchallenges.com/f/items/392e5f56-d7de-43e5-9c52-cf733bf1b50f.jpg'),
(51, 'Pan Cakes chili masala', '250.50', 'https://www.listchallenges.com/f/items/bc00e0dc-7106-495f-b552-e66dd6e7bd48.jpg'),
(52, 'Burger  chili masala', '25.00', 'https://www.listchallenges.com/f/items/d7e7dd13-3215-452a-ab68-ac773aef252f.jpg'),
(53, 'Pizza   chili masala', '500.00', 'https://www.listchallenges.com/f/items/e8bd412f-c092-4e68-8de9-c0d9710acf0d.jpg'),
(54, 'Pumpkin Pie  chili masala', '97.00', 'https://www.listchallenges.com/f/items/18b75101-e6f2-4871-9ba5-b73ccb5af982.jpg'),
(55, 'Chicken Pot Pie  chili masala', '999.00', 'https://www.listchallenges.com/f/items/e06f16cb-b070-41ca-b76b-57d049907991.jpg'),
(56, 'Apple Pie  chili masala', '222.00', 'https://www.listchallenges.com/f/items/de6fa648-c131-4fe5-b7b3-93aba37f8393.jpg'),
(57, 'Bagel chili masala', '54.00', 'https://www.listchallenges.com/f/items/eccbec53-118d-4ba9-b366-4b04a314250f.jpg'),
(58, 'Muffins chili masala', '233.99', 'https://www.listchallenges.com/f/items/19e42544-47ce-4e1d-b02c-9090a4eb7da3.jpg'),
(59, 'Ice Cream Cake chili masala', '449.00', 'https://www.listchallenges.com/f/items/e85931a3-4545-4506-b180-e45ef8b4ce4c.jpg'),
(60, 'Chece Cake chili masala', '333.88', 'https://www.listchallenges.com/f/items/8e94cdde-9960-4486-a1e7-37904b4315b9.jpg'),
(61, 'Cheetos chili masala', '1200.66', 'https://www.listchallenges.com/f/items/1111b971-2ed7-46b3-934d-0a11d476da84.jpg'),
(62, 'Tacos chili masala', '777.00', 'https://www.listchallenges.com/f/items/2ab012b4-8cfe-4ff9-adf5-3d455d1b4f25.jpg'),
(63, 'Briyani chili masala', '100.00', 'https://www.listchallenges.com/f/items/2ab012b4-8cfe-4ff9-adf5-3d455d1b4f25.jpg'),
(64, 'Pasta extra chili masala', '120.50', 'https://www.listchallenges.com/f/items/57fc372f-9ae7-44e7-b35d-68c8d5bd8df0.jpg'),
(65, 'French Fries extra chili masala', '250.00', 'https://www.listchallenges.com/f/items/f50faefe-c33e-4cf8-af58-e1ac706037a6.jpg'),
(66, 'Ice Cream extra chili masala', '100.00', 'https://www.listchallenges.com/f/items/392e5f56-d7de-43e5-9c52-cf733bf1b50f.jpg'),
(67, 'Pumpkin Pie extra chili masala', '97.00', 'https://www.listchallenges.com/f/items/18b75101-e6f2-4871-9ba5-b73ccb5af982.jpg'),
(68, 'Chicken Pot Pie extra chili masala', '999.00', 'https://www.listchallenges.com/f/items/e06f16cb-b070-41ca-b76b-57d049907991.jpg'),
(69, 'Apple Pie extra chili masala', '222.00', 'https://www.listchallenges.com/f/items/de6fa648-c131-4fe5-b7b3-93aba37f8393.jpg'),
(70, 'Bagel extra chili masala', '54.00', 'https://www.listchallenges.com/f/items/eccbec53-118d-4ba9-b366-4b04a314250f.jpg'),
(71, 'Muffins  extra chili masala', '233.99', 'https://www.listchallenges.com/f/items/19e42544-47ce-4e1d-b02c-9090a4eb7da3.jpg'),
(72, 'Ice Cream Cake extra chili masala', '449.00', 'https://www.listchallenges.com/f/items/e85931a3-4545-4506-b180-e45ef8b4ce4c.jpg'),
(73, 'Chece Cake extra chili masala', '333.88', 'https://www.listchallenges.com/f/items/8e94cdde-9960-4486-a1e7-37904b4315b9.jpg'),
(74, 'Cheetos extra chili masala', '1200.66', 'https://www.listchallenges.com/f/items/1111b971-2ed7-46b3-934d-0a11d476da84.jpg'),
(75, 'Tacos extra chili masala', '777.00', 'https://www.listchallenges.com/f/items/2ab012b4-8cfe-4ff9-adf5-3d455d1b4f25.jpg'),
(76, 'Pasta extra chili ', '120.50', 'https://www.listchallenges.com/f/items/57fc372f-9ae7-44e7-b35d-68c8d5bd8df0.jpg'),
(77, 'French Fries extra chili ', '250.00', 'https://www.listchallenges.com/f/items/f50faefe-c33e-4cf8-af58-e1ac706037a6.jpg'),
(78, 'Ice Cream extra chili ', '100.00', 'https://www.listchallenges.com/f/items/392e5f56-d7de-43e5-9c52-cf733bf1b50f.jpg'),
(80, 'Pan Cakes extra chili ', '250.50', 'https://www.listchallenges.com/f/items/bc00e0dc-7106-495f-b552-e66dd6e7bd48.jpg'),
(81, 'Burger extra chili', '25.00', 'https://www.listchallenges.com/f/items/d7e7dd13-3215-452a-ab68-ac773aef252f.jpg'),
(82, 'Pizza  extra chili', '500.00', 'https://www.listchallenges.com/f/items/e8bd412f-c092-4e68-8de9-c0d9710acf0d.jpg'),
(83, 'Pumpkin Pie extra chili', '97.00', 'https://www.listchallenges.com/f/items/18b75101-e6f2-4871-9ba5-b73ccb5af982.jpg'),
(84, 'Chicken Pot Pie extra chili', '999.00', 'https://www.listchallenges.com/f/items/e06f16cb-b070-41ca-b76b-57d049907991.jpg'),
(85, 'Apple Pie extra chili', '222.00', 'https://www.listchallenges.com/f/items/de6fa648-c131-4fe5-b7b3-93aba37f8393.jpg'),
(86, 'Bagel extra chili ', '54.00', 'https://www.listchallenges.com/f/items/eccbec53-118d-4ba9-b366-4b04a314250f.jpg'),
(87, 'Muffins extra chili', '233.99', 'https://www.listchallenges.com/f/items/19e42544-47ce-4e1d-b02c-9090a4eb7da3.jpg'),
(88, 'Ice Cream Cake extra chili', '449.00', 'https://www.listchallenges.com/f/items/e85931a3-4545-4506-b180-e45ef8b4ce4c.jpg'),
(89, 'Chece Cake extra chili', '333.88', 'https://www.listchallenges.com/f/items/8e94cdde-9960-4486-a1e7-37904b4315b9.jpg'),
(90, 'Cheetos extra chili', '1200.66', 'https://www.listchallenges.com/f/items/1111b971-2ed7-46b3-934d-0a11d476da84.jpg'),
(91, 'Tacos extra chili', '777.00', 'https://www.listchallenges.com/f/items/2ab012b4-8cfe-4ff9-adf5-3d455d1b4f25.jpg'),
(92, 'Briyani extra chili', '100.00', 'https://www.listchallenges.com/f/items/2ab012b4-8cfe-4ff9-adf5-3d455d1b4f25.jpg');

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

-- --------------------------------------------------------

--
-- Table structure for table `notestacker`
--

CREATE TABLE `notestacker` (
  `id` int(11) NOT NULL,
  `url` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `pdf_upload`
--

CREATE TABLE `pdf_upload` (
  `id` int(11) NOT NULL,
  `url` varchar(1000) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pdf_upload`
--

INSERT INTO `pdf_upload` (`id`, `url`, `name`) VALUES
(94, 'http://192.168.1.5/android/StamaSoft_Technology/pdf_upload_download/pdfHolder/local_media.pdf', 'local_media.pdf'),
(95, 'http://192.168.1.5/android/StamaSoft_Technology/pdf_upload_download/pdfHolder/2nd-sem-exam-2019.pdf', '2nd-sem-exam-2019.pdf');

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

-- --------------------------------------------------------

--
-- Table structure for table `user_email_check`
--

CREATE TABLE `user_email_check` (
  `id` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_email_check`
--

INSERT INTO `user_email_check` (`id`, `email`, `password`) VALUES
(1, 'saruj.chy222@gmail.com', '123456'),
(2, 'durjoy.chy222@gmail.com', '123456'),
(3, 'nishan@gmail.com', '123456'),
(4, 'nishan123@gmail.com', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `user_table`
--

CREATE TABLE `user_table` (
  `id` int(15) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `phone` int(50) NOT NULL,
  `location` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_table`
--

INSERT INTO `user_table` (`id`, `user_name`, `password`, `phone`, `location`) VALUES
(1, 'saruj', '123456', 1516174937, 'chittagong'),
(2, 'user', '123456', 1812493724, 'chattogram'),
(3, 'user2', '123456', 1516174937, 'chittagong'),
(4, 'user3', '123456', 1812493724, 'chattogram');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `all_file`
--
ALTER TABLE `all_file`
  ADD PRIMARY KEY (`id`),
  ADD KEY `file_id` (`file_id`);

--
-- Indexes for table `all_file_name`
--
ALTER TABLE `all_file_name`
  ADD PRIMARY KEY (`file_id`);

--
-- Indexes for table `country_name`
--
ALTER TABLE `country_name`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `food_price`
--
ALTER TABLE `food_price`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `name_phone`
--
ALTER TABLE `name_phone`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `notestacker`
--
ALTER TABLE `notestacker`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pdf_upload`
--
ALTER TABLE `pdf_upload`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_cart_delivery_details`
--
ALTER TABLE `user_cart_delivery_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_email_check`
--
ALTER TABLE `user_email_check`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_table`
--
ALTER TABLE `user_table`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `all_file`
--
ALTER TABLE `all_file`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=115;

--
-- AUTO_INCREMENT for table `all_file_name`
--
ALTER TABLE `all_file_name`
  MODIFY `file_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `country_name`
--
ALTER TABLE `country_name`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `food_price`
--
ALTER TABLE `food_price`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- AUTO_INCREMENT for table `name_phone`
--
ALTER TABLE `name_phone`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `notestacker`
--
ALTER TABLE `notestacker`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pdf_upload`
--
ALTER TABLE `pdf_upload`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=96;

--
-- AUTO_INCREMENT for table `user_cart_delivery_details`
--
ALTER TABLE `user_cart_delivery_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `user_email_check`
--
ALTER TABLE `user_email_check`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user_table`
--
ALTER TABLE `user_table`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `all_file`
--
ALTER TABLE `all_file`
  ADD CONSTRAINT `all_file_ibfk_1` FOREIGN KEY (`file_id`) REFERENCES `all_file_name` (`file_id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
