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

--
-- Indexes for dumped tables
--

--
-- Indexes for table `food_price`
--
ALTER TABLE `food_price`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `food_price`
--
ALTER TABLE `food_price`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
