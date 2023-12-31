-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: proyectodb
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras` (
  `CompraID` int NOT NULL,
  `FechaCompra` varchar(255) DEFAULT NULL,
  `ProveedorID` int DEFAULT NULL,
  PRIMARY KEY (`CompraID`),
  KEY `ProveedorID` (`ProveedorID`),
  CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`ProveedorID`) REFERENCES `proveedores` (`ProveedorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
INSERT INTO `compras` VALUES (0,'0',0),(1,'2002',44),(2,'2001',52),(3,'2007',16),(4,'2001',49),(5,'2006',97),(6,'2004',42),(7,'1995',54),(8,'2011',8),(9,'1992',10),(10,'1985',94),(11,'2009',37),(12,'2008',28),(13,'2006',16),(14,'2006',74),(15,'2002',18),(16,'2011',9),(17,'2006',86),(18,'2006',29),(19,'2003',94),(20,'2002',24),(21,'2009',92),(22,'2012',63),(23,'1997',49),(24,'1984',56),(25,'2006',52),(26,'1989',3),(27,'1993',11),(28,'2011',56),(29,'2005',30),(30,'1990',63),(31,'2008',51),(32,'2000',17),(33,'2006',40),(34,'1992',89),(35,'1988',96),(36,'2000',19),(37,'1994',47),(38,'1992',18),(39,'1991',55),(40,'1999',77),(41,'1995',77),(42,'2002',86),(43,'2009',37),(44,'1992',58),(45,'1988',78),(46,'2002',64),(47,'2001',82),(48,'2004',11),(49,'1994',8),(50,'1993',74),(51,'2003',8),(52,'1994',6),(53,'2012',92),(54,'2001',28),(55,'1996',41),(56,'1990',89),(57,'1999',100),(58,'1995',41),(59,'2013',73),(60,'2003',29),(61,'2009',26),(62,'1996',57),(63,'1993',95),(64,'1985',18),(65,'1997',95),(66,'1989',96),(67,'2003',14),(68,'1989',36),(69,'1992',34),(70,'2010',79),(71,'1990',98),(72,'2011',33),(73,'2012',46),(74,'1975',68),(75,'1994',11),(76,'2009',76),(77,'1996',57),(78,'2010',8),(79,'2012',8),(80,'1996',26),(81,'2004',28),(82,'1999',45),(83,'1998',55),(84,'2009',78),(85,'1992',47),(86,'2003',8),(87,'2005',16),(88,'1999',34),(89,'2012',24),(90,'2008',99),(91,'2008',37),(92,'2010',58),(93,'2004',29),(94,'1997',66),(95,'1992',79),(96,'2004',67),(97,'2005',57),(98,'1997',93),(99,'2010',80),(100,'2010',9);
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-24 22:53:51
