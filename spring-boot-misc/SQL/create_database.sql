DROP SCHEMA IF EXISTS template_database;
CREATE database template_database DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE template_database;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for table_users
-- ----------------------------
DROP TABLE IF EXISTS table_users;
CREATE TABLE table_users (
  id bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增长id',
  name varchar(50) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of table_users
-- ----------------------------
INSERT INTO table_users VALUES ('1', 'sampleName');
SET FOREIGN_KEY_CHECKS=1;