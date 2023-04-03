-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 03 avr. 2023 à 02:01
-- Version du serveur : 10.4.27-MariaDB
-- Version de PHP : 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `glovo1`
--

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

CREATE TABLE `commande` (
  `id_commande` int(11) NOT NULL,
  `numero` text NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `livreur1`
--

CREATE TABLE `livreur1` (
  `Livreur_ID` int(11) NOT NULL,
  `Livreur_NP` varchar(255) DEFAULT NULL,
  `Livreur_Tel` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `livreur1`
--

INSERT INTO `livreur1` (`Livreur_ID`, `Livreur_NP`, `Livreur_Tel`) VALUES
(1, 'liv1', '000000000'),
(2, 'liv3', '200000000'),
(3, 'liv2', '100000000'),
(4, 'liv4', '9890890890808'),
(5, 'test', '00009'),
(6, 'yoyo', '48589479545'),
(7, 'ksjdhfkjsdfkjsd', '348594385748'),
(8, 'yyyy', '4545'),
(9, 'zzzz', '09009090909');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `livreur1`
--
ALTER TABLE `livreur1`
  ADD PRIMARY KEY (`Livreur_ID`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `livreur1`
--
ALTER TABLE `livreur1`
  MODIFY `Livreur_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
