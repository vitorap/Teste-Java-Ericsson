DROP TABLE IF EXISTS Quote cascade;
DROP TABLE IF EXISTS Stock cascade;


create table Stock(
   idStock INT NOT NULL AUTO_INCREMENT,
   `name` nvarchar(255) UNIQUE,
   PRIMARY KEY (idStock)
);

INSERT INTO `Stock` (`idStock`, `name`) VALUES (9, 'ab');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (27, 'accusamus');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (21, 'atque');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (5, 'blanditiis');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (22, 'consectetur');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (12, 'debitis');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (24, 'delectus');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (29, 'dolor');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (8, 'dolore');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (16, 'eos');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (17, 'est');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (13, 'et');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (20, 'eum');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (18, 'incidunt');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (10, 'itaque');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (23, 'libero');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (14, 'maiores');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (6, 'molestias');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (4, 'nisi');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (19, 'praesentium');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (25, 'qui');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (2, 'recusandae');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (15, 'repudiandae');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (3, 'sint');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (26, 'temporibus');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (28, 'tenetur');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (11, 'ut');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (1, 'vel');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (30, 'velit');
INSERT INTO `Stock` (`idStock`, `name`) VALUES (7, 'voluptatem');

DROP TABLE IF EXISTS Quote cascade;
CREATE TABLE Quote (
  idQuote int NOT NULL AUTO_INCREMENT,
  idStock int DEFAULT NULL,
  `value` float DEFAULT NULL,
  PRIMARY KEY (`idQuote`),
  CONSTRAINT `Stock_Id_FK`
    FOREIGN KEY (`idStock`)
    REFERENCES `Stock` (`idStock`)
);

INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (1, 1, '14.46');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (2, 2, '1.03');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (3, 3, '11.05');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (4, 4, '14.65');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (5, 5, '3.83');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (6, 6, '45.94');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (7, 7, '20.74');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (8, 8, '32.44');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (9, 9, '24.25');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (10, 10, '13.69');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (11, 11, '3.83');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (12, 12, '25.8');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (13, 13, '33.91');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (14, 14, '14.42');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (15, 15, '28.42');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (16, 16, '8.31');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (17, 17, '34.5');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (18, 18, '12.71');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (19, 19, '46.64');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (20, 20, '41.31');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (21, 21, '49.61');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (22, 22, '9.65');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (23, 23, '13.43');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (24, 24, '41.59');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (25, 25, '3.43');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (26, 26, '48.7');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (27, 27, '6.7');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (28, 28, '36.17');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (29, 29, '34.65');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (30, 30, '49.43');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (31, 1, '41.73');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (32, 2, '6.88');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (33, 3, '22.36');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (34, 4, '8.21');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (35, 5, '32.3');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (36, 6, '40.28');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (37, 7, '16.68');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (38, 8, '19.62');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (39, 9, '47.73');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (40, 10, '16.09');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (41, 11, '29.45');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (42, 12, '37.01');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (43, 13, '1.17');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (44, 14, '15.89');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (45, 15, '35.41');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (46, 16, '12.85');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (47, 17, '22.44');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (48, 18, '14.96');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (49, 19, '4.18');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (50, 20, '15.39');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (51, 21, '5.93');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (52, 22, '3.43');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (53, 23, '45.28');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (54, 24, '4.12');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (55, 25, '33.88');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (56, 26, '17.44');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (57, 27, '22.23');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (58, 28, '24.63');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (59, 29, '27.08');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (60, 30, '26.32');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (61, 1, '23.7');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (62, 2, '12.75');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (63, 3, '18.3');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (64, 4, '19.24');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (65, 5, '22.68');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (66, 6, '32.78');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (67, 7, '10.52');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (68, 8, '20.08');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (69, 9, '35.37');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (70, 10, '7.24');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (71, 11, '43.22');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (72, 12, '12.03');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (73, 13, '23.59');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (74, 14, '27.21');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (75, 15, '8.22');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (76, 16, '10.46');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (77, 17, '6.67');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (78, 18, '36.69');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (79, 19, '18.28');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (80, 20, '37.29');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (81, 21, '16.33');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (82, 22, '19.62');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (83, 23, '17.01');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (84, 24, '49.82');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (85, 25, '0.13');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (86, 26, '10.77');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (87, 27, '14.59');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (88, 28, '5.54');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (89, 29, '49.34');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (90, 30, '30.66');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (91, 1, '1.55');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (92, 2, '34.48');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (93, 3, '40.47');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (94, 4, '38.13');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (95, 5, '7.28');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (96, 6, '16.37');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (97, 7, '21.06');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (98, 8, '22.13');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (99, 9, '29.77');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (100, 10, '12.21');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (101, 11, '31.23');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (102, 12, '3.18');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (103, 13, '43.56');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (104, 14, '45.56');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (105, 15, '44.55');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (106, 16, '7.68');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (107, 17, '41.29');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (108, 18, '35.15');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (109, 19, '3.24');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (110, 20, '4.89');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (111, 21, '32.15');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (112, 22, '36.39');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (113, 23, '36.93');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (114, 24, '49.57');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (115, 25, '33.14');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (116, 26, '26.91');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (117, 27, '24.92');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (118, 28, '7.36');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (119, 29, '20.17');
INSERT INTO `Quote` (`idQuote`, `idStock`, `value`) VALUES (120, 30, '1.34');


