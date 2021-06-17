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
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `all_file`
--
ALTER TABLE `all_file`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=115;

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
