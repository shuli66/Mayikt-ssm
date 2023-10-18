/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80032
Source Host           : localhost:3306
Source Database       : mayikt

Target Server Type    : MYSQL
Target Server Version : 80032
File Encoding         : 65001

Date: 2023-10-18 17:05:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mayikt_users
-- ----------------------------
DROP TABLE IF EXISTS `mayikt_users`;
CREATE TABLE `mayikt_users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of mayikt_users
-- ----------------------------
INSERT INTO `mayikt_users` VALUES ('1', '王少毅', '20', '河南许昌');
INSERT INTO `mayikt_users` VALUES ('2', '王锦辉', '20', '河南周口');
INSERT INTO `mayikt_users` VALUES ('3', '王英文', '21', '河南南阳');
INSERT INTO `mayikt_users` VALUES ('4', '王壮', '55', '河南新乡');
INSERT INTO `mayikt_users` VALUES ('5', '薛亮', '21', '河南许昌');
INSERT INTO `mayikt_users` VALUES ('6', '谢茂航', '21', '河南焦作');
INSERT INTO `mayikt_users` VALUES ('7', '吴昊', '23', '信阳固始');
INSERT INTO `mayikt_users` VALUES ('14', '王铵', '23', '驻马店');
