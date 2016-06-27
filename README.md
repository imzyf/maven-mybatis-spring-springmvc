# maven-mybatis-spring-springMVC
框架整合。有测试用例，可以跑起来。

DB sql
```
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `key` varchar(45) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES ('1', '22', 'fff');
```
