-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: coelho_rapido
-- ------------------------------------------------------
-- Server version	5.6.35-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrador` (
  `id_admin` int(11) NOT NULL AUTO_INCREMENT,
  `nome_admin` varchar(50) NOT NULL,
  `codigo` char(11) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `sexo` char(9) NOT NULL,
  `data_nasc` varchar(11) NOT NULL,
  PRIMARY KEY (`id_admin`),
  UNIQUE KEY `codigo` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (1,'Adriano werpel','12345','Rua José Antonio Benhame','Masculino','13/07/1985'),(2,'Joana Neris','54321','Rua João Lustosa','Feminino','13/09/1970');
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cidade_entrega`
--

DROP TABLE IF EXISTS `cidade_entrega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cidade_entrega` (
  `id_cidade` int(11) NOT NULL AUTO_INCREMENT,
  `nome_cid` varchar(50) NOT NULL,
  `distancia` double(10,2) NOT NULL,
  `tempo_entrega` varchar(15) NOT NULL,
  `valor_entrega` double(10,2) NOT NULL,
  PRIMARY KEY (`id_cidade`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade_entrega`
--

LOCK TABLES `cidade_entrega` WRITE;
/*!40000 ALTER TABLE `cidade_entrega` DISABLE KEYS */;
INSERT INTO `cidade_entrega` VALUES (1,'Argirita',72.00,'1 Dia',72.00),(2,'Belo Horizonte',275.00,'3 Dias',275.00),(7,'Carandaí',141.00,'2 Dias',141.00),(8,'Diamantina',555.00,'6 Dias',555.00),(9,'Governador Valadares',454.00,'5 Dias',454.00),(10,'Itabirito',271.00,'3 Dias',271.00),(11,'Leopoldina',97.00,'1 Dia',97.00),(12,'Muriaé',159.00,'2 Dias',159.00),(13,'Ouro Preto',231.00,'3 Dias',231.00),(14,'Poços de Caldas',454.00,'5 Dias',454.00),(15,'Rio Pomba',75.00,'1 Dia',75.00),(16,'São João Del Rei',170.00,'2 Dias',170.00),(17,'Três Marias',521.00,'6 Dias',521.00),(18,'Uberlandia',800.00,'9 Dias',800.00),(19,'Viçosa',173.00,'2 Dias',173.00);
/*!40000 ALTER TABLE `cidade_entrega` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome_cli` varchar(50) NOT NULL,
  `cpf` char(11) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `sexo` char(9) NOT NULL,
  `data_nasc` varchar(11) NOT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'José Maria Marin','123456','Rua Souza Cruz','Masculino','20/10/2000'),(2,'Joana Freitas','654321','Avenida Santa Kuzia','Feminino','01/02/2002'),(3,'Manoel Carlos de Amorin','111111','Ruas José Pereira,236 Bairro Manoel Honório','Masculino','09/04/1990'),(4,'Joana Dos Santos Reis','222222','Avenida Barão do Rio Branco,1100 - Centro','Feminino','05/03/1995'),(5,'Leticia Souza da Silva','333333','Avenida Rui Barbosa,550 - Santa Terezinha','Feminino','10/10/1987'),(6,'Jaqueline Winitcher','444444','Rua Oscar Vidal,330 apto 206 - Centro','Feminino','09/05/1980'),(7,'Teodorio Sampaio de almeida','555555','Rua São Mateus,1000 apto 505 - São Matheus','Masculino','10/12/1972');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `id_login` int(11) NOT NULL AUTO_INCREMENT,
  `cpf_login` char(11) DEFAULT NULL,
  `cnh_login` char(11) DEFAULT NULL,
  `cod_login` char(11) DEFAULT NULL,
  `senha` varchar(30) NOT NULL,
  PRIMARY KEY (`id_login`),
  UNIQUE KEY `cpf_login` (`cpf_login`),
  UNIQUE KEY `cnh_login` (`cnh_login`),
  UNIQUE KEY `cod_login` (`cod_login`),
  CONSTRAINT `fk_cnh_login` FOREIGN KEY (`cnh_login`) REFERENCES `motorista` (`cnh`),
  CONSTRAINT `fk_cod_login` FOREIGN KEY (`cod_login`) REFERENCES `administrador` (`codigo`),
  CONSTRAINT `fk_cpf_login` FOREIGN KEY (`cpf_login`) REFERENCES `cliente` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,NULL,NULL,'12345','12345'),(2,NULL,NULL,'54321','54321'),(3,'123456',NULL,NULL,'123456'),(4,'654321',NULL,NULL,'654321'),(5,NULL,'123456',NULL,'123456'),(6,NULL,'654321',NULL,'654321'),(7,NULL,'56789',NULL,'56789'),(8,'111111',NULL,NULL,'111111'),(9,'222222',NULL,NULL,'222222'),(10,'333333',NULL,NULL,'333333'),(11,'444444',NULL,NULL,'444444'),(12,'555555',NULL,NULL,'555555'),(13,NULL,'666666',NULL,'666666'),(14,NULL,'777777',NULL,'777777'),(15,NULL,'888888',NULL,'888888'),(16,NULL,'999999',NULL,'999999');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `motorista`
--

DROP TABLE IF EXISTS `motorista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `motorista` (
  `id_motorista` int(11) NOT NULL AUTO_INCREMENT,
  `nome_mot` varchar(50) NOT NULL,
  `cnh` char(11) NOT NULL,
  `categoria` char(1) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `sexo` char(9) NOT NULL,
  `data_nasc` varchar(11) NOT NULL,
  `status_mot` varchar(20) NOT NULL,
  PRIMARY KEY (`id_motorista`),
  UNIQUE KEY `cnh` (`cnh`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `motorista`
--

LOCK TABLES `motorista` WRITE;
/*!40000 ALTER TABLE `motorista` DISABLE KEYS */;
INSERT INTO `motorista` VALUES (1,'Paulo Roberto','123456','B','Avenida Rio Branco','Masculino','23/08/1984','Disponível'),(2,'Marcela Lima','654321','A','Avenida Juscelino Kubstchek','Feminino','30/07/1995','Disponivel'),(3,'Marcelo Alencar','56789','C','Avenida Dos Andradas','Masculino','30/07/1980','Disponivel'),(4,'Andre Alves da silva','666666','D','Rua José Peixoto,333 - Santa Luzia','Masculino','31/08/1967','Disponivel'),(5,'Leonardo Lopes de Carvalho','777777','C','Avenida 7 de Setembro,450 - Costa Carvalho','Masculino','09/03/1979','Disponivel'),(6,'Romualdo Pires de Alcantara','888888','E','Avenida Santa Luzia, 400 - Santa Luzia','Masculino','25/07/1967','Disponivel'),(7,'Maria Lucia de Almeida','999999','B','Rua Paracatu, 472 apt 303 - Santa Terezinha','Feminino','29/02/1992','Disponivel');
/*!40000 ALTER TABLE `motorista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidos` (
  `id_pedido` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  `cpf_cliente` char(11) NOT NULL,
  `cnh_motorista` char(11) DEFAULT NULL,
  `cidade_id` int(11) NOT NULL,
  `cidade_atual` varchar(50) NOT NULL,
  `veiculo` varchar(30) NOT NULL,
  `data_pedido` varchar(11) NOT NULL,
  `valor_pedido` double(10,2) NOT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`id_pedido`),
  KEY `fk_cpf_cliente` (`cpf_cliente`),
  KEY `fk_cnh_motorista` (`cnh_motorista`),
  KEY `fk_id_cidade` (`cidade_id`),
  CONSTRAINT `fk_cnh_motorista` FOREIGN KEY (`cnh_motorista`) REFERENCES `motorista` (`cnh`),
  CONSTRAINT `fk_cpf_cliente` FOREIGN KEY (`cpf_cliente`) REFERENCES `cliente` (`cpf`),
  CONSTRAINT `fk_id_cidade` FOREIGN KEY (`cidade_id`) REFERENCES `cidade_entrega` (`id_cidade`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (8,'Colchão de Casal com molas','123456','123456',7,'Carandaí','Medio - Carro','02/12/2017',176.25,'Entregue'),(9,'Celular Samsung J5','654321',NULL,12,'Juiz de Fora','Pequeno - Moto','02/12/2017',159.00,'Pendente'),(10,'Guarda Roupas 4 Portas com Espelho','111111',NULL,18,'Juiz de Fora','Grande - Caminhão','02/12/2017',1200.00,'Pendente'),(11,'Guitarra Gibson Zack Wylde','222222',NULL,10,'Juiz de Fora','Medio - Carro','02/12/2017',338.75,'Pendente'),(12,'Guitarra Fender','222222',NULL,9,'Juiz de Fora','Medio - Carro','02/12/2017',567.50,'Pendente'),(13,'Notebook Asus core i7','333333',NULL,2,'Juiz de Fora','Pequeno - Moto','02/12/2017',275.00,'Pendente'),(14,'Computador Desktop Core i3','333333',NULL,2,'Juiz de Fora','Medio - Carro','02/12/2017',343.75,'Pendente'),(15,'Computador Desktop Core i3','333333',NULL,17,'Juiz de Fora','Medio - Carro','02/12/2017',651.25,'Pendente'),(16,'Cama Box','444444',NULL,17,'Juiz de Fora','Grande - Caminhão','02/12/2017',781.50,'Pendente'),(17,'Carroceria Gol g5','444444',NULL,15,'Juiz de Fora','Grande - Caminhão','02/12/2017',112.50,'Pendente'),(18,'Panela de Arroz Mondial 4 xicaras','555555',NULL,12,'Juiz de Fora','Pequeno - Moto','02/12/2017',159.00,'Pendente'),(19,'Fritadeira Eletrica airfryer','555555',NULL,8,'Juiz de Fora','Pequeno - Moto','02/12/2017',555.00,'Pendente'),(20,'Fogão 6 bocas Eletrolux','555555',NULL,8,'Juiz de Fora','Medio - Carro','02/12/2017',693.75,'Pendente'),(21,'sofa retratil bege','123456','123456',13,'Ouro Preto','Grande - Caminhão','02/12/2017',346.50,'Entregue');
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-02 18:03:15
