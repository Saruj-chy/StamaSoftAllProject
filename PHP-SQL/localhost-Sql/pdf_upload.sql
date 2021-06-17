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

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pdf_upload`
--
ALTER TABLE `pdf_upload`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pdf_upload`
--
ALTER TABLE `pdf_upload`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=96;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
