CREATE TABLE tb_hospital(
    id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name varchar(45) NOT NULL,
    address varchar(45) NOT NULL,
    phone varchar(15) NOT NULL
);

CREATE TABLE tb_doctor(
    id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    doctor varchar(30) NOT NULL,
    document_type varchar(25) NOT NULL,
    document varchar(30) NOT NULL,
    id_hospital int NOT NULL,
    FOREIGN KEY(id_hospital) REFERENCES tb_hospital(id) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE tb_pet_owners(
    id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    owner varchar(30) NOT NULL,
    document_type varchar(30) NOT NULL,
    document varchar(30) NOT NULL,
    contact varchar(30) NOT NULL,
    gender varchar(15) NOT NULL
);

CREATE TABLE tb_pet(
    id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name varchar(30) NOT NULL,
    breed varchar(30) NOT NULL,
    gender varchar(10) NOT NULL,
    id_owner_pet int NOT NULL,
    FOREIGN KEY (id_owner_pet) REFERENCES tb_pet_owners(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE tb_pet_hospital(
    id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    id_pet int NOT NULL,
    id_hospital int NOT NULL,
    FOREIGN KEY (id_pet) REFERENCES tb_pet(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (id_hospital) REFERENCES tb_hospital(id) ON DELETE CASCADE ON UPDATE CASCADE);

   
INSERT INTO `tb_pet_owners`(`owner`, `document_type`, `document`, `contact`, `gender`) 
VALUES ('Gustavo','C.C.','79999372','3133223015','Masculino'),
('Manuel','C.C.','10539292','3045458490','Masculino'),
('Valeria','C.E.','10537373','3045458490','Femenino'),
('Federico','Pasaporte','10536464','3045458490','Masculino'),
('Laura','T.I.','109762978','3225689','Femenino'),
('Yaneth','C.C.','108158796','2798465','Femenino');

INSERT INTO tb_hospital(name, address, phone) 
VALUES ('San Miguel','Calle 5A, Medellín','2161929'),
('Mascoticas','Calle 6B, Armenia','3124578'),
('Dover','Calle 127, Bogotá','2147896'),
('El Granjero','Carrera Norte, Pereira','2369874'),
('Zooricatos','Carera Sur, Pereira','2698745');

INSERT INTO `tb_doctor`(`doctor`, `document_type`, `document`, `id_hospital`) VALUES 
('Dr. Felipe','C.C.','10538181',1),
('Dr. Alejandro','C.C.','10539292',2),
('Dr. Esteban','T.I.','10537373',3),
('Dr. Camilo','Pasaporte','778247-6',5),
('Dra. Karina','Pasaporte','787984-7',4),
('Dr. Federico','Pasaporte','105359-4',4);

INSERT INTO tb_pet(name, breed, gender, id_owner_pet)
VALUES ('Juano','Bulldog','Macho',2),
('Poli','Buldog Francés','Hembra',1),
('Dante','Pincher','Macho',6),
('Choko','Boxer','Macho',3),
('Hades','Criollo','Macho',5),
('Zeus','Pastor Alemán','Macho',5),
('Chata','Boxer','Hembra',1),
('Firulais','Criollo','Macho',4);

INSERT INTO `tb_pet_hospital`(`id_pet`, `id_hospital`) 
VALUES  
(1,1),
(2,3),
(2,4),
(2,5),
(3,2),
(4,1),
(5,4),
(5,5),
(6,1),
(7,3),
(8,5);

SELECT * FROM tb_pet_owners tpo

SELECT * FROM tb_pet tp 

SELECT * FROM tb_pet tp INNER JOIN tb_pet_owners tpo ON tp.id_owner_pet = tpo.id ORDER BY tp.id DESC  

/* Query with three tables, tb_pets to tp_pet_owner and tb_breed (Using alias for the headers) */
SELECT tp.id id_pet, tp.name pet_name, tb.name pet_breed, tp.gender pet_gender, tpo.owner pet_owner, tb.pet_type FROM tb_pet tp INNER JOIN tb_pet_owners tpo ON tp.id_pet_owner = tpo.id INNER JOIN tb_breeds tb ON tp.id_pet_breed = tb.id ORDER BY tp.id

/* Same last query but filtered by pet_type */
SELECT tp.id id_pet, tp.name pet_name, tb.name pet_breed, tp.gender pet_gender, tpo.owner pet_owner, tb.pet_type FROM tb_pet tp INNER JOIN tb_pet_owners tpo ON tp.id_pet_owner = tpo.id INNER JOIN tb_breeds tb ON tp.id_pet_breed = tb.id WHERE tb.pet_type = 'Perro' ORDER BY tp.id 

/* Query for list doctors joining tb_hospital */
SELECT td.id id_doctor, td.doctor doctor_name, td.document_type, td.document, th.name hospital_name FROM tb_doctor td INNER JOIN tb_hospital th ON td.id_hospital = th.id ORDER BY td.id 

/* Query for add data to tb_breed */
INSERT INTO tb_breeds(name, pet_type) VALUES()
INSERT INTO tb_breeds(name, pet_type) VALUES('', '');

/* Query for count pets by gender */
SELECT tp.gender pet_gender, COUNT(gender) FROM tb_pet tp GROUP BY gender 

/* Query for count pets by gender */
SELECT tp.breed, COUNT(breed) FROM TB_ 

/* Query for count pet_type from tables tb_pet and tb_breed */
SELECT tb.pet_type, COUNT(tb.pet_type) FROM tb_pet tp INNER JOIN tb_pet_owners tpo ON tp.id_pet_owner = tpo.id INNER JOIN tb_breeds tb ON tp.id_pet_breed = tb.id GROUP BY tb.pet_type 

/* Query for hospitals and doctors */
SELECT td.id id_doctor, td.doctor doctor_name, td.document_type, td.document, th.name hospital_name FROM tb_doctor td INNER JOIN tb_hospital th ON td.id_hospital = th.id ORDER BY td.id


SELECT td.id id_doctor, th.name hospital_name FROM tb_doctor td INNER JOIN tb_hospital th ON td.id_hospital = th.id ORDER BY td.id

SELECT id, owner FROM `tb_pet_owners` WHERE 1

SELECT th.id, th.name hospital_name FROM tb_hospital th 


