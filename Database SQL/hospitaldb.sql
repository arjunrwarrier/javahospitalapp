-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2022 at 05:49 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospitaldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `patients`
--

CREATE TABLE `patients` (
  `id` int(11) NOT NULL,
  `patientid` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
  `pincode` int(11) NOT NULL,
  `phone` bigint(20) NOT NULL,
  `symptoms` varchar(20) NOT NULL,
  `docname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patients`
--

INSERT INTO `patients` (`id`, `patientid`, `name`, `address`, `pincode`, `phone`, `symptoms`, `docname`) VALUES
(1, 100, 'Tim', 'Kottayam', 687789, 8923789078, 'cough', 'Rajesh'),
(2, 101, 'Raj', 'Alappuzha', 678978, 9067894567, 'Fever', 'Rajesh'),
(3, 102, 'Jaya', 'Kochi', 688978, 9987671245, 'Fatigue', 'Teresa'),
(4, 103, 'Harry', 'Pala', 687890, 9987671299, 'Vomitting', 'Teresa'),
(5, 104, 'Nila', 'Ernakulam', 678970, 9067894589, 'Shivering', 'Rajesh'),
(6, 105, 'Sam', 'Kollam', 678971, 9987671300, 'Rashes', 'Mohan'),
(7, 106, 'Varma', 'Kottayam', 687784, 9987671250, 'Dandruff', 'Mohan'),
(8, 107, 'Akshay', 'Mumbai', 889078, 9987671900, 'Fever', 'Rajesh'),
(9, 108, 'Vinu', 'Trivandrum', 695123, 9945783490, 'Paralysis', 'Rita'),
(10, 109, 'Jomy', 'Pala', 687783, 9945783987, 'Vomitting', 'Teresa'),
(11, 110, 'Ian', 'Kottayam', 689978, 9989789089, 'Fever', 'Rajesh'),
(12, 111, 'Sankar', 'Kochi', 684532, 9989789034, 'cough', 'Rajesh'),
(13, 112, 'Manny', 'Hyderabad', 124532, 9984569034, 'Fatigue', 'Teresa'),
(14, 113, 'Sid', 'Delhi', 124512, 9984512334, 'Vomitting', 'Teresa'),
(15, 114, 'Diego', 'Pune', 127812, 8976451233, 'BodyPain', 'Rajesh'),
(16, 115, 'Sanju', 'Chennai', 567812, 7976451233, 'EyePain', 'Mohan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patients`
--
ALTER TABLE `patients`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `patients`
--
ALTER TABLE `patients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
