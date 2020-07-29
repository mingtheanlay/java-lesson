CREATE DATABASE users;
USE users;

CREATE TABLE students(
    sno int IDENTITY(1,1) PRIMARY KEY,
    stuName VARCHAR(100),
    stuAddress VARCHAR(100),
    gender VARCHAR(6),
    knowledge VARCHAR(100),
    stuSubject VARCHAR(100)
);

INSERT INTO dbo.students (stuName, stuAddress, gender, knowledge, stuSubject)
VALUES ('Thean','Phnom Penh','Male','Java','Computer Science');

SELECT TOP (1000) [sno]
      ,[stuName]
      ,[stuAddress]
      ,[gender]
      ,[knowledge]
      ,[stuSubject]
  FROM [users].[dbo].[students]

