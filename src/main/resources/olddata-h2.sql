--------------------------------------------------------
--  DDL for Sequence TRAINEE_ID_SEQUENCE
--------------------------------------------------------
-- In case a table needs to be created. Commented out because it creates more problems than it solves.
DROP TABLE IF EXISTS CALIBER_INTERVIEW;
CREATE TABLE IF NOT EXISTS CALIBER_INTERVIEW (INTERVIEW_ID INT(11) PRIMARY KEY,ASSOCIATE_ID INT(11) NOT NULL,INTERVIEW_TYPE_ID INT(11) NOT NULL,CLIENT_ID INT(11) NOT NULL,END_CLIENT_ID INT(11) NOT NULL,INTERVIEW_DATE TIMESTAMP,INTERVIEW_FEEDBACK VARCHAR(2000));
-- DROP SEQUENCE IF EXISTS INTERVIEW_ID_SEQUENCE;
-- CREATE SEQUENCE  IF NOT EXISTS  INTERVIEW_ID_SEQUENCE  MINVALUE 5600  INCREMENT BY 1 START WITH 5600;




Insert into CALIBER_INTERVIEW (INTERVIEW_ID,ASSOCIATE_ID,INTERVIEW_TYPE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_FEEDBACK) values (1,5500,1,1,2,'Feedback');
Insert into CALIBER_INTERVIEW (INTERVIEW_ID,ASSOCIATE_ID,INTERVIEW_TYPE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_FEEDBACK) values (5,5500,1,1,2,'back');
Insert into CALIBER_INTERVIEW (INTERVIEW_ID,ASSOCIATE_ID,INTERVIEW_TYPE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_FEEDBACK) values (6,5501,1,1,2,'beep');
Insert into CALIBER_INTERVIEW (INTERVIEW_ID,ASSOCIATE_ID,INTERVIEW_TYPE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_FEEDBACK) values (7,5502,1,1,2,'boop');