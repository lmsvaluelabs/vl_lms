/*
SQLyog - Free MySQL GUI v5.19
Host - 5.5.35 : Database - leave_management_system
*********************************************************************
Server version : 5.5.35
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `leave_management_system`;

USE `leave_management_system`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `deptname` varchar(20) DEFAULT NULL,
  `deptloc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `department` */

insert into `department` (`id`,`deptname`,`deptloc`) values (1,'Accounts','hyderbad');
insert into `department` (`id`,`deptname`,`deptloc`) values (2,'Sales','hyderbad');
insert into `department` (`id`,`deptname`,`deptloc`) values (3,'development','california');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(30) DEFAULT NULL,
  `middlename` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `joiningdate` date DEFAULT NULL,
  `designation` varchar(30) DEFAULT NULL,
  `departmentid` bigint(20) DEFAULT NULL,
  `reportingmanagerid` bigint(20) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `role` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_employee` (`departmentid`),
  KEY `FK_reportingmanager` (`reportingmanagerid`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`departmentid`) REFERENCES `department` (`id`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`reportingmanagerid`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert into `employee` (`id`,`firstname`,`middlename`,`lastname`,`username`,`email`,`dob`,`joiningdate`,`designation`,`departmentid`,`reportingmanagerid`,`mobile`,`role`) values (1,'Sunil','',NULL,'sunil','sunil@vl.com','0000-00-00','0000-00-00','Manager',1,1,'12345','Manager');
insert into `employee` (`id`,`firstname`,`middlename`,`lastname`,`username`,`email`,`dob`,`joiningdate`,`designation`,`departmentid`,`reportingmanagerid`,`mobile`,`role`) values (2,'Syed',NULL,'karim','syed','syed@vl.com','1989-05-14','2011-05-14','SSE',1,1,'4568','Employee');
insert into `employee` (`id`,`firstname`,`middlename`,`lastname`,`username`,`email`,`dob`,`joiningdate`,`designation`,`departmentid`,`reportingmanagerid`,`mobile`,`role`) values (3,'Hari',NULL,'venkatesh','hari','hari@vl.com','2015-01-15','2014-04-25','SE',1,1,'2342314','Employee');

/*Table structure for table `leavecredits` */

DROP TABLE IF EXISTS `leavecredits`;

CREATE TABLE `leavecredits` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `crediteddays` double DEFAULT NULL,
  `creditedon` date DEFAULT NULL,
  `employeeid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_leavecredits` (`employeeid`),
  CONSTRAINT `leavecredits_ibfk_1` FOREIGN KEY (`employeeid`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `leavecredits` */

insert into `leavecredits` (`id`,`crediteddays`,`creditedon`,`employeeid`) values (1,1,'2014-02-21',2);

/*Table structure for table `leavedebits` */

DROP TABLE IF EXISTS `leavedebits`;

CREATE TABLE `leavedebits` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fromdate` date DEFAULT NULL,
  `todate` date DEFAULT NULL,
  `employeecomments` longtext,
  `managercomments` longtext,
  `leaveappliedon` date DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `employeeid` bigint(20) DEFAULT NULL,
  `leavetypeid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_leavedebits` (`employeeid`),
  KEY `FK_leavetype` (`leavetypeid`),
  CONSTRAINT `leavedebits_ibfk_2` FOREIGN KEY (`leavetypeid`) REFERENCES `leavetype` (`id`),
  CONSTRAINT `leavedebits_ibfk_1` FOREIGN KEY (`employeeid`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `leavedebits` */

insert into `leavedebits` (`id`,`fromdate`,`todate`,`employeecomments`,`managercomments`,`leaveappliedon`,`status`,`employeeid`,`leavetypeid`) values (2,'2015-01-15','2015-01-17','Suffering from fever','Approved','2015-01-10','Approved',2,1);

/*Table structure for table `leavesettings` */

DROP TABLE IF EXISTS `leavesettings`;

CREATE TABLE `leavesettings` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `probationperiod` int(10) DEFAULT NULL,
  `leavesperyear` double DEFAULT NULL,
  `cyclemonth` varchar(10) DEFAULT NULL,
  `maxcarryforwardleaves` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `leavesettings` */

insert into `leavesettings` (`id`,`probationperiod`,`leavesperyear`,`cyclemonth`,`maxcarryforwardleaves`) values (1,2,21,'MARCH',10);

/*Table structure for table `leavetype` */

DROP TABLE IF EXISTS `leavetype`;

CREATE TABLE `leavetype` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `leavetype` */

insert into `leavetype` (`id`,`name`) values (1,'GL');
insert into `leavetype` (`id`,`name`) values (2,'LOP');
insert into `leavetype` (`id`,`name`) values (3,'CASUAL');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
