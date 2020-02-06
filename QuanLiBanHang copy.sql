/*
 Navicat Premium Data Transfer

 Source Server         : QLBH
 Source Server Type    : MariaDB
 Source Server Version : 100410
 Source Host           : localhost:3306
 Source Schema         : QuanLiBanHang

 Target Server Type    : MariaDB
 Target Server Version : 100410
 File Encoding         : 65001

 Date: 05/02/2020 18:21:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Staff
-- ----------------------------
DROP TABLE IF EXISTS `Staff`;
CREATE TABLE `Staff` (
  `Staff_ID` varchar(30) NOT NULL,
  `Staff_Name` varchar(50) NOT NULL,
  `Staff_Addr` varchar(100) DEFAULT NULL,
  `Staff_DoB` date DEFAULT NULL,
  `Staff_Sex` varchar(10) NOT NULL,
  `Staff_Ident` varchar(30) NOT NULL,
  `Staff_Password` varchar(30) NOT NULL,
  `Staff_totalTimeOfMonth` double NOT NULL,
  `Staff_salary` double NOT NULL,
  PRIMARY KEY (`Staff_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of Staff
-- ----------------------------
BEGIN;
INSERT INTO `Staff` VALUES ('20176865', 'Nguyen Duc Tan', 'Thanh Hoa', '1999-04-16', 'Nam', '174520870', 'anhthu@127', 0, 20000);
INSERT INTO `Staff` VALUES ('20176866', 'Do Anh Thu', 'Bắc Giang', '1998-07-12', 'Nu', '123', 'anhtan@164', 0, 500000);
INSERT INTO `Staff` VALUES ('20176882', 'Thong', 'Nghe An', '1999-12-12', 'Nam', '123323', '123456', 0, 21000);
INSERT INTO `Staff` VALUES ('20186882', 'Huyen', 'Bắc Ninh', '1999-10-01', 'Nu', '123232322', '1742617', 0, 30000);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
