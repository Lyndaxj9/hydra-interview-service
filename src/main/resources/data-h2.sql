-- Populate the TF_INTERVIEW and TF_INTERVIEW_TYPE tables

Insert into TF_INTERVIEW_TYPE (INTERVIEW_TYPE_ID,INTERVIEW_TYPE_NAME) values (1,'Phone');
Insert into TF_INTERVIEW_TYPE (INTERVIEW_TYPE_ID,INTERVIEW_TYPE_NAME) values (2,'Online');
Insert into TF_INTERVIEW_TYPE (INTERVIEW_TYPE_ID,INTERVIEW_TYPE_NAME) values (3,'On, Site');
Insert into TF_INTERVIEW_TYPE (INTERVIEW_TYPE_ID,INTERVIEW_TYPE_NAME) values (4,'Skype');

Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (70,to_timestamp('13-FEB-18 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),null,300,14,null,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (60,to_timestamp('12-FEB-18 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Good',739,1057,null,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (67,to_timestamp('05-FEB-18 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Cleared first round',233,1,null,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (55,to_timestamp('03-MAR-20 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Testing',3,4,null,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (57,to_timestamp('17-MAR-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Good',1,3,null,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (58,to_timestamp('01-JAN-18 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Test From Associate View',4,7,null,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (61,to_timestamp('21-FEB-18 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Interview went well',4,19,null,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (62,to_timestamp('14-FEB-18 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Cleared interview',5,351,null,2);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (63,to_timestamp('20-FEB-18 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Cleared interview',5,351,null,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (64,to_timestamp('20-FEB-18 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Cleared interview',5,351,null,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (65,to_timestamp('21-FEB-18 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Cleared interview',5,351,null,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (66,to_timestamp('22-FEB-18 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),null,5,19,null,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (54,to_timestamp('17-MAR-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Good',1,3,null,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (68,to_timestamp('26-FEB-18 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'This person is a Good Person and requires donuts.',6,1009,null,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (71,to_timestamp('27-FEB-18 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'good luck',276,6,null,2);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (56,to_timestamp('01-JAN-17 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Second Test',3,5,null,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (59,to_timestamp('31-JAN-18 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Testing number 2 from Associate View',4,5,null,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (69,to_timestamp('16-FEB-18 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),null,233,10,null,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (72,to_timestamp('27-FEB-18 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Good luck',278,6,null,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (73,to_timestamp('27-FEB-18 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'god ;uck',282,6,null,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (74,to_timestamp('27-FEB-18 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Room 225',277,6,null,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (1,to_timestamp('01-NOV-17 04.50.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Selected for Next Round',717,577,1251,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (2,to_timestamp('06-NOV-17 06.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Selected for Next Round',717,577,1247,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (3,to_timestamp('03-NOV-17 06.58.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',712,577,1247,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (4,to_timestamp('03-NOV-17 06.59.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',718,577,1247,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (5,to_timestamp('01-NOV-17 05.40.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',722,577,1251,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (6,to_timestamp('01-NOV-17 06.55.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Selected for Next Round',712,577,1251,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (7,to_timestamp('01-NOV-17 08.10.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',712,577,1251,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (8,to_timestamp('01-NOV-17 08.35.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Pending Feedback',725,577,1251,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (9,to_timestamp('03-NOV-17 05.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Selected for Next Round',725,577,1247,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (10,to_timestamp('01-NOV-17 09.25.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',723,577,1251,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (11,to_timestamp('06-NOV-17 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',723,577,1247,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (12,to_timestamp('24-MAY-17 03.30.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',63,577,1245,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (13,to_timestamp('02-JUN-17 02.30.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'No Feedback',63,17,17,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (14,to_timestamp('09-JUN-17 08.30.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',63,577,1243,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (15,to_timestamp('06-JUN-17 02.16.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Client Project (NO Client training)',136,17,17,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (16,to_timestamp('09-JUN-17 12.39.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Client Project (NO Client training)',145,17,17,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (17,to_timestamp('07-JUN-17 07.30.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',58,577,1243,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (18,to_timestamp('15-MAY-17 04.45.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Client Project (NO Client training)',56,225,225,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (19,to_timestamp('03-AUG-17 12.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',137,577,1244,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (20,to_timestamp('04-AUG-17 08.20.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',137,577,1239,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (21,to_timestamp('15-MAY-17 05.45.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Client Project (NO Client training)',60,225,225,3);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (22,to_timestamp('02-AUG-17 12.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',139,577,1244,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (23,to_timestamp('31-MAY-17 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'No Feedback',55,577,1243,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (24,to_timestamp('16-JUN-17 10.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',55,577,1243,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (25,to_timestamp('23-JUN-17 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',55,577,1247,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (26,to_timestamp('27-JUN-17 05.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'No Feedback',55,17,17,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (27,to_timestamp('29-JUN-17 08.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Selected for Next Round',55,20,17,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (28,to_timestamp('07-JUL-17 06.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',55,577,1247,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (29,to_timestamp('16-MAY-17 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',55,577,1243,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (30,to_timestamp('22-MAY-17 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',55,577,1253,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (31,to_timestamp('25-MAY-17 07.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',61,577,1245,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (32,to_timestamp('01-JUN-17 09.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',59,577,1245,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (33,to_timestamp('02-AUG-17 09.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',141,577,1244,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (34,to_timestamp('25-MAY-17 06.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',57,577,1245,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (35,to_timestamp('30-MAY-17 03.30.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',62,577,1243,4);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (36,to_timestamp('09-JUN-17 09.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',62,577,1243,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (37,to_timestamp('22-MAY-17 07.30.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',62,577,1243,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (38,to_timestamp('04-AUG-17 01.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',140,577,1244,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (39,to_timestamp('03-NOV-17 04.30.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Pending Feedback',720,577,1251,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (40,to_timestamp('02-AUG-17 12.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',147,577,1244,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (41,to_timestamp('07-AUG-17 08.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',147,577,1239,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (42,to_timestamp('02-AUG-17 01.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',138,577,1244,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (43,to_timestamp('08-AUG-17 08.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',138,577,1239,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (44,to_timestamp('08-AUG-17 08.50.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',144,577,1239,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (45,to_timestamp('08-AUG-17 09.10.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',143,577,1239,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (46,to_timestamp('02-AUG-17 09.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',142,577,1244,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (47,to_timestamp('02-AUG-17 09.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',149,577,1244,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (48,to_timestamp('08-AUG-17 08.20.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',149,577,1239,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (49,to_timestamp('02-AUG-17 04.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Rejected',146,577,1244,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (50,to_timestamp('08-AUG-17 08.30.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',146,577,1239,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (51,to_timestamp('09-JUN-17 12.39.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Client Project (NO Client training)',148,17,17,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (52,to_timestamp('04-AUG-17 01.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'eIntegerern ,  Selected for Permanent Placement with Client',150,577,1244,1);
Insert into TF_INTERVIEW (INTERVIEW_ID,INTERVIEW_DATE,INTERVIEW_FEEDBACK,ASSOCIATE_ID,CLIENT_ID,END_CLIENT_ID,INTERVIEW_TYPE_ID) values (53,to_timestamp('01-NOV-17 04.00.00.000000000 PM','DD-MON-RR HH.MI.SSXFF AM'),'Selected for Next Round',714,577,1251,3);
