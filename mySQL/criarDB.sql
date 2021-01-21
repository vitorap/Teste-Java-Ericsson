create table Stock(
   idStock INT NOT NULL AUTO_INCREMENT,
   `name` nvarchar(255) UNIQUE,
   PRIMARY KEY (idStock)
);

CREATE TABLE Quote (
  idQuote int(11) NOT NULL AUTO_INCREMENT,
  idStock int(11) DEFAULT NULL,
  `value` float DEFAULT NULL,
  PRIMARY KEY (`idQuote`),
  CONSTRAINT `Stock_Id_FK` 
    FOREIGN KEY (`idStock`) 
    REFERENCES `Stock` (`idStock`)
);