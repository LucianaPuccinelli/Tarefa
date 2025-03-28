-- MySQL Script generated by MySQL Workbench
-- Fri Mar 28 02:16:41 2025
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema tarefa_quinta
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema tarefa_quinta
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tarefa_quinta` DEFAULT CHARACTER SET utf8 ;
USE `tarefa_quinta` ;

-- -----------------------------------------------------
-- Table `tarefa_quinta`.`tarefa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tarefa_quinta`.`tarefa` ;

CREATE TABLE IF NOT EXISTS `tarefa_quinta`.`tarefa` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` TEXT NOT NULL,
  `data_criacao` DATE NOT NULL,
  `data_prevista` DATE NOT NULL,
  `data_encerramento` DATE NULL,
  `situacao` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
