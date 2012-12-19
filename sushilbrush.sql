-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 25, 2012 at 08:22 AM
-- Server version: 5.5.20
-- PHP Version: 5.3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sushilbrush`
--

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype`
--

CREATE TABLE IF NOT EXISTS `brushrawtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `brushrawtype`
--

INSERT INTO `brushrawtype` (`id`, `name`) VALUES
(1, 'Hallow Nylon'),
(2, 'Pure Bristle'),
(3, 'Zoom'),
(4, 'Black IMB'),
(5, 'Ultima Nylon'),
(6, 'Magic'),
(7, 'Ultra Mix'),
(8, 'Plastic Handle'),
(9, 'Plastic Handle Heavy'),
(10, 'Ferule');

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype_1`
--

CREATE TABLE IF NOT EXISTS `brushrawtype_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `brushrawtype_1`
--

INSERT INTO `brushrawtype_1` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '13.0'),
(2, 'Dolomite 500 ms', '10');

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype_2`
--

CREATE TABLE IF NOT EXISTS `brushrawtype_2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `brushrawtype_2`
--

INSERT INTO `brushrawtype_2` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '10'),
(2, 'Dolomite 500 ms', '10');

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype_3`
--

CREATE TABLE IF NOT EXISTS `brushrawtype_3` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `brushrawtype_3`
--

INSERT INTO `brushrawtype_3` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '10'),
(2, 'Dolomite 500 ms', '13.5');

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype_4`
--

CREATE TABLE IF NOT EXISTS `brushrawtype_4` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `brushrawtype_4`
--

INSERT INTO `brushrawtype_4` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '6.0'),
(2, 'Dolomite 500 ms', '10');

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype_5`
--

CREATE TABLE IF NOT EXISTS `brushrawtype_5` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `brushrawtype_5`
--

INSERT INTO `brushrawtype_5` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '10'),
(2, 'Dolomite 500 ms', '10');

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype_6`
--

CREATE TABLE IF NOT EXISTS `brushrawtype_6` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `brushrawtype_6`
--

INSERT INTO `brushrawtype_6` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '10'),
(2, 'Dolomite 500 ms', '14.0');

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype_7`
--

CREATE TABLE IF NOT EXISTS `brushrawtype_7` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `brushrawtype_7`
--

INSERT INTO `brushrawtype_7` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '18.0'),
(2, 'Dolomite 500 ms', '13.5');

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype_8`
--

CREATE TABLE IF NOT EXISTS `brushrawtype_8` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `brushrawtype_8`
--

INSERT INTO `brushrawtype_8` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '10'),
(2, 'Dolomite 500 ms', '10');

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype_9`
--

CREATE TABLE IF NOT EXISTS `brushrawtype_9` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `brushrawtype_9`
--

INSERT INTO `brushrawtype_9` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '17.7'),
(2, 'Dolomite 500 ms', '10');

-- --------------------------------------------------------

--
-- Table structure for table `brushrawtype_10`
--

CREATE TABLE IF NOT EXISTS `brushrawtype_10` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `brushrawtype_10`
--

INSERT INTO `brushrawtype_10` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '5.0'),
(2, 'Dolomite 500 ms', '10');

-- --------------------------------------------------------

--
-- Table structure for table `firmspurchasebrush`
--

CREATE TABLE IF NOT EXISTS `firmspurchasebrush` (
  `firmid` int(11) NOT NULL AUTO_INCREMENT,
  `firmname` varchar(30) NOT NULL,
  PRIMARY KEY (`firmid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `firmspurchasebrush`
--

INSERT INTO `firmspurchasebrush` (`firmid`, `firmname`) VALUES
(2, 'rty'),
(3, 'kanishk'),
(4, 'fff'),
(5, 'Nitpal Production Ltd'),
(6, 'nitpal'),
(7, 'nitsal'),
(8, 'Nitpal Soluction Ltd'),
(9, 'sushant producton ltd');

-- --------------------------------------------------------

--
-- Table structure for table `firmspurchasepaint`
--

CREATE TABLE IF NOT EXISTS `firmspurchasepaint` (
  `firmid` int(11) NOT NULL AUTO_INCREMENT,
  `firmname` varchar(30) NOT NULL,
  PRIMARY KEY (`firmid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `firmspurchasepaint`
--

INSERT INTO `firmspurchasepaint` (`firmid`, `firmname`) VALUES
(1, 'hey'),
(2, 'rty'),
(3, 'kanishk'),
(4, 'fff'),
(5, 'Nitpal Production Ltd'),
(6, 'nitpal'),
(7, 'nitsal'),
(8, 'Nitpal Soluction Ltd'),
(9, 'sushant producton ltd');

-- --------------------------------------------------------

--
-- Table structure for table `firmssale`
--

CREATE TABLE IF NOT EXISTS `firmssale` (
  `firmid` int(11) NOT NULL AUTO_INCREMENT,
  `firmname` varchar(30) NOT NULL,
  PRIMARY KEY (`firmid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `firmssale`
--

INSERT INTO `firmssale` (`firmid`, `firmname`) VALUES
(1, 'hey'),
(2, 'rty'),
(3, 'kanishk'),
(4, 'fff'),
(5, 'Nitpal Production Ltd'),
(6, 'nitpal'),
(7, 'nitsal'),
(8, 'Nitpal Soluction Ltd'),
(9, 'sushant producton ltd'),
(10, 'Priyanshu Material Ltd');

-- --------------------------------------------------------

--
-- Table structure for table `mfgbrushes`
--

CREATE TABLE IF NOT EXISTS `mfgbrushes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `mfgbrushes`
--

INSERT INTO `mfgbrushes` (`id`, `name`, `quantity`) VALUES
(2, 'Binder', '2.0'),
(3, 'Empty Container', '13.0'),
(4, 'Empty Bags', '-3.5');

-- --------------------------------------------------------

--
-- Table structure for table `mfgpaints`
--

CREATE TABLE IF NOT EXISTS `mfgpaints` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `mfgpaints`
--

INSERT INTO `mfgpaints` (`id`, `name`, `quantity`) VALUES
(1, 'Raw Material', '14.52'),
(2, 'Binder', '-0.20000029'),
(3, 'Empty Container', '-15.700001'),
(4, 'Empty Bags', '10');

-- --------------------------------------------------------

--
-- Table structure for table `paintrawtype`
--

CREATE TABLE IF NOT EXISTS `paintrawtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `paintrawtype`
--

INSERT INTO `paintrawtype` (`id`, `name`) VALUES
(1, 'Raw Material'),
(2, 'Binder'),
(3, 'Empty Container'),
(4, 'Empty Bags');

-- --------------------------------------------------------

--
-- Table structure for table `paintrawtype_1`
--

CREATE TABLE IF NOT EXISTS `paintrawtype_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `paintrawtype_1`
--

INSERT INTO `paintrawtype_1` (`id`, `name`, `quantity`) VALUES
(1, 'Dolomite 300 ms', '13.0'),
(2, 'Dolomite 500 ms', '10');

-- --------------------------------------------------------

--
-- Table structure for table `paintrawtype_2`
--

CREATE TABLE IF NOT EXISTS `paintrawtype_2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `paintrawtype_2`
--

INSERT INTO `paintrawtype_2` (`id`, `name`, `quantity`) VALUES
(1, 'Binder 6450', '10'),
(2, 'Binder 7650', '10');

-- --------------------------------------------------------

--
-- Table structure for table `paintrawtype_3`
--

CREATE TABLE IF NOT EXISTS `paintrawtype_3` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `paintrawtype_3`
--

INSERT INTO `paintrawtype_3` (`id`, `name`, `quantity`) VALUES
(1, 'Cementprimer 20l', '13.0'),
(2, 'Cementprimer 10l', '10');

-- --------------------------------------------------------

--
-- Table structure for table `paintrawtype_4`
--

CREATE TABLE IF NOT EXISTS `paintrawtype_4` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `paintrawtype_4`
--

INSERT INTO `paintrawtype_4` (`id`, `name`, `quantity`) VALUES
(1, 'Fylcen Bag 20 KG', '10'),
(2, 'Flycem Bag 25kg', '5.0');

-- --------------------------------------------------------

--
-- Table structure for table `production_goods`
--

CREATE TABLE IF NOT EXISTS `production_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` text NOT NULL,
  `name` text NOT NULL,
  `quantity` text NOT NULL,
  `dop` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `production_goods`
--

INSERT INTO `production_goods` (`id`, `type`, `name`, `quantity`, `dop`) VALUES
(1, '0', 'Binder', '3.0', '2011-04-03'),
(2, '0', 'Empty Container', '3.0', '2011-04-03'),
(3, '1', 'Raw Material', '4.52', '2011-04-03');

-- --------------------------------------------------------

--
-- Table structure for table `production_materials`
--

CREATE TABLE IF NOT EXISTS `production_materials` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` text NOT NULL,
  `typematerial` text NOT NULL,
  `name` text NOT NULL,
  `quantity` text NOT NULL,
  `dop` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `production_materials`
--

INSERT INTO `production_materials` (`id`, `type`, `typematerial`, `name`, `quantity`, `dop`) VALUES
(3, '0', '7', 'Dolomite 300 ms', '3.0', '2011-04-03'),
(4, '1', 'Binders', 'Binder 6450', '3.0', '2011-04-03'),
(5, '0', '4', 'Dolomite 300 ms', '4.0', '2011-04-03'),
(6, '1', 'Empty Bags', 'Flycem Bag 25kg', '5.0', '2011-04-03'),
(7, '0', '10', 'Dolomite 300 ms', '5.0', '2011-04-03');

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE IF NOT EXISTS `purchase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` text NOT NULL,
  `firmname` text NOT NULL,
  `amount` text NOT NULL,
  `dop` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=25 ;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`id`, `type`, `firmname`, `amount`, `dop`) VALUES
(1, '0', 'rty', '2.0', '2011-03-03'),
(16, '0', 'rty', '361.6', '2011-04-07'),
(17, '0', 'rty', '361.6', '2011-03-04'),
(18, '0', 'rty', '158.2', '2011-03-04'),
(19, '0', 'rty', '361.6', '2011-03-04'),
(20, '0', 'rty', '294.0', '2011-04-03'),
(21, '1', 'hey', '316.4', '2011-04-05'),
(22, '0', 'rty', '316.4', '2011-04-03'),
(23, '0', 'rty', '350.0', '2011-04-03'),
(24, '1', 'hey', '21.0', '2011-04-03');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_1`
--

CREATE TABLE IF NOT EXISTS `purchase_1` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_1`
--

INSERT INTO `purchase_1` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 5, 'Dolomite 300 ms', '1', '1'),
(2, 7, 'Dolomite 500 ms', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_2`
--

CREATE TABLE IF NOT EXISTS `purchase_2` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_2`
--

INSERT INTO `purchase_2` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_3`
--

CREATE TABLE IF NOT EXISTS `purchase_3` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_3`
--

INSERT INTO `purchase_3` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_4`
--

CREATE TABLE IF NOT EXISTS `purchase_4` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_4`
--

INSERT INTO `purchase_4` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_5`
--

CREATE TABLE IF NOT EXISTS `purchase_5` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_5`
--

INSERT INTO `purchase_5` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_6`
--

CREATE TABLE IF NOT EXISTS `purchase_6` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_6`
--

INSERT INTO `purchase_6` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_7`
--

CREATE TABLE IF NOT EXISTS `purchase_7` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_7`
--

INSERT INTO `purchase_7` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_8`
--

CREATE TABLE IF NOT EXISTS `purchase_8` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_8`
--

INSERT INTO `purchase_8` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_9`
--

CREATE TABLE IF NOT EXISTS `purchase_9` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_9`
--

INSERT INTO `purchase_9` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_10`
--

CREATE TABLE IF NOT EXISTS `purchase_10` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_10`
--

INSERT INTO `purchase_10` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_11`
--

CREATE TABLE IF NOT EXISTS `purchase_11` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_11`
--

INSERT INTO `purchase_11` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_12`
--

CREATE TABLE IF NOT EXISTS `purchase_12` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_12`
--

INSERT INTO `purchase_12` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_13`
--

CREATE TABLE IF NOT EXISTS `purchase_13` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_13`
--

INSERT INTO `purchase_13` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_14`
--

CREATE TABLE IF NOT EXISTS `purchase_14` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_14`
--

INSERT INTO `purchase_14` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_15`
--

CREATE TABLE IF NOT EXISTS `purchase_15` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_15`
--

INSERT INTO `purchase_15` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_16`
--

CREATE TABLE IF NOT EXISTS `purchase_16` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_16`
--

INSERT INTO `purchase_16` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 300 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_17`
--

CREATE TABLE IF NOT EXISTS `purchase_17` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_17`
--

INSERT INTO `purchase_17` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 500 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_18`
--

CREATE TABLE IF NOT EXISTS `purchase_18` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `purchase_18`
--

INSERT INTO `purchase_18` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 7, 'Dolomite 300 ms', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_19`
--

CREATE TABLE IF NOT EXISTS `purchase_19` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_19`
--

INSERT INTO `purchase_19` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 3, 'Dolomite 500 ms', '45.2', '3.50'),
(2, 7, 'Dolomite 300 ms', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_20`
--

CREATE TABLE IF NOT EXISTS `purchase_20` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_20`
--

INSERT INTO `purchase_20` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 11, 'Dolomite 300 ms', '40.0', '4.20'),
(2, 9, 'Dolomite 300 ms', '30.0', '4.20');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_22`
--

CREATE TABLE IF NOT EXISTS `purchase_22` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `typetext` text,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_22`
--

INSERT INTO `purchase_22` (`id`, `type`, `typetext`, `name`, `price`, `quantity`) VALUES
(1, 7, 'Ultra Mix', 'Dolomite 500 ms', '45.2', '3.50'),
(2, 9, 'Plastic Handle Heavy', 'Dolomite 300 ms', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_23`
--

CREATE TABLE IF NOT EXISTS `purchase_23` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `typetext` text,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_23`
--

INSERT INTO `purchase_23` (`id`, `type`, `typetext`, `name`, `price`, `quantity`) VALUES
(1, 1, 'Hallow Nylon', 'Dolomite 300 ms', '50.0', '3'),
(2, 6, 'Magic', 'Dolomite 500 ms', '50.0', '4');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_24`
--

CREATE TABLE IF NOT EXISTS `purchase_24` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `typetext` text,
  `name` text,
  `price` text,
  `quantity` text,
  `amount` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `purchase_24`
--

INSERT INTO `purchase_24` (`id`, `type`, `typetext`, `name`, `price`, `quantity`, `amount`) VALUES
(1, 3, 'Empty Container', 'Cementprimer 20l', '3.0', '3', '9.0'),
(2, 1, 'Raw Material', 'Dolomite 300 ms', '4.0', '3', '12.0');

-- --------------------------------------------------------

--
-- Table structure for table `sale`
--

CREATE TABLE IF NOT EXISTS `sale` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firmname` text NOT NULL,
  `amount` text NOT NULL,
  `dop` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20 ;

--
-- Dumping data for table `sale`
--

INSERT INTO `sale` (`id`, `firmname`, `amount`, `dop`) VALUES
(1, 'kanishk', '12.0', '2012-06-14'),
(7, 'hey', '316.4', '2011-11-03'),
(8, 'hey', '316.4', '2011-03-04'),
(9, 'hey', '327.7', '2011-03-04'),
(10, 'hey', '311.88', '2011-03-04'),
(11, 'hey', '316.4', '2011-03-04'),
(12, 'hey', '316.4', '2011-03-04'),
(13, 'hey', '158.2', '2011-04-03'),
(14, 'hey', '158.2', '2011-03-04'),
(15, 'hey', '158.2', '2011-04-03'),
(16, 'hey', '361.6', '2011-03-04'),
(17, 'hey', '110.0', '2011-04-03'),
(18, 'Nitpal Production Ltd', '8.160001', '2011-03-03'),
(19, 'Priyanshu Material Ltd', '21.0', '2011-04-03');

-- --------------------------------------------------------

--
-- Table structure for table `sale_1`
--

CREATE TABLE IF NOT EXISTS `sale_1` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sale_1`
--

INSERT INTO `sale_1` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 1, 'Empty Container', '3', '4');

-- --------------------------------------------------------

--
-- Table structure for table `sale_2`
--

CREATE TABLE IF NOT EXISTS `sale_2` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_2`
--

INSERT INTO `sale_2` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 0, 'Binder', '45.2', '3.50'),
(2, 1, 'Empty Bags', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_3`
--

CREATE TABLE IF NOT EXISTS `sale_3` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_3`
--

INSERT INTO `sale_3` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 0, 'Binder', '45.2', '3.50'),
(2, 1, 'Empty Bags', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_4`
--

CREATE TABLE IF NOT EXISTS `sale_4` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_4`
--

INSERT INTO `sale_4` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 0, 'Binder', '45.2', '3.50'),
(2, 1, 'Empty Bags', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_5`
--

CREATE TABLE IF NOT EXISTS `sale_5` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_5`
--

INSERT INTO `sale_5` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 0, 'Binder', '45.2', '3.50'),
(2, 1, 'Empty Bags', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_6`
--

CREATE TABLE IF NOT EXISTS `sale_6` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_6`
--

INSERT INTO `sale_6` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 0, 'Binder', '45.2', '3.50'),
(2, 1, 'Empty Bags', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_7`
--

CREATE TABLE IF NOT EXISTS `sale_7` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_7`
--

INSERT INTO `sale_7` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 0, 'Binder', '45.2', '3.50'),
(2, 1, 'Empty Bags', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_8`
--

CREATE TABLE IF NOT EXISTS `sale_8` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_8`
--

INSERT INTO `sale_8` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 0, 'Binder', '45.2', '3.50'),
(2, 1, 'Empty Bags', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_9`
--

CREATE TABLE IF NOT EXISTS `sale_9` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_9`
--

INSERT INTO `sale_9` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 1, 'Binder', '45.2', '3.50'),
(2, 1, 'Empty Bags', '45.2', '3.75');

-- --------------------------------------------------------

--
-- Table structure for table `sale_10`
--

CREATE TABLE IF NOT EXISTS `sale_10` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_10`
--

INSERT INTO `sale_10` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 0, 'Empty Container', '45.2', '3.45'),
(2, 1, 'Empty Bags', '45.2', '3.45');

-- --------------------------------------------------------

--
-- Table structure for table `sale_11`
--

CREATE TABLE IF NOT EXISTS `sale_11` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_11`
--

INSERT INTO `sale_11` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 0, 'Empty Bags', '45.2', '3.50'),
(2, 1, 'Empty Container', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_12`
--

CREATE TABLE IF NOT EXISTS `sale_12` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_12`
--

INSERT INTO `sale_12` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 1, 'Binder', '45.2', '3.50'),
(2, 0, 'Empty Container', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_13`
--

CREATE TABLE IF NOT EXISTS `sale_13` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sale_13`
--

INSERT INTO `sale_13` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 1, 'Empty Bags', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_14`
--

CREATE TABLE IF NOT EXISTS `sale_14` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sale_14`
--

INSERT INTO `sale_14` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 1, 'Raw Material', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_15`
--

CREATE TABLE IF NOT EXISTS `sale_15` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sale_15`
--

INSERT INTO `sale_15` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 1, 'Binder', '45.2', '3.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_16`
--

CREATE TABLE IF NOT EXISTS `sale_16` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_16`
--

INSERT INTO `sale_16` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 1, 'Empty Container', '45.2', '3.50'),
(2, 0, 'Empty Bags', '45.2', '4.50');

-- --------------------------------------------------------

--
-- Table structure for table `sale_17`
--

CREATE TABLE IF NOT EXISTS `sale_17` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `sale_17`
--

INSERT INTO `sale_17` (`id`, `type`, `name`, `price`, `quantity`) VALUES
(1, 1, 'Empty Container', '10.0', '3'),
(2, 0, 'Binder', '10.0', '4'),
(3, 0, 'Binder', '10.0', '4');

-- --------------------------------------------------------

--
-- Table structure for table `sale_18`
--

CREATE TABLE IF NOT EXISTS `sale_18` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  `amount` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_18`
--

INSERT INTO `sale_18` (`id`, `type`, `name`, `price`, `quantity`, `amount`) VALUES
(1, 1, 'Empty Container', '1.2', '3.4', '4.0800004'),
(2, 1, 'Binder', '1.2', '3.4', '4.0800004');

-- --------------------------------------------------------

--
-- Table structure for table `sale_19`
--

CREATE TABLE IF NOT EXISTS `sale_19` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` text,
  `price` text,
  `quantity` text,
  `amount` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sale_19`
--

INSERT INTO `sale_19` (`id`, `type`, `name`, `price`, `quantity`, `amount`) VALUES
(1, 1, 'Empty Container', '3.5', '3', '10.5'),
(2, 0, 'Empty Bags', '3.5', '3', '10.5');

-- --------------------------------------------------------

--
-- Table structure for table `sale_20`
--

CREATE TABLE IF NOT EXISTS `sale_20` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` text,
  `name` text,
  `price` text,
  `quantity` text,
  `amount` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sale_20`
--

INSERT INTO `sale_20` (`id`, `type`, `name`, `price`, `quantity`, `amount`) VALUES
(1, 'Paint', 'Raw Material', '5.0', '4', '20.0');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
