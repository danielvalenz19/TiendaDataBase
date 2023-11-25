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
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedores` (
  `ProveedorID` int NOT NULL,
  `NombreProveedor` varchar(100) DEFAULT NULL,
  `Direccion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ProveedorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (0,'RosalesSAS','...'),(1,'JuansoseSAS','San antonio Suchitepequez, zona 1'),(2,'jhose','no se'),(3,'Cari Duke','8 Brentwood Way'),(4,'Eldin Kingshott','36 Dixon Plaza'),(5,'Nikos L\'Episcopi','388 Haas Circle'),(6,'Rania Dalglish','93804 Larry Center'),(7,'Antone Bendelow','354 Pawling Court'),(8,'Chase Sayer','9758 Shasta Hill'),(9,'Herbert Scampion','47943 Logan Avenue'),(10,'Marleah Daintree','25 Dottie Plaza'),(11,'Desi Feaveer','8634 Meadow Vale Drive'),(12,'Leonelle Hablet','007 Comanche Plaza'),(13,'Timotheus Stickells','9 Bayside Plaza'),(14,'Jeromy Ingledew','82 Lillian Circle'),(15,'Grata Le Galle','5083 Acker Pass'),(16,'Magnum Bramwell','73686 Aberg Junction'),(17,'Virgie Giacovelli','2 Carpenter Junction'),(18,'Timothy Stormont','351 Park Meadow Drive'),(19,'Zackariah Bayldon','56 Moland Pass'),(20,'Malvina Shippam','526 Division Way'),(21,'Viola Soame','81557 Jenifer Alley'),(22,'Roderick Crecy','012 Buena Vista Pass'),(23,'Lucais Heibl','093 Northwestern Circle'),(24,'Sher Milksop','03071 7th Point'),(25,'Davidde Louedey','6 Butterfield Court'),(26,'Jenica Lattin','3949 Menomonie Plaza'),(27,'Gerianna Matson','66 Maywood Road'),(28,'Orazio Brunsden','83 Dottie Lane'),(29,'Bobbie De Giovanni','95 Bobwhite Center'),(30,'Jorrie Perfili','136 Melvin Avenue'),(31,'Annaliese Hadcock','82 Elmside Center'),(32,'Patrice Durnford','4 Mallard Alley'),(33,'Armando Callery','3263 Sachtjen Junction'),(34,'Imogene Sherar','391 Daystar Crossing'),(35,'Shauna Ranahan','497 Cody Point'),(36,'Randell Donkersley','5 Emmet Alley'),(37,'Candice Watkiss','20 Karstens Circle'),(38,'Tammara Birtchnell','255 East Alley'),(39,'Drake Fessions','4261 Express Road'),(40,'Amos Thunders','86 Bluejay Junction'),(41,'Torrin Lebreton','20 Warner Crossing'),(42,'Dolf Acland','4560 Burning Wood Pass'),(43,'Dominga Ivashov','26 Reinke Pass'),(44,'Mickie Kembry','8580 Dryden Street'),(45,'Ingemar Draye','73 Havey Trail'),(46,'Albert Albon','981 Bonner Circle'),(47,'Gunar Bernardino','0401 Mcbride Way'),(48,'Ally Bosward','851 Logan Terrace'),(49,'Thibaud Hanselmann','80975 Welch Circle'),(50,'Tonie Alsop','5 Eagan Lane'),(51,'Tomaso Hinkley','23 Aberg Park'),(52,'Zorana Bierman','7 Spohn Terrace'),(53,'Aviva Garrattley','496 Pennsylvania Trail'),(54,'Saudra Poznan','420 Schiller Trail'),(55,'Maritsa Paolone','9 Anhalt Avenue'),(56,'Leandra Storrie','68985 Stone Corner Parkway'),(57,'Giulio Oty','0 Menomonie Place'),(58,'Evonne Yeowell','38 Pearson Pass'),(59,'Bjorn Bellis','251 Delladonna Circle'),(60,'Marrilee Edgeson','82 Blue Bill Park Road'),(61,'Layton Shillan','32 Bashford Parkway'),(62,'Aurelea Farlane','24 Ronald Regan Way'),(63,'Dexter Oakden','3142 Menomonie Drive'),(64,'Hobard Linwood','39 Goodland Trail'),(65,'Towny Bausor','00238 Thierer Avenue'),(66,'Davis Easter','30 Victoria Drive'),(67,'Daniela Haquin','87536 Southridge Center'),(68,'Pooh Mangon','873 Warner Trail'),(69,'Sophronia Levy','75820 Manley Terrace'),(70,'Ulrich Trunkfield','56 Fuller Parkway'),(71,'Aila Breawood','454 Erie Avenue'),(72,'Jaine July','8230 Marquette Hill'),(73,'Pancho Densie','193 Mallard Hill'),(74,'Steward Putland','6 Colorado Way'),(75,'Lucy Rymell','4 Marquette Park'),(76,'Roch Fireman','4 Karstens Center'),(77,'Brady Gerriets','5 Old Shore Court'),(78,'Jessie Dederich','01031 Hazelcrest Avenue'),(79,'Alleyn Freyn','2546 Mockingbird Plaza'),(80,'Mozelle Peebles','6160 Doe Crossing Street'),(81,'Tabitha Peaker','76432 Coolidge Center'),(82,'Teresina Shills','397 Tennessee Avenue'),(83,'Kizzee Bilsborrow','22140 Kennedy Way'),(84,'Dunn Lace','3873 Anhalt Parkway'),(85,'Norri Weathers','39693 Nelson Place'),(86,'Domingo Oliva','20 Nancy Alley'),(87,'Renault Morson','751 Service Avenue'),(88,'Janeen Buesnel','6 Vermont Junction'),(89,'Alexia Ellicott','5493 Lighthouse Bay Hill'),(90,'Linette Howes','15820 Hallows Lane'),(91,'Benetta Cobbledick','82656 Farmco Court'),(92,'Tuckie Ryves','919 Ryan Trail'),(93,'Kareem Sweet','9 Hauk Alley'),(94,'Ailis Wanjek','8356 School Park'),(95,'Derril Rayhill','66223 Longview Court'),(96,'Sally Burchnall','2 Alpine Avenue'),(97,'Reinhold Robe','1 Oxford Avenue'),(98,'Man Yukhnin','714 Del Mar Court'),(99,'Celinka Southan','73222 Bonner Park'),(100,'Eugenio Pleaden','05060 Fulton Plaza');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-24 22:53:52
