-- MySQL Script generated by MySQL Workbench
-- 09/13/16 17:14:45
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema sclbd
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema sclbd
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sclbd` DEFAULT CHARACTER SET utf8 ;
USE `sclbd` ;

-- -----------------------------------------------------
-- Table `sclbd`.`endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`endereco` (
  `id_endereco` INT NOT NULL AUTO_INCREMENT,
  `logradouro` TEXT NULL,
  `bairro` TEXT NULL,
  `cidade` TEXT NULL,
  `estado` VARCHAR(2) NULL,
  `complemento` TEXT NULL,
  `cep` INT NULL,
  `numero` TEXT NULL,
  PRIMARY KEY (`id_endereco`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`contato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`contato` (
  `id_contato` INT NOT NULL AUTO_INCREMENT,
  `telefone1` VARCHAR(45) NULL,
  `telefone2` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`id_contato`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`pessoa` (
  `id_pessoa` INT NOT NULL AUTO_INCREMENT,
  `nome` TEXT NULL,
  `sexo` VARCHAR(2) NULL,
  `dataDeNascimento` DATE NULL,
  `estadoCivil` VARCHAR(20) NULL,
  `cpf` VARCHAR(12) NULL,
  `rg` VARCHAR(10) NULL,
  `endereco_id_endereco1` INT NOT NULL,
  `contato_id_contato1` INT NOT NULL,
  PRIMARY KEY (`id_pessoa`, `endereco_id_endereco1`, `contato_id_contato1`),
  INDEX `fk_pessoa_endereco2_idx` (`endereco_id_endereco1` ASC),
  INDEX `fk_pessoa_contato2_idx` (`contato_id_contato1` ASC),
  CONSTRAINT `fk_pessoa_endereco2`
    FOREIGN KEY (`endereco_id_endereco1`)
    REFERENCES `sclbd`.`endereco` (`id_endereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pessoa_contato2`
    FOREIGN KEY (`contato_id_contato1`)
    REFERENCES `sclbd`.`contato` (`id_contato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`fornecedor` (
  `id_fornecedor` INT NOT NULL AUTO_INCREMENT,
  `razaoSocial` TEXT NULL,
  `nomeFantasia` TEXT NULL,
  `cnpj` VARCHAR(45) NULL,
  `nomeDoContato` VARCHAR(45) NULL,
  `endereco_id_endereco` INT NOT NULL,
  `contato_id_contato1` INT NOT NULL,
  PRIMARY KEY (`id_fornecedor`, `endereco_id_endereco`, `contato_id_contato1`),
  INDEX `fk_fornecedor_endereco1_idx` (`endereco_id_endereco` ASC),
  INDEX `fk_fornecedor_contato2_idx` (`contato_id_contato1` ASC),
  CONSTRAINT `fk_fornecedor_endereco1`
    FOREIGN KEY (`endereco_id_endereco`)
    REFERENCES `sclbd`.`endereco` (`id_endereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_fornecedor_contato2`
    FOREIGN KEY (`contato_id_contato1`)
    REFERENCES `sclbd`.`contato` (`id_contato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  `pessoa_id_pessoa` INT NOT NULL,
  `pessoa_endereco_id_endereco1` INT NOT NULL,
  `pessoa_contato_id_contato1` INT NOT NULL,
  PRIMARY KEY (`id_usuario`, `pessoa_id_pessoa`, `pessoa_endereco_id_endereco1`, `pessoa_contato_id_contato1`),
  INDEX `fk_usuario_pessoa1_idx` (`pessoa_id_pessoa` ASC, `pessoa_endereco_id_endereco1` ASC, `pessoa_contato_id_contato1` ASC),
  CONSTRAINT `fk_usuario_pessoa1`
    FOREIGN KEY (`pessoa_id_pessoa` , `pessoa_endereco_id_endereco1` , `pessoa_contato_id_contato1`)
    REFERENCES `sclbd`.`pessoa` (`id_pessoa` , `endereco_id_endereco1` , `contato_id_contato1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`dependentes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`dependentes` (
  `id_dependentes` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `grauDeParenteso` VARCHAR(45) NULL,
  `dataDeNascimento` DATE NULL,
  PRIMARY KEY (`id_dependentes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`cliente` (
  `id_cliente` INT NOT NULL AUTO_INCREMENT,
  `pessoa_id_pessoa` INT NOT NULL,
  `pessoa_endereco_id_endereco1` INT NOT NULL,
  `pessoa_contato_id_contato1` INT NOT NULL,
  `dependentes_id_dependentes` INT NOT NULL,
  PRIMARY KEY (`id_cliente`, `pessoa_id_pessoa`, `pessoa_endereco_id_endereco1`, `pessoa_contato_id_contato1`, `dependentes_id_dependentes`),
  INDEX `fk_cliente_pessoa1_idx` (`pessoa_id_pessoa` ASC, `pessoa_endereco_id_endereco1` ASC, `pessoa_contato_id_contato1` ASC),
  INDEX `fk_cliente_dependentes1_idx` (`dependentes_id_dependentes` ASC),
  CONSTRAINT `fk_cliente_pessoa1`
    FOREIGN KEY (`pessoa_id_pessoa` , `pessoa_endereco_id_endereco1` , `pessoa_contato_id_contato1`)
    REFERENCES `sclbd`.`pessoa` (`id_pessoa` , `endereco_id_endereco1` , `contato_id_contato1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_dependentes1`
    FOREIGN KEY (`dependentes_id_dependentes`)
    REFERENCES `sclbd`.`dependentes` (`id_dependentes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`genero` (
  `id_genero` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `descricao` VARCHAR(45) NULL,
  PRIMARY KEY (`id_genero`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`categoria` (
  `id_categoria` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `descricao` TEXT NULL,
  `periodoTrocaCategoria` VARCHAR(45) NULL,
  `proximaCategoria` VARCHAR(45) NULL,
  PRIMARY KEY (`id_categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`tipoDeMidia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`tipoDeMidia` (
  `idtipoDeMidia` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `descricao` TEXT NULL,
  PRIMARY KEY (`idtipoDeMidia`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`filmes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`filmes` (
  `id_filmes` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NULL,
  `tituloOriginal` VARCHAR(45) NULL,
  `nomeDiretor` VARCHAR(45) NULL,
  `nomeAtorPrincipal` VARCHAR(45) NULL,
  `nomesPremiacoes` TEXT NULL,
  `anoProducao` DATE NULL,
  `anolancamento` DATE NULL,
  `genero_id_genero` INT NOT NULL,
  `categoria_id_categoria1` INT NOT NULL,
  `tipoDeMidia_idtipoDeMidia` INT NOT NULL,
  PRIMARY KEY (`id_filmes`, `genero_id_genero`, `categoria_id_categoria1`, `tipoDeMidia_idtipoDeMidia`),
  INDEX `fk_filmes_genero1_idx` (`genero_id_genero` ASC),
  INDEX `fk_filmes_categoria2_idx` (`categoria_id_categoria1` ASC),
  INDEX `fk_filmes_tipoDeMidia1_idx` (`tipoDeMidia_idtipoDeMidia` ASC),
  CONSTRAINT `fk_filmes_genero1`
    FOREIGN KEY (`genero_id_genero`)
    REFERENCES `sclbd`.`genero` (`id_genero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_filmes_categoria2`
    FOREIGN KEY (`categoria_id_categoria1`)
    REFERENCES `sclbd`.`categoria` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_filmes_tipoDeMidia1`
    FOREIGN KEY (`tipoDeMidia_idtipoDeMidia`)
    REFERENCES `sclbd`.`tipoDeMidia` (`idtipoDeMidia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sclbd`.`locadora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sclbd`.`locadora` (
  `dataLocacao` DATE NULL,
  `usuario_id_usuario` INT NOT NULL,
  `usuario_pessoa_id_pessoa` INT NOT NULL,
  `usuario_pessoa_endereco_id_endereco1` INT NOT NULL,
  `usuario_pessoa_contato_id_contato1` INT NOT NULL,
  `cliente_id_cliente` INT NOT NULL,
  `cliente_pessoa_id_pessoa` INT NOT NULL,
  `cliente_pessoa_endereco_id_endereco1` INT NOT NULL,
  `cliente_pessoa_contato_id_contato1` INT NOT NULL,
  `cliente_dependentes_id_dependentes` INT NOT NULL,
  `filmes_id_filmes` INT NOT NULL,
  `filmes_genero_id_genero` INT NOT NULL,
  `filmes_categoria_id_categoria1` INT NOT NULL,
  `filmes_tipoDeMidia_idtipoDeMidia` INT NOT NULL,
  PRIMARY KEY (`usuario_id_usuario`, `usuario_pessoa_id_pessoa`, `usuario_pessoa_endereco_id_endereco1`, `usuario_pessoa_contato_id_contato1`, `cliente_id_cliente`, `cliente_pessoa_id_pessoa`, `cliente_pessoa_endereco_id_endereco1`, `cliente_pessoa_contato_id_contato1`, `cliente_dependentes_id_dependentes`, `filmes_id_filmes`, `filmes_genero_id_genero`, `filmes_categoria_id_categoria1`, `filmes_tipoDeMidia_idtipoDeMidia`),
  INDEX `fk_locadora_cliente1_idx` (`cliente_id_cliente` ASC, `cliente_pessoa_id_pessoa` ASC, `cliente_pessoa_endereco_id_endereco1` ASC, `cliente_pessoa_contato_id_contato1` ASC, `cliente_dependentes_id_dependentes` ASC),
  INDEX `fk_locadora_filmes1_idx` (`filmes_id_filmes` ASC, `filmes_genero_id_genero` ASC, `filmes_categoria_id_categoria1` ASC, `filmes_tipoDeMidia_idtipoDeMidia` ASC),
  CONSTRAINT `fk_locadora_usuario1`
    FOREIGN KEY (`usuario_id_usuario` , `usuario_pessoa_id_pessoa` , `usuario_pessoa_endereco_id_endereco1` , `usuario_pessoa_contato_id_contato1`)
    REFERENCES `sclbd`.`usuario` (`id_usuario` , `pessoa_id_pessoa` , `pessoa_endereco_id_endereco1` , `pessoa_contato_id_contato1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_locadora_cliente1`
    FOREIGN KEY (`cliente_id_cliente` , `cliente_pessoa_id_pessoa` , `cliente_pessoa_endereco_id_endereco1` , `cliente_pessoa_contato_id_contato1` , `cliente_dependentes_id_dependentes`)
    REFERENCES `sclbd`.`cliente` (`id_cliente` , `pessoa_id_pessoa` , `pessoa_endereco_id_endereco1` , `pessoa_contato_id_contato1` , `dependentes_id_dependentes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_locadora_filmes1`
    FOREIGN KEY (`filmes_id_filmes` , `filmes_genero_id_genero` , `filmes_categoria_id_categoria1` , `filmes_tipoDeMidia_idtipoDeMidia`)
    REFERENCES `sclbd`.`filmes` (`id_filmes` , `genero_id_genero` , `categoria_id_categoria1` , `tipoDeMidia_idtipoDeMidia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
