/*
SQLyog Ultimate v8.61 
MySQL - 5.5.5-10.1.21-MariaDB : Database - contacts
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`contacts` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `contacts`;

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Number` varchar(15) DEFAULT NULL,
  `TypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `contact` */

insert  into `contact`(`ID`,`Name`,`Number`,`TypeId`) values (1,'Ashique Ali','03073670189',1),(2,'Nisar Mahar','03058027701',2);

/*Table structure for table `contacttype` */

DROP TABLE IF EXISTS `contacttype`;

CREATE TABLE `contacttype` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

/*Data for the table `contacttype` */

insert  into `contacttype`(`ID`,`Type`) values (1,'Friends'),(2,'Home'),(3,'Mobile'),(4,'Work'),(5,'Home Fax'),(6,'Pager'),(7,'Other'),(8,'Call Back'),(9,'Car'),(10,'Company Main'),(11,'ISDN'),(12,'Main'),(13,'Other Fax'),(14,'Radio'),(15,'Telex'),(16,'TTY TDD'),(17,'Work Mobile'),(18,'Work Pager'),(19,'Assistant'),(20,'MMs');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
