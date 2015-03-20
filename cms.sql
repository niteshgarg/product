-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 20, 2015 at 11:35 AM
-- Server version: 5.5.24-log
-- PHP Version: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cms`
--

-- --------------------------------------------------------

--
-- Table structure for table `business`
--

CREATE TABLE IF NOT EXISTS `business` (
  `BUSINESS_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ACCOUNT_ID` bigint(20) DEFAULT NULL,
  `BUSINESS_NAME` varchar(255) NOT NULL,
  `BUSINESS_TITLE` varchar(255) NOT NULL,
  `BUSINESS_UUID` varchar(255) NOT NULL,
  `CONTACT_EMAILID` varchar(255) DEFAULT NULL,
  `CONTACT_NUMBER` varchar(255) DEFAULT NULL,
  `CREATION_DATE` datetime NOT NULL,
  `EXPIRY_DATE` datetime NOT NULL,
  `STATUS` int(11) NOT NULL,
  `IS_VISIBLE` bit(1) NOT NULL,
  PRIMARY KEY (`BUSINESS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `PRODUCT_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ACCOUNT_ID` bigint(20) DEFAULT NULL,
  `CREATION_DATE` datetime NOT NULL,
  `EXPIRY_DATE` datetime NOT NULL,
  `PRODUCT_DESCRIPTION` longtext NOT NULL,
  `PRODUCT_NAME` varchar(100) NOT NULL,
  `PRODUCT_UUID` bigint(20) NOT NULL,
  `STATUS` int(11) NOT NULL,
  `IS_VISIBLE` bit(1) NOT NULL,
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `product_image`
--

CREATE TABLE IF NOT EXISTS `product_image` (
  `PRODUCT_IMAGE_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `IMAGE_PATH` varchar(255) DEFAULT NULL,
  `PRODUCT_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`PRODUCT_IMAGE_ID`),
  KEY `FK426655CBA20B00E0` (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `product_image`
--
ALTER TABLE `product_image`
  ADD CONSTRAINT `FK426655CBA20B00E0` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `product` (`PRODUCT_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
