-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.26 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- 导出  表 school.university_rank 结构
CREATE TABLE IF NOT EXISTS `university_rank` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `area` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '地区',
  `type` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '类型',
  `score` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '得分',
  `majar` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '专业',
  `year` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '年度',
  `rank` int DEFAULT NULL COMMENT '名次',
  `school` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '学校名称',
  `op_date` datetime DEFAULT NULL COMMENT '入库时间',
  `extr1` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '冗余1',
  `extr2` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '冗余1',
  `extr3` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '冗余1',
  `extr4` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '冗余1',
  `extr5` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '冗余1',
  `extr6` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '冗余1',
  `extr7` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '冗余1',
  `extr8` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '冗余1',
  `extr9` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '冗余1',
  `extr10` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '冗余1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- 正在导出表  school.university_rank 的数据：~2 rows (大约)
DELETE FROM `university_rank`;
INSERT INTO `university_rank` (`id`, `area`, `type`, `score`, `majar`, `year`, `rank`, `school`, `op_date`, `extr1`, `extr2`, `extr3`, `extr4`, `extr5`, `extr6`, `extr7`, `extr8`, `extr9`, `extr10`) VALUES
	(1, '北京', '综合', '999.4', '软科', '2022', 1, '清华大学', '2022-10-04 11:21:19', '2022', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(2, '北京', '综合', '912.5', '软科', '2022', 2, '北京大学', '2022-10-04 11:21:19', '2022', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
