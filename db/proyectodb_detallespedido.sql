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
-- Table structure for table `detallespedido`
--

DROP TABLE IF EXISTS `detallespedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallespedido` (
  `DetalleID` int NOT NULL,
  `PedidoID` int DEFAULT NULL,
  `ProductoID` int DEFAULT NULL,
  `Cantidad` int DEFAULT NULL,
  PRIMARY KEY (`DetalleID`),
  KEY `PedidoID` (`PedidoID`),
  KEY `ProductoID` (`ProductoID`),
  CONSTRAINT `detallespedido_ibfk_1` FOREIGN KEY (`PedidoID`) REFERENCES `pedidos` (`PedidoID`),
  CONSTRAINT `detallespedido_ibfk_2` FOREIGN KEY (`ProductoID`) REFERENCES `productos` (`ProductoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallespedido`
--

LOCK TABLES `detallespedido` WRITE;
/*!40000 ALTER TABLE `detallespedido` DISABLE KEYS */;
INSERT INTO `detallespedido` VALUES (0,0,0,0),(1,29,30,91),(2,57,29,4),(3,25,57,20),(4,20,88,79),(5,95,85,66),(6,98,40,25),(7,92,100,41),(8,34,67,39),(9,24,45,80),(10,88,56,94),(11,83,56,57),(12,79,51,14),(13,6,29,91),(14,55,20,30),(15,56,65,43),(16,86,97,96),(17,72,76,68),(18,50,81,66),(19,79,84,79),(20,33,39,34),(21,70,98,9),(22,26,1,14),(23,91,89,42),(24,31,70,8),(25,22,60,44),(26,26,50,24),(27,41,84,25),(28,34,69,19),(29,25,61,21),(30,95,11,59),(31,4,81,81),(32,10,13,21),(33,81,18,84),(34,94,67,98),(35,41,45,12),(36,34,21,93),(37,24,79,58),(38,81,67,97),(39,98,34,89),(40,80,76,26),(41,42,49,22),(42,68,35,7),(43,47,36,95),(44,5,46,69),(45,91,53,53),(46,10,92,46),(47,47,23,38),(48,18,15,59),(49,82,47,74),(50,3,70,61),(51,33,91,60),(52,7,38,78),(53,8,82,79),(54,31,61,95),(55,74,64,58),(56,83,81,75),(57,37,26,76),(58,53,9,85),(59,30,93,39),(60,54,27,18),(61,97,98,10),(62,99,67,81),(63,41,54,57),(64,30,40,52),(65,2,6,15),(66,86,98,73),(67,99,96,13),(68,7,48,93),(69,62,44,61),(70,46,46,68),(71,61,19,68),(72,62,35,37),(73,36,3,47),(74,3,11,39),(75,1,66,80),(76,2,22,3),(77,31,54,92),(78,22,19,33),(79,6,8,80),(80,90,88,40),(81,3,21,99),(82,97,49,74),(83,29,66,26),(84,89,87,24),(85,87,48,45),(86,86,59,61),(87,5,58,55),(88,54,51,99),(89,66,25,84),(90,72,29,8),(91,40,59,71),(92,2,33,59),(93,50,15,64),(94,6,59,2),(95,59,96,21),(96,85,5,58),(97,99,77,84),(98,33,53,80),(99,62,79,78),(100,33,83,70);
/*!40000 ALTER TABLE `detallespedido` ENABLE KEYS */;
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
