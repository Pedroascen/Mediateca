CREATE DATABASE  IF NOT EXISTS `mediateca` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mediateca`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: mediateca
-- ------------------------------------------------------
-- Server version	5.7.36

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
-- Table structure for table `cd`
--

DROP TABLE IF EXISTS `cd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cd` (
  `IdCD` int(11) NOT NULL,
  `CodigoMaterialC` varchar(8) NOT NULL,
  `Artista` varchar(60) NOT NULL,
  `Genero` varchar(60) NOT NULL,
  `Duracion` time NOT NULL,
  `NumeroCanciones` int(11) NOT NULL,
  PRIMARY KEY (`IdCD`),
  KEY `CodigoMaterialC_idx` (`CodigoMaterialC`),
  CONSTRAINT `CodigoMaterialC` FOREIGN KEY (`CodigoMaterialC`) REFERENCES `material` (`codigoMaterial`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cd`
--

LOCK TABLES `cd` WRITE;
/*!40000 ALTER TABLE `cd` DISABLE KEYS */;
INSERT INTO `cd` VALUES (1,'CDA00001','Test','Test','11:12:00',3),(2,'CDA00002','Test','Test','11:12:00',3),(3,'CDA00003','Test cd 15','Test cd 15','11:12:00',3),(4,'CDA00004','Testxxxxx','Testddddd','11:12:00',3),(5,'CDA00005','Test','Test','11:12:00',3),(7,'CDA00007','AVICII','ROCK','00:00:00',20);
/*!40000 ALTER TABLE `cd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dvd`
--

DROP TABLE IF EXISTS `dvd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dvd` (
  `IdDVD` int(11) NOT NULL,
  `codigoMaterialD` varchar(8) NOT NULL,
  `Director` varchar(60) NOT NULL,
  `Duracion` time NOT NULL,
  `Genero` varchar(60) NOT NULL,
  PRIMARY KEY (`IdDVD`),
  KEY `codigoMaterialD_idx` (`codigoMaterialD`),
  CONSTRAINT `codigoMaterialD` FOREIGN KEY (`codigoMaterialD`) REFERENCES `material` (`codigoMaterial`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dvd`
--

LOCK TABLES `dvd` WRITE;
/*!40000 ALTER TABLE `dvd` DISABLE KEYS */;
INSERT INTO `dvd` VALUES (1,'DVD00001','Test DVD','00:12:00','Test DVD'),(3,'DVD00003','Test DVD XXXX','00:12:00','Test DVD XXXX'),(4,'DVD00004','Test DVD1','00:12:00','Test DVD1'),(5,'DVD00005','Test DVD','00:12:00','Test DVD');
/*!40000 ALTER TABLE `dvd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `IdLibro` int(11) NOT NULL,
  `codigoMaterialL` varchar(8) NOT NULL,
  `Autor` varchar(60) NOT NULL,
  `NumeroPaginas` int(11) NOT NULL,
  `Editorial` varchar(60) NOT NULL,
  `ISBN` int(13) NOT NULL,
  `AñoPublicacion` year(4) NOT NULL,
  PRIMARY KEY (`IdLibro`),
  KEY `codigoMaterialL_idx` (`codigoMaterialL`),
  CONSTRAINT `codigoMaterialL` FOREIGN KEY (`codigoMaterialL`) REFERENCES `material` (`codigoMaterial`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (1,'LIB00001','Test Libro',3,'Test Libro',345667,2022),(2,'LIB00002','Test Libro 1',3,'Test Libro 1',345667,2022),(3,'LIB00003','Test Libro',3,'Test Libro',345667,2022),(4,'LIB00004','Test LIBbro',45,'Test Libro',34566555,2020);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material`
--

DROP TABLE IF EXISTS `material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `material` (
  `codigoMaterial` varchar(8) NOT NULL,
  `Titulo` varchar(60) NOT NULL,
  `codigoTipoMaterial` int(11) NOT NULL,
  `unidadesDisponibles` int(11) NOT NULL,
  PRIMARY KEY (`codigoMaterial`),
  KEY `codigoTipoMaterial_idx` (`codigoTipoMaterial`),
  CONSTRAINT `codigoTipoMaterial` FOREIGN KEY (`codigoTipoMaterial`) REFERENCES `tipomaterial` (`codigoTipoMaterial`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material`
--

LOCK TABLES `material` WRITE;
/*!40000 ALTER TABLE `material` DISABLE KEYS */;
INSERT INTO `material` VALUES ('CDA00001','Test DVD - 0 UPDATE',6,10),('CDA00002','Test DVD - 0 UPDATE',6,15),('CDA00003','Test cd 15',6,0),('CDA00004','Test DVD - xxxx',6,0),('CDA00005','Test DVD - 0 UPDATE',6,0),('CDA00007','XXXXXXXXX',6,0),('DVD00001','Test DVD - 0 UPDATE',7,0),('DVD00003','Test DVD XXXX',7,0),('DVD00004','Test DVD - 1 UPDATE',7,0),('DVD00005','Test DVD - 0 UPDATE',7,0),('LIB00001','Test DVD - 0 UPDATE',4,0),('LIB00002','Test Libro 1',4,0),('LIB00003','Test DVD - 0 UPDATE',4,0),('LIB00004','Test DVD - 0 LIB',4,0),('REV00001','Test DVD - 0 UPDATE',5,0),('REV00002','Test DVD - R UPDATE',5,0),('REV00003','Test DVD - 0 UPDATE',5,35),('REV00006','new WWWW',5,0),('REV00007','AAAAA',5,0);
/*!40000 ALTER TABLE `material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `revista`
--

DROP TABLE IF EXISTS `revista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `revista` (
  `IdRevista` int(11) NOT NULL,
  `codigoMaterialR` varchar(8) NOT NULL,
  `Editorial` varchar(60) NOT NULL,
  `Periodicidad` varchar(20) NOT NULL,
  `FechaPublicacion` date NOT NULL,
  PRIMARY KEY (`IdRevista`),
  KEY `codigoMaterialR_idx` (`codigoMaterialR`),
  CONSTRAINT `codigoMaterialR` FOREIGN KEY (`codigoMaterialR`) REFERENCES `material` (`codigoMaterial`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `revista`
--

LOCK TABLES `revista` WRITE;
/*!40000 ALTER TABLE `revista` DISABLE KEYS */;
INSERT INTO `revista` VALUES (1,'REV00001','Test Revista','Test Revista','2022-10-29'),(2,'REV00002','Test Revista edit','Test Revista x','2022-10-29'),(3,'REV00003','Test Revista','Test Revista','2022-10-29'),(6,'REV00006','newWWWW','vewWWW','2022-10-29'),(7,'REV00007','BBBBB','CCCCC','2022-10-22');
/*!40000 ALTER TABLE `revista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipomaterial`
--

DROP TABLE IF EXISTS `tipomaterial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipomaterial` (
  `codigoTipoMaterial` int(11) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `codigoTipoMaterialPadre` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigoTipoMaterial`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipomaterial`
--

LOCK TABLES `tipomaterial` WRITE;
/*!40000 ALTER TABLE `tipomaterial` DISABLE KEYS */;
INSERT INTO `tipomaterial` VALUES (1,'Material',NULL),(2,'Material escrito',1),(3,'Material audiovisual',1),(4,'Libro',2),(5,'Revista',2),(6,'CD',3),(7,'DVD',3);
/*!40000 ALTER TABLE `tipomaterial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'mediateca'
--

--
-- Dumping routines for database 'mediateca'
--
/*!50003 DROP PROCEDURE IF EXISTS `delete_material` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_material`(codmaterial varchar(8))
BEGIN
DECLARE codtipomat int;

SELECT codigoTipoMaterial INTO codtipomat from material WHERE codigoMaterial = codmaterial limit 1;

IF codtipomat = 4 THEN
	delete from `mediateca`.`material` where `material`.`codigoMaterial` = codmaterial;
    delete from `mediateca`.`libro` where `libro`.`codigoMaterialL` = codmaterial;

END IF;

IF codtipomat = 5 THEN
	delete from `mediateca`.`material` where `material`.`codigoMaterial` = codmaterial;
    delete from `mediateca`.`revista` where `revista`.`codigoMaterialR` = codmaterial;
    
END IF;

IF codtipomat = 6 THEN
	delete from `mediateca`.`material` where `material`.`codigoMaterial` = codmaterial;
    delete from `mediateca`.`cd` where `cd`.`CodigoMaterialC` = codmaterial;
    
END IF;

IF codtipomat = 7 THEN
	delete from `mediateca`.`material` where `material`.`codigoMaterial` = codmaterial;
    delete from `mediateca`.`dvd` where `dvd`.`codigoMaterialD` = codmaterial;
    
END IF;



END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `get_materiales` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_materiales`(search varchar(1000))
BEGIN

IF LENGTH(search) > 0 THEN
   select * from material where codigoMaterial like CONCAT(search, '%', '');
ELSE
   select * from material;
END IF;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `get_material_info` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_material_info`(codmaterial varchar(8))
BEGIN
DECLARE codtipomat int;

SELECT codigoTipoMaterial INTO codtipomat from material WHERE codigoMaterial = codmaterial limit 1;

IF codtipomat = 4 THEN
    SELECT 	`libro`.`IdLibro`,
			`libro`.`codigoMaterialL`,
            `material`.`Titulo`,
			`libro`.`Autor`,
			`libro`.`NumeroPaginas`,
			`libro`.`Editorial`,
			`libro`.`ISBN`,
			`libro`.`AñoPublicacion`,
            `material`.`unidadesDisponibles`
	FROM `mediateca`.`libro` 
    INNER JOIN `mediateca`.`material` ON `libro`.`codigoMaterialL` = `material`.`codigoMaterial`
    WHERE `libro`.`codigoMaterialL` = codmaterial;
END IF;

IF codtipomat = 5 THEN
    SELECT 	`revista`.`IdRevista`,
			`revista`.`codigoMaterialR`,
            `material`.`Titulo`,
			`revista`.`Editorial`,
			`revista`.`Periodicidad`,
			`revista`.`FechaPublicacion`,
            `material`.`unidadesDisponibles`
	FROM `mediateca`.`revista`
    INNER JOIN `mediateca`.`material` ON `revista`.`codigoMaterialR` = `material`.`codigoMaterial`
    WHERE `revista`.`codigoMaterialR` = codmaterial;
END IF;

IF codtipomat = 6 THEN
    SELECT 	`cd`.`IdCD`,
			`cd`.`CodigoMaterialC`,
            `material`.`Titulo`,
			`cd`.`Artista`,
			`cd`.`Genero`,
			`cd`.`Duracion`,
			`cd`.`NumeroCanciones`,
            `material`.`unidadesDisponibles`
	FROM `mediateca`.`cd`
    INNER JOIN `mediateca`.`material` ON `cd`.`CodigoMaterialC` = `material`.`codigoMaterial`
    WHERE `cd`.`CodigoMaterialC` = codmaterial;
END IF;

IF codtipomat = 7 THEN
    SELECT 	`dvd`.`IdDVD`,
			`dvd`.`codigoMaterialD`,
            `material`.`Titulo`,
			`dvd`.`Director`,
			`dvd`.`Duracion`,
			`dvd`.`Genero`,
            `material`.`unidadesDisponibles`
	FROM `mediateca`.`dvd`
    INNER JOIN `mediateca`.`material` ON `dvd`.`codigoMaterialD` = `material`.`codigoMaterial`
    WHERE `dvd`.`codigoMaterialD` = codmaterial;
END IF;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `new_upd_cd` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_upd_cd`(
codmaterial varchar(8),
titulo char(100),
artista char(100),
genero char(100),
duracion char(50),
ncanciones int, 
udisp int
)
BEGIN
DECLARE lcodmaterial varchar(8);
DECLARE lDuration TIME;

DECLARE lastID INT Default 0;

SET lDuration = TIME(duracion);


IF LENGTH(codmaterial) = 0 THEN
	SELECT max(IdCD) INTO lastID from cd;
	SET lastID = IFNULL(lastID, 0) + 1;
    SET lcodmaterial = CONCAT('CDA', '', CONVERT( LPAD(CONVERT(lastID, CHAR(5)), 5, '0'), CHAR(10)));
    
    INSERT INTO `mediateca`.`material`(`codigoMaterial`,`Titulo`,`codigoTipoMaterial`,`unidadesDisponibles`)
	VALUES (lcodmaterial, titulo, 6, udisp);

	INSERT INTO `mediateca`.`cd`(`IdCD`,`CodigoMaterialC`,`Artista`,`Genero`,`Duracion`,`NumeroCanciones`)
	VALUES(lastID, lcodmaterial, artista, genero, lDuration, ncanciones);
    
ELSE
	SET SQL_SAFE_UPDATES = 0; 
	UPDATE `mediateca`.`material` SET `Titulo` = titulo, `unidadesDisponibles` = udisp WHERE `codigoMaterial` = codmaterial;
   
   UPDATE `mediateca`.`cd` SET `Artista` = artista, `Duracion` = lDuration, `Genero` = genero, `NumeroCanciones` = ncanciones
   WHERE `CodigoMaterialC` = codmaterial;
END IF;



END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `new_upd_dvd` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_upd_dvd`(
codmaterial varchar(8),
titulo varchar(100),
director varchar(100),
duracion varchar(50),
genero varchar(100)
)
BEGIN
DECLARE lcodmaterial varchar(8);
DECLARE lDuration TIME;
DECLARE lastID INT Default 0;

SET lDuration = TIME(duracion);

IF LENGTH(codmaterial) = 0 THEN
	SELECT max(IdDVD) INTO lastID from dvd;
	SET lastID = IFNULL(lastID, 0) + 1;
    SET lcodmaterial = CONCAT('DVD', '', CONVERT( LPAD(CONVERT(lastID, CHAR(5)), 5, '0'), CHAR(10)));
    
    INSERT INTO `mediateca`.`material`(`codigoMaterial`,`Titulo`,`codigoTipoMaterial`,`unidadesDisponibles`)
	VALUES (lcodmaterial, titulo, 7, 0);

	INSERT INTO `mediateca`.`dvd`(`IdDVD`,`codigoMaterialD`,`Director`,`Duracion`,`Genero`)
	VALUES(lastID,lcodmaterial,director,lDuration,genero);
    
ELSE
	SET SQL_SAFE_UPDATES = 0; 

	UPDATE `mediateca`.`material` SET `Titulo` = titulo WHERE codigoMaterial = codmaterial;
    
	UPDATE `mediateca`.`dvd` SET `Director` = director, `Duracion` = lDuration, `Genero` = genero 
	WHERE `codigoMaterialD` = codmaterial;
END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `new_upd_libro` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_upd_libro`(
codmaterial varchar(8),
titulo varchar(100),
autor varchar(100),
npaginas int,
editorial varchar(60),
isbn int,
anio int,
udisp int
)
BEGIN
DECLARE lcodmaterial varchar(8);
DECLARE lastID INT Default 0;

IF LENGTH(codmaterial) = 0 THEN
	SELECT max(IdLibro) INTO lastID from libro;
	SET lastID = IFNULL(lastID, 0) + 1;
    SET lcodmaterial = CONCAT('LIB', '', CONVERT( LPAD(CONVERT(lastID, CHAR(5)), 5, '0'), CHAR(10)));
    
    INSERT INTO `mediateca`.`material`(`codigoMaterial`,`Titulo`,`codigoTipoMaterial`,`unidadesDisponibles`)
	VALUES (lcodmaterial, titulo, 4, udisp);

	INSERT INTO `mediateca`.`libro`(`IdLibro`,`codigoMaterialL`,`Autor`,`NumeroPaginas`,`Editorial`,`ISBN`,`AñoPublicacion`)
	VALUES(lastID, lcodmaterial, autor, npaginas, editorial, isbn, anio);
    
ELSE
	SET SQL_SAFE_UPDATES = 0; 
	UPDATE `mediateca`.`material` SET `Titulo` = titulo, `unidadesDisponibles` = udisp  WHERE `codigoMaterial` = codmaterial;
   
   UPDATE `mediateca`.`libro` 
   SET `Autor` = autor, `NumeroPaginas` = npaginas, `Editorial` = editorial, 
   `ISBN` = isbn, `AñoPublicacion` = anio
   WHERE `codigoMaterialL` = codmaterial;
END IF;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `new_upd_revista` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_upd_revista`(
codmaterial varchar(8),
titulo char(100),
editorial varchar(100),
periocidad varchar(100),
fechapublic varchar(50),
udisp int
)
BEGIN
DECLARE lcodmaterial varchar(8);
DECLARE lfechapublic date;
DECLARE lastID INT Default 0;

SET lastID = IFNULL(lastID, 0) + 1;
SET lfechapublic = CONVERT(fechapublic, DATE);

IF LENGTH(codmaterial) = 0 THEN
	SELECT max(IdRevista) INTO lastID from revista;
	SET lastID = IFNULL(lastID, 0) + 1;
    SET lcodmaterial = CONCAT('REV', '', CONVERT( LPAD(CONVERT(lastID, CHAR(5)), 5, '0'), CHAR(10)));
    
    INSERT INTO `mediateca`.`material`(`codigoMaterial`,`Titulo`,`codigoTipoMaterial`,`unidadesDisponibles`)
	VALUES (lcodmaterial, titulo, 5, udisp);

	INSERT INTO `mediateca`.`revista`(`IdRevista`,`codigoMaterialR`,`Editorial`,`Periodicidad`,`FechaPublicacion`)
	VALUES(lastID, lcodmaterial, editorial, periocidad, lfechapublic);
    
ELSE
	SET SQL_SAFE_UPDATES = 0; 
	UPDATE `mediateca`.`material` SET `Titulo` = titulo, `unidadesDisponibles` = udisp WHERE `codigoMaterial` = codmaterial;
   
   UPDATE `mediateca`.`revista` SET `Editorial` = editorial, `Periodicidad` = periocidad, 
   `FechaPublicacion` = lfechapublic
   WHERE `codigoMaterialR` = codmaterial;
END IF;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-31 22:13:47
