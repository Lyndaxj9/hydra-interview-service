--------------------------------------------------------
--  DDL for Sequence TRAINEE_ID_SEQUENCE
--------------------------------------------------------
-- In case a table needs to be created. Commented out because it creates more problems than it solves.
-- DROP TABLE IF EXISTS CALIBER_INTERVIEW;
-- CREATE TABLE IF NOT EXISTS CALIBER_INTERVIEW (CLIENT_ID INT(11) PRIMARY KEY,CLIENT_NAME VARCHAR(256) NOT NULL);
-- DROP SEQUENCE IF EXISTS CLIENT_ID_SEQUENCE;
-- CREATE SEQUENCE  IF NOT EXISTS  CLIENT_ID_SEQUENCE  MINVALUE 5600  INCREMENT BY 1 START WITH 5600;




Insert into CALIBER_INTERVIEW (INTERVIEW_ID,ASSOCIATE_ID,INTERVIEW_TYPE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_FEEDBACK) values (1,5500,1,1,2,'Feedback');
Insert into CALIBER_INTERVIEW (INTERVIEW_ID,ASSOCIATE_ID,INTERVIEW_TYPE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_FEEDBACK) values (5,5500,1,1,2,'back');