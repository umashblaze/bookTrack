CREATE SCHEMA `booktrack` ;
CREATE TABLE `booktrack`.`user` (
  `userId` VARCHAR(100) NOT NULL,
  `passowrd` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `phoneNo` VARCHAR(45) NULL,
  `address` VARCHAR(100) NULL,
  `city` VARCHAR(45) NULL,
  PRIMARY KEY (`userId`));
  
  CREATE TABLE `booktrack`.`book` (
  `book_number` VARCHAR(45) NOT NULL,
  `book_name` VARCHAR(45) NULL,
  `book_author` VARCHAR(45) NULL,
  `book_price` VARCHAR(45) NULL,
  `book_publication` VARCHAR(45) NULL,
  `created_date` DATE NULL,
  PRIMARY KEY (`book_number`));
  
  ALTER TABLE `booktrack`.`user` 
ADD COLUMN `created_date` DATE NULL AFTER `city`;

CREATE TABLE `booktrack`.`student` (
  `userId` VARCHAR(45) NOT NULL,
  `parent_name` VARCHAR(45) NULL,
  `parent_contact` VARCHAR(45) NULL,
  `due_amount` VARCHAR(45) NULL,
  PRIMARY KEY (`userId`));