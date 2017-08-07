/*
SQLyog Ultimate v9.62 
MySQL - 5.6.21-log : Database - db_questionnaire
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_questionnaire` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_questionnaire`;

/*Table structure for table `tb_question` */

DROP TABLE IF EXISTS `tb_question`;

CREATE TABLE `tb_question` (
  `question_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '每个问题题目的id号',
  `content` varchar(100) NOT NULL COMMENT '题目内容',
  KEY `question_id` (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `tb_question` */

insert  into `tb_question`(`question_id`,`content`) values (1,'Q1:您的性别？'),(2,'Q2:您所在的年级？'),(3,'Q3:网购时，你经常使用哪种付款方式？'),(4,'Q4:你过去3个月是否曾经在网络上购买东西？'),(5,'Q5：你平均每个月花费在网购上的费用是多少钱？'),(6,'Q6：你最近的一次网购的时间是？'),(7,'Q7：您一般网购的商品是什么？（多选）'),(8,'Q8:对网购您最关心的问题是？');

/*Table structure for table `tb_selection` */

DROP TABLE IF EXISTS `tb_selection`;

CREATE TABLE `tb_selection` (
  `selection_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '一个选项的id',
  `question_id` int(4) NOT NULL COMMENT '该选项对应的问题的id',
  `content` varchar(100) NOT NULL COMMENT '该选项的内容',
  `count` int(100) NOT NULL DEFAULT '0' COMMENT '该选项被选中的次数',
  KEY `selection_id` (`selection_id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

/*Data for the table `tb_selection` */

insert  into `tb_selection`(`selection_id`,`question_id`,`content`,`count`) values (1,1,'男',2),(2,1,'女',1),(3,2,'一年级',6),(4,2,'二年级',1),(5,2,'三年级',1),(6,2,'四年级',0),(7,2,'研究生',0),(8,3,'网上支付',5),(9,3,'货到付款',0),(10,3,'邮局转账',1),(11,3,'银行存款',0),(12,4,'是',4),(13,4,'否',2),(14,5,'100元以内',4),(15,5,'100-300元',1),(16,5,'301-500元',1),(17,5,'501-1000元',0),(18,5,'1000元以上',0),(19,6,'三天前',4),(20,6,'一周前',1),(21,6,'一个月前',1),(22,6,'半年前',0),(23,7,'衣服、鞋子等服饰类',5),(24,7,'书本、音像等课程培训学习资料',2),(25,7,'化妆品',3),(26,7,'电子产品',2),(27,7,'汽车票、火车票',2),(28,7,'其他',2),(29,8,'产品的质量',0),(30,8,'服务态度',0),(31,8,'价钱',0),(32,8,'品牌',0),(33,8,'其他',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
