/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : bookstore

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2018-04-26 20:59:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `n_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(10) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `n_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('1', '公共告1', '11111111111', '2018-04-05 00:00:00');
INSERT INTO `notice` VALUES ('2', '公告2', '本周图书销售量再创新高', '2018-04-14 15:40:34');
INSERT INTO `notice` VALUES ('3', '公告3', '你好吗', '2018-04-14 15:42:13');
INSERT INTO `notice` VALUES ('4', null, '儿童袜无无无无无无无无拖无无无无无', '2018-04-14 15:43:34');

-- ----------------------------
-- Table structure for orderitem
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `order_id` varchar(100) NOT NULL DEFAULT '',
  `product_id` varchar(100) NOT NULL DEFAULT '',
  `buynum` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`,`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------
INSERT INTO `orderitem` VALUES ('15f0c0bd-5e13-48c3-bdcc-0e5c4c68e336', '2', '1');
INSERT INTO `orderitem` VALUES ('1b2a940d-08c3-45c0-bdc6-635ab3857189', '2', '1');
INSERT INTO `orderitem` VALUES ('1c6368c4-fcdd-4fbc-ba00-49f93e52ec18', '2', '2');
INSERT INTO `orderitem` VALUES ('32622d69-1a6a-40e9-9d04-c9a710622d65', '2', '1');
INSERT INTO `orderitem` VALUES ('3bd317c7-0d6a-4139-a916-00a546864fa6', '1', '1');
INSERT INTO `orderitem` VALUES ('3ec21bf2-8817-4c2c-9acd-1c605206cd7e', '1', '1');
INSERT INTO `orderitem` VALUES ('3ec21bf2-8817-4c2c-9acd-1c605206cd7e', '2', '1');
INSERT INTO `orderitem` VALUES ('4244854b-1ee5-46e5-b9e3-7a5ab2313d81', '2', '1');
INSERT INTO `orderitem` VALUES ('45abfac8-1d29-4a7c-8ad6-b0c44c6eecd9', '2', '1');
INSERT INTO `orderitem` VALUES ('662d2949-7d26-4ac8-bed9-bd740ef05653', '1', '1');
INSERT INTO `orderitem` VALUES ('662d2949-7d26-4ac8-bed9-bd740ef05653', '2', '1');
INSERT INTO `orderitem` VALUES ('66a70e53-4328-4801-943d-18cf8262d8c3', '2', '2');
INSERT INTO `orderitem` VALUES ('6e375e30-c333-4d4f-a44b-96285d73b65b', '1', '1');
INSERT INTO `orderitem` VALUES ('6e375e30-c333-4d4f-a44b-96285d73b65b', '2', '1');
INSERT INTO `orderitem` VALUES ('88d91237-f8f4-4975-8fb4-3fc55715f4d6', '1', '1');
INSERT INTO `orderitem` VALUES ('8e784e52-f0bd-43d7-bd26-565540395159', '2', '1');
INSERT INTO `orderitem` VALUES ('8fc052b4-39fd-44fb-84eb-87f5ee924f47', '2', '1');
INSERT INTO `orderitem` VALUES ('a420067a-ab21-4f3f-9c2a-846ec66e64fe', '1', '1');
INSERT INTO `orderitem` VALUES ('d1d81bff-fcff-48f4-bbaf-d2d7ac5b0eea', '1', '1');
INSERT INTO `orderitem` VALUES ('d1d81bff-fcff-48f4-bbaf-d2d7ac5b0eea', '2', '1');
INSERT INTO `orderitem` VALUES ('dc3866d1-3776-4d3c-8e14-2052df55f1e2', '1', '1');
INSERT INTO `orderitem` VALUES ('dc3866d1-3776-4d3c-8e14-2052df55f1e2', '2', '1');
INSERT INTO `orderitem` VALUES ('e8597d2c-05c2-4651-a46b-93ff0bd9a495', '2', '1');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` varchar(100) NOT NULL,
  `money` double DEFAULT NULL,
  `receiverAddress` varchar(255) DEFAULT NULL,
  `receiverName` varchar(20) DEFAULT NULL,
  `receiverPhone` varchar(20) DEFAULT NULL,
  `paystate` int(11) DEFAULT '0',
  `ordertime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('e8597d2c-05c2-4651-a46b-93ff0bd9a495', '34', '安阳', '于亚芳', '123456', '0', '2018-04-14 21:29:31', '7');

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
  `id` varchar(100) NOT NULL DEFAULT '',
  `name` varchar(40) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `category` varchar(40) DEFAULT NULL,
  `pnum` int(11) DEFAULT NULL,
  `imgurl` varchar(100) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES ('1', 'java web', '32', '计算机', '5', '/productImg/10/5/36ee63bc-c251-49ce-9b9a-b5e1e2e75ec0.jpg', '111111111111111111111111111111111111111111111111');
INSERT INTO `products` VALUES ('2', '时空穿行', '34', '科技', '4', '/productImg/11/4/d79dc124-de69-4b77-847e-bc461bfdb857.jpg', '222222222222222222222222222222222222222222222222222222');
INSERT INTO `products` VALUES ('3', '大勇和小花的欧洲日记', '27.5', '少儿', '10', '/productImg/12/1/986b5e98-ee73-4717-89fd-b6ac26a8dc2c.jpg', '大勇和小花的欧洲日记大勇和小花的欧洲日记大勇和小花的欧洲日记大勇和小花的欧洲日记大勇和小花的欧洲日记大勇和小花的欧洲日记');
INSERT INTO `products` VALUES ('4', 'Java基础入门', '38', '计算机', '8', '/productImg/12/14/a1ace169-b53a-41c6-bdea-000e5946b2a5.png', 'Java基础入门Java基础入门Java基础入门Java基础入门Java基础入门Java基础入门');
INSERT INTO `products` VALUES ('5', '别做正常的傻瓜', '19.5', '励志', '3', '/productImg/14/1/792116e7-6d83-4be4-b3e5-4dd11b0b4565.jpg', '别做正常的傻瓜别做正常的傻瓜别做正常的傻瓜别做正常的傻瓜');
INSERT INTO `products` VALUES ('6', '中国国家地理', '23.8', '社科', '20', '/productImg/2/0/2105fbe5-400f-4193-a7db-d7ebac389550.jpg', '中国国家地理中国国家地理中国国家地理中国国家地理中国国家地理');
INSERT INTO `products` VALUES ('7', '学会宽容', '28', '励志', '15', '/productImg/6/5/a2da626c-c72d-4972-83de-cf48405c5563.jpg', '学会宽容学会宽容学会宽容');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `introduce` varchar(100) DEFAULT NULL,
  `activeCode` varchar(50) DEFAULT NULL,
  `state` int(11) DEFAULT '0',
  `role` varchar(10) DEFAULT '普通用户',
  `registTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('8', 'abc', '123456', '女', '123@123.com', '123456', '', '38ea92ab-26c2-4725-aa73-b5e899e9767a', '1', '普通用户', '2018-04-24 09:55:09');
INSERT INTO `user` VALUES ('16', 'aaa', '111111', '男', 'yuyafangh@163.com', '', '', '9039c221-fef5-4f2a-b1b1-5f6944252cca', '1', '普通用户', '2018-04-15 22:50:35');
