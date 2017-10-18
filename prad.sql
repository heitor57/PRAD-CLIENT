-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 18-Out-2017 às 04:41
-- Versão do servidor: 10.1.10-MariaDB
-- PHP Version: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prad`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cidade`
--

CREATE TABLE `cidade` (
  `CID_CODIGO` int(11) NOT NULL,
  `CID_NOME` varchar(100) NOT NULL,
  `CID_UF` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cidade`
--

INSERT INTO `cidade` (`CID_CODIGO`, `CID_NOME`, `CID_UF`) VALUES
(1, 'gfd', 'fdf'),
(2, 'gfd', 'ddfdf'),
(3, 'dsadsa', '12'),
(4, 'dsadsadasdsa', 'dsadsa'),
(5, 'das', 'dsadsa'),
(6, 'dsadsa', 'dsadsaasd'),
(7, 'dsadsa', 'sadsad');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `CLI_CODIGO` int(11) NOT NULL,
  `CLI_NOME` varchar(100) NOT NULL,
  `CLI_EMAIL` varchar(100) NOT NULL,
  `CLI_TELEFONE` varchar(20) NOT NULL,
  `CLI_SENHA` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`CLI_CODIGO`, `CLI_NOME`, `CLI_EMAIL`, `CLI_TELEFONE`, `CLI_SENHA`) VALUES
(1, 'ewqewqewqdsad', '32sddsadsasad', '(32)1321-2312', ''),
(2, 'sdsadsa', 'dsadsasadsadsad', '(32)1321-3212', ''),
(3, '', '', '(  )    -    ', ''),
(4, 'ddsasddasasd', 'dsadsasdasdaasdasd', '(32)3132-1321', ''),
(5, 'DDDDD', 'DSADSA', '(31)2132-1233', ''),
(6, 'sadasd', '32dsasddsadas', '(32)1322-3123', ''),
(7, 'DDDDD', 'dssaddsa', '(23)2332-1321', ''),
(8, 'DDDDD', 'DSADSA', '(31)2132-1233', ''),
(9, 'heitor', 'heitorwerneck@hotmail.com', '(23)2131-1323', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cidade`
--
ALTER TABLE `cidade`
  ADD PRIMARY KEY (`CID_CODIGO`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`CLI_CODIGO`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cidade`
--
ALTER TABLE `cidade`
  MODIFY `CID_CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `CLI_CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
