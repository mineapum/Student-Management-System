-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 08, 2021 at 09:53 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_extra`
--

CREATE TABLE `tbl_extra` (
  `id` int(11) NOT NULL,
  `p_of_study` float NOT NULL,
  `tax` float NOT NULL,
  `ex_change_rt` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_extra`
--

INSERT INTO `tbl_extra` (`id`, `p_of_study`, `tax`, `ex_change_rt`) VALUES
(1, 750, 5.5, 4000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_forgot_pass`
--

CREATE TABLE `tbl_forgot_pass` (
  `id` int(11) NOT NULL,
  `digital_code` int(6) NOT NULL,
  `expire_date_time` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_payment`
--

CREATE TABLE `tbl_payment` (
  `payment_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `for_year` varchar(1) NOT NULL,
  `pay_for` varchar(20) NOT NULL,
  `payment_date` date NOT NULL,
  `discount` varchar(5) NOT NULL,
  `amount` float NOT NULL,
  `tax` float NOT NULL,
  `total_usd` float NOT NULL,
  `total_kh` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_payment`
--

INSERT INTO `tbl_payment` (`payment_id`, `student_id`, `firstname`, `lastname`, `for_year`, `pay_for`, `payment_date`, `discount`, `amount`, `tax`, `total_usd`, `total_kh`) VALUES
(1, 1, 'Minea', 'Pum', '2', 'Year', '2021-08-02', '50%', 375, 0, 375, 1500000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_province`
--

CREATE TABLE `tbl_province` (
  `province` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_province`
--

INSERT INTO `tbl_province` (`province`) VALUES
('Banteay Meanchey'),
('Battambang'),
('Kampong Cham'),
('Kampong Chhnang'),
('Kampong Speu'),
('Kampong Thom'),
('Kampot'),
('Kandal'),
('Koh Kong'),
('Kratie'),
('Mondulkiri'),
('Mondulkiri'),
('Preah Vihear'),
('Prey Veng'),
('Pursat'),
('Ratanak Kiri'),
('Siem Reap'),
('Preah Sihanouk'),
('Stung Treng'),
('Svay Rieng'),
('Takeo'),
('Oddar Meanchey'),
('Kep'),
('Pailin'),
('Tboung Khmum');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_registration`
--

CREATE TABLE `tbl_registration` (
  `student_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dob` date NOT NULL,
  `batch` int(11) NOT NULL,
  `phone_number` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  `village` varchar(30) NOT NULL,
  `commune` varchar(30) NOT NULL,
  `district` varchar(30) NOT NULL,
  `province` varchar(30) NOT NULL,
  `photo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_registration`
--

INSERT INTO `tbl_registration` (`student_id`, `user_id`, `first_name`, `last_name`, `gender`, `dob`, `batch`, `phone_number`, `email`, `village`, `commune`, `district`, `province`, `photo`) VALUES
(1, 2, 'Minea', 'Pum', 'Male', '2021-08-01', 15, '069791403', 'Minea@gmail.com', 'BenugBaSak', 'Sambous Meas', 'Kompong Cham', 'Kampong Cham', '3ec0610d7d6d4d42a1c0f65c8bd660bd.JPG'),
(2, 2, 'Naly', 'Pum', 'Male', '2021-08-10', 15, '017243156', 'Naly@gmail.com', 'BenugBaSak', 'Sambous Meas', 'kompong cham', 'Kampong Cham', '1e02480a5f2e427fb4909353c395407d.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_score`
--

CREATE TABLE `tbl_score` (
  `socre_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  `quiz` float NOT NULL,
  `attenden` float NOT NULL,
  `midterm` float NOT NULL,
  `assignment` float NOT NULL,
  `final` float NOT NULL,
  `total` float NOT NULL,
  `for_month` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_score`
--

INSERT INTO `tbl_score` (`socre_id`, `student_id`, `subject_id`, `quiz`, `attenden`, `midterm`, `assignment`, `final`, `total`, `for_month`) VALUES
(1, 1, 1, 15, 1, 5, 4, 8, 33, '2021-08-08');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_subject`
--

CREATE TABLE `tbl_subject` (
  `subject_id` int(11) NOT NULL,
  `subjcet_name` varchar(30) NOT NULL,
  `description` varchar(30) NOT NULL,
  `teacher_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_subject`
--

INSERT INTO `tbl_subject` (`subject_id`, `subjcet_name`, `description`, `teacher_id`) VALUES
(1, 'Java Programming', 'N.A', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_teacher`
--

CREATE TABLE `tbl_teacher` (
  `teacher_id` int(11) NOT NULL,
  `teacher_name` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dob` date NOT NULL,
  `phone_number` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_teacher`
--

INSERT INTO `tbl_teacher` (`teacher_id`, `teacher_name`, `gender`, `dob`, `phone_number`, `email`) VALUES
(1, 'Chhay', 'Male', '2021-08-01', '023880880', 'chhay@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `password` varchar(50) NOT NULL,
  `status` varchar(10) NOT NULL,
  `attempt_count` int(11) NOT NULL,
  `user_lavel` varchar(10) NOT NULL,
  `birth_date` date NOT NULL,
  `user_email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `username`, `password`, `status`, `attempt_count`, `user_lavel`, `birth_date`, `user_email`) VALUES
(1, 'Sovuthy', '123', 'Active', 0, 'Admin', '1998-01-01', 'chuon.sovuthy69@gmail.com'),
(2, 'Minea', '123', 'Active', 0, 'Admin', '2021-07-01', 'minea@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_extra`
--
ALTER TABLE `tbl_extra`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_forgot_pass`
--
ALTER TABLE `tbl_forgot_pass`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  ADD PRIMARY KEY (`payment_id`),
  ADD KEY `student_id` (`student_id`);

--
-- Indexes for table `tbl_registration`
--
ALTER TABLE `tbl_registration`
  ADD PRIMARY KEY (`student_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `tbl_score`
--
ALTER TABLE `tbl_score`
  ADD PRIMARY KEY (`socre_id`),
  ADD KEY `student_id` (`student_id`),
  ADD KEY `subject_id` (`subject_id`);

--
-- Indexes for table `tbl_subject`
--
ALTER TABLE `tbl_subject`
  ADD PRIMARY KEY (`subject_id`),
  ADD KEY `teacher_id` (`teacher_id`);

--
-- Indexes for table `tbl_teacher`
--
ALTER TABLE `tbl_teacher`
  ADD PRIMARY KEY (`teacher_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_forgot_pass`
--
ALTER TABLE `tbl_forgot_pass`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  MODIFY `payment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_registration`
--
ALTER TABLE `tbl_registration`
  MODIFY `student_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_score`
--
ALTER TABLE `tbl_score`
  MODIFY `socre_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_subject`
--
ALTER TABLE `tbl_subject`
  MODIFY `subject_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_teacher`
--
ALTER TABLE `tbl_teacher`
  MODIFY `teacher_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
