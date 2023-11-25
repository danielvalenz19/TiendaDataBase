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
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `ProductoID` int NOT NULL,
  `NombreProducto` varchar(100) DEFAULT NULL,
  `Precio` decimal(10,2) DEFAULT NULL,
  `Stock` int DEFAULT NULL,
  PRIMARY KEY (`ProductoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (0,'no',0.00,0),(1,'Diandra',91.00,1),(2,'Latashia',7.00,2),(3,'Finn',95.00,3),(4,'Glynn',5.00,4),(5,'Marabel',36.00,5),(6,'Ellery',32.00,6),(7,'Chrysa',37.00,7),(8,'Carlin',30.00,8),(9,'Ronny',9.00,9),(10,'Lynsey',88.00,10),(11,'Winifred',9.00,11),(12,'Ab',37.00,12),(13,'Retha',8.00,13),(14,'Raynell',30.00,14),(15,'Fara',59.00,15),(16,'Shadow',20.00,16),(17,'D\'arcy',88.00,17),(18,'Alica',99.00,18),(19,'Miof mela',78.00,19),(20,'Bianka',11.00,20),(21,'Alana',32.00,21),(22,'Gina',93.00,22),(23,'Kimball',28.00,23),(24,'Bradney',42.00,24),(25,'Con',2.00,25),(26,'Ira',8.00,26),(27,'Herby',68.00,27),(28,'Rogers',87.00,28),(29,'Jocelyne',30.00,29),(30,'Cornelia',28.00,30),(31,'Mathe',99.00,31),(32,'Hagan',35.00,32),(33,'Val',6.00,33),(34,'Nolie',63.00,34),(35,'Roger',39.00,35),(36,'Reeta',37.00,36),(37,'Celestia',58.00,37),(38,'Tana',33.00,38),(39,'Arlee',40.00,39),(40,'Turner',11.00,40),(41,'Lida',15.00,41),(42,'Anya',32.00,42),(43,'Enid',6.00,43),(44,'Donalt',5.00,44),(45,'Kylynn',2.00,45),(46,'Tiebold',82.00,46),(47,'Elroy',44.00,47),(48,'Cathee',6.00,48),(49,'Ketti',50.00,49),(50,'Sondra',35.00,50),(51,'Roderick',67.00,51),(52,'Kessiah',70.00,52),(53,'Camile',27.00,53),(54,'Lynnett',42.00,54),(55,'Tiffani',56.00,55),(56,'Kimbell',32.00,56),(57,'Rock',66.00,57),(58,'Ollie',96.00,58),(59,'Opalina',26.00,59),(60,'Andree',55.00,60),(61,'Ken',23.00,61),(62,'Camille',20.00,62),(63,'Leland',47.00,63),(64,'Merv',80.00,64),(65,'Pepita',10.00,65),(66,'Leyla',95.00,66),(67,'Tarrah',67.00,67),(68,'Rabbi',46.00,68),(69,'Edy',91.00,69),(70,'Augusto',60.00,70),(71,'Cherida',86.00,71),(72,'Daniele',6.00,72),(73,'Mano',96.00,73),(74,'Matelda',39.00,74),(75,'Merv',29.00,75),(76,'Valentino',64.00,76),(77,'Arlie',33.00,77),(78,'Melvyn',42.00,78),(79,'Ginger',43.00,79),(80,'Edgar',15.00,80),(81,'Carena',24.00,81),(82,'Felipa',89.00,82),(83,'Caty',44.00,83),(84,'Pennie',39.00,84),(85,'Aubry',21.00,85),(86,'Callida',69.00,86),(87,'Joyous',32.00,87),(88,'Darin',23.00,88),(89,'Ab',2.00,89),(90,'Cherilynn',99.00,90),(91,'Opaline',39.00,91),(92,'Osborn',22.00,92),(93,'Bellanca',36.00,93),(94,'Greggory',90.00,94),(95,'Dedie',21.00,95),(96,'Jobina',35.00,96),(97,'Norean',96.00,97),(98,'Devora',65.00,98),(99,'Iolanthe',85.00,99),(100,'Bennett',22.00,100);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
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
