-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Sam 12 Janvier 2019 à 11:40
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `bdaaa`
--

-- --------------------------------------------------------

--
-- Structure de la table `liste1`
--

CREATE TABLE IF NOT EXISTS `liste1` (
  `nom` varchar(11) NOT NULL,
  `prenom` varchar(10) NOT NULL,
  `speculation` varchar(15) NOT NULL,
  `rendement` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `producteur`
--

CREATE TABLE IF NOT EXISTS `producteur` (
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(15) NOT NULL,
  `speculation` varchar(30) NOT NULL,
  `rendement` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `producteur`
--

INSERT INTO `producteur` (`nom`, `prenom`, `speculation`, `rendement`) VALUES
('morel', 'alan', 'Apiculture', 8),
('morel', 'alan', 'Apiculture', 8),
('morel', 'alan', 'Apiculture', 8),
('djanko', 'jack', 'Pisciculture', 5),
('morel', 'alan', 'Apiculture', 8),
('djanko', 'jack', 'Pisciculture', 5),
('morel', 'alan', 'Apiculture', 8),
('djanko', 'jack', 'Pisciculture', 5),
('morel', 'alan', 'Apiculture', 8),
('djanko', 'jack', 'Pisciculture', 5),
('morel', 'alan', 'Apiculture', 8),
('gohui', 'stephane', 'maraicheres', 80),
('seukep', 'jules', 'cacaoculteur', 2),
('daniel', 'fouomeneu', 'infomaculture', 200),
('daniel', 'fouomeneu', 'infomaculture', 200),
('fodjeu', 'fabrice', 'paysagiste', 9),
('fodjeu', 'fabrice', 'paysagiste', 9),
('miafo', 'christian', 'ananeraie', 47),
('miafo', 'christian', 'ananeraie', 47),
('Magne', 'flore', 'hévéacultrice', 47),
('Nzongang', 'pierre', 'céréalier', 4),
('Nzongang', 'pierre', 'céréalier', 4),
('alain', 'alino', 'cacaoculteur', 2),
('TIKI', 'Sandra', 'informaculteur', 8),
('pppp', 'ppp', 'ppp', 22),
('pppp', 'ppp', 'ppp', 22),
('pppp', 'ppp', 'ppp', 22),
('pppp', 'jjjjj', 'uuuu', 2),
('ddd', 'ggg', 'aa', 12),
('Daniel', 'Ayango', 'maîs', 7),
('bitollo', 'bitollo', 'riz', 3);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
