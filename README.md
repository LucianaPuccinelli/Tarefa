O banco de dados se chama tarefa_quinta

CREATE TABLE `tarefa` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` TEXT NOT NULL,
  `data_criacao` DATE NOT NULL,
  `data_prevista` DATE NOT NULL,
  `data_encerramento` DATE NULL,
  `situacao` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id`));
