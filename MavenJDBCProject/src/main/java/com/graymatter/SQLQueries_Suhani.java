
{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil\fcharset0 Arial;}}
{\*\generator Riched20 10.0.19041}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\qc\ul\b\fs28\lang9 SQL Queries\par

\pard\sa200\sl276\slmult1\ulnone\fs20 Name\b0 : Suhani Aggarwal\fs28\par

\pard\sa200\sl276\slmult1\fs22\par
CREATE TABLE regions (\par
\tab region_id INT (11) AUTO_INCREMENT PRIMARY KEY,\par
\tab region_name VARCHAR (25) DEFAULT NULL\par
);\par
\par
CREATE TABLE countries (\par
\tab country_id CHAR (2) PRIMARY KEY,\par
\tab country_name VARCHAR (40) DEFAULT NULL,\par
\tab region_id INT (11) NOT NULL,\par
\tab FOREIGN KEY (region_id) REFERENCES regions (region_id) ON DELETE CASCADE ON UPDATE CASCADE\par
);\par
\par
CREATE TABLE locations (\par
\tab location_id INT (11) AUTO_INCREMENT PRIMARY KEY,\par
\tab street_address VARCHAR (40) DEFAULT NULL,\par
\tab postal_code VARCHAR (12) DEFAULT NULL,\par
\tab city VARCHAR (30) NOT NULL,\par
\tab state_province VARCHAR (25) DEFAULT NULL,\par
\tab country_id CHAR (2) NOT NULL,\par
\tab FOREIGN KEY (country_id) REFERENCES countries (country_id) ON DELETE CASCADE ON UPDATE CASCADE\par
);\par
\par
CREATE TABLE jobs (\par
\tab job_id INT (11) AUTO_INCREMENT PRIMARY KEY,\par
\tab job_title VARCHAR (35) NOT NULL,\par
\tab min_salary DECIMAL (8, 2) DEFAULT NULL,\par
\tab max_salary DECIMAL (8, 2) DEFAULT NULL\par
);\par
\par
CREATE TABLE departments (\par
\tab department_id INT (11) AUTO_INCREMENT PRIMARY KEY,\par
\tab department_name VARCHAR (30) NOT NULL,\par
\tab location_id INT (11) DEFAULT NULL,\par
\tab FOREIGN KEY (location_id) REFERENCES locations (location_id) ON DELETE CASCADE ON UPDATE CASCADE\par
);\par
\par
CREATE TABLE employees (\par
\tab employee_id INT (11) AUTO_INCREMENT PRIMARY KEY,\par
\tab first_name VARCHAR (20) DEFAULT NULL,\par
\tab last_name VARCHAR (25) NOT NULL,\par
\tab email VARCHAR (100) NOT NULL,\par
\tab phone_number VARCHAR (20) DEFAULT NULL,\par
\tab hire_date DATE NOT NULL,\par
\tab job_id INT (11) NOT NULL,\par
\tab salary DECIMAL (8, 2) NOT NULL,\par
\tab manager_id INT (11) DEFAULT NULL,\par
\tab department_id INT (11) DEFAULT NULL,\par
\tab FOREIGN KEY (job_id) REFERENCES jobs (job_id) ON DELETE CASCADE ON UPDATE CASCADE,\par
\tab FOREIGN KEY (department_id) REFERENCES departments (department_id) ON DELETE CASCADE ON UPDATE CASCADE,\par
\tab FOREIGN KEY (manager_id) REFERENCES employees (employee_id)\par
);\par
\par
CREATE TABLE dependents (\par
\par
\tab dependent_id INT (11) AUTO_INCREMENT PRIMARY KEY,\par
\tab first_name VARCHAR (50) NOT NULL,\par
\tab last_name VARCHAR (50) NOT NULL,\par
\tab relationship VARCHAR (25) NOT NULL,\par
\tab employee_id INT (11) NOT NULL,\par
\tab FOREIGN KEY (employee_id) REFERENCES employees (employee_id) ON DELETE CASCADE ON UPDATE CASCADE\par
);\par
\par
\par
INSERT INTO regions(region_id,region_name) VALUES (1,'Europe');\par
INSERT INTO regions(region_id,region_name) VALUES (2,'Americas');\par
INSERT INTO regions(region_id,region_name) VALUES (3,'Asia');\par
INSERT INTO regions(region_id,region_name) VALUES (4,'Middle East and Africa');\par
\par
\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('AR','Argentina',2);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('AU','Australia',3);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('BE','Belgium',1);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('BR','Brazil',2);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('CA','Canada',2);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('CH','Switzerland',1);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('CN','China',3);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('DE','Germany',1);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('DK','Denmark',1);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('EG','Egypt',4);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('FR','France',1);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('HK','HongKong',3);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('IL','Israel',4);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('IN','India',3);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('IT','Italy',1);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('JP','Japan',3);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('KW','Kuwait',4);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('MX','Mexico',2);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('NG','Nigeria',4);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('NL','Netherlands',1);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('SG','Singapore',3);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('UK','United Kingdom',1);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('US','United States of America',2);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('ZM','Zambia',4);\par
INSERT INTO countries(country_id,country_name,region_id) VALUES ('ZW','Zimbabwe',4);\par
\par
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES (1400,'2014 Jabberwocky Rd','26192','Southlake','Texas','US');\par
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES (1500,'2011 Interiors Blvd','99236','South San Francisco','California','US');\par
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES (1700,'2004 Charade Rd','98199','Seattle','Washington','US');\par
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES (1800,'147 Spadina Ave','M5V 2L7','Toronto','Ontario','CA');\par
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES (2400,'8204 Arthur St',NULL,'London',NULL,'UK');\par
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES (2500,'Magdalen Centre, The Oxford Science Park','OX9 9ZB','Oxford','Oxford','UK');\par
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES (2700,'Schwanthalerstr. 7031','80925','Munich','Bavaria','DE');\par
\par
\par
\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (1,'Public Accountant',4200.00,9000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (2,'Accounting Manager',8200.00,16000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (3,'Administration Assistant',3000.00,6000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (4,'President',20000.00,40000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (5,'Administration Vice President',15000.00,30000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (6,'Accountant',4200.00,9000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (7,'Finance Manager',8200.00,16000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (8,'Human Resources Representative',4000.00,9000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (9,'Programmer',4000.00,10000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (10,'Marketing Manager',9000.00,15000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (11,'Marketing Representative',4000.00,9000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (12,'Public Relations Representative',4500.00,10500.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (13,'Purchasing Clerk',2500.00,5500.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (14,'Purchasing Manager',8000.00,15000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (15,'Sales Manager',10000.00,20000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (16,'Sales Representative',6000.00,12000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (17,'Shipping Clerk',2500.00,5500.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (18,'Stock Clerk',2000.00,5000.00);\par
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES (19,'Stock Manager',5500.00,8500.00);\par
\par
\par
\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (1,'Administration',1700);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (2,'Marketing',1800);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (3,'Purchasing',1700);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (4,'Human Resources',2400);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (5,'Shipping',1500);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (6,'IT',1400);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (7,'Public Relations',2700);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (8,'Sales',2500);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (9,'Executive',1700);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (10,'Finance',1700);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (11,'Accounting',1700);\par
INSERT INTO departments(department_id,department_name,location_id) VALUES (12,'Full stack',1700);\par
\par
\par
\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (100,'Steven','King','steven.king@sqltutorial.org','515.123.4567','1987-06-17',4,24000.00,NULL,9);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (101,'Neena','Kochhar','neena.kochhar@sqltutorial.org','515.123.4568','1989-09-21',5,17000.00,100,9);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (102,'Lex','De Haan','lex.de haan@sqltutorial.org','515.123.4569','1993-01-13',5,17000.00,100,9);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (103,'Alexander','Hunold','alexander.hunold@sqltutorial.org','590.423.4567','1990-01-03',9,9000.00,102,6);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (104,'Bruce','Ernst','bruce.ernst@sqltutorial.org','590.423.4568','1991-05-21',9,6000.00,103,6);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (105,'David','Austin','david.austin@sqltutorial.org','590.423.4569','1997-06-25',9,4800.00,103,6);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (106,'Valli','Pataballa','valli.pataballa@sqltutorial.org','590.423.4560','1998-02-05',9,4800.00,103,6);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (107,'Diana','Lorentz','diana.lorentz@sqltutorial.org','590.423.5567','1999-02-07',9,4200.00,103,6);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (108,'Nancy','Greenberg','nancy.greenberg@sqltutorial.org','515.124.4569','1994-08-17',7,12000.00,101,10);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (109,'Daniel','Faviet','daniel.faviet@sqltutorial.org','515.124.4169','1994-08-16',6,9000.00,108,10);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (110,'John','Chen','john.chen@sqltutorial.org','515.124.4269','1997-09-28',6,8200.00,108,10);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (111,'Ismael','Sciarra','ismael.sciarra@sqltutorial.org','515.124.4369','1997-09-30',6,7700.00,108,10);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (112,'Jose Manuel','Urman','jose manuel.urman@sqltutorial.org','515.124.4469','1998-03-07',6,7800.00,108,10);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (113,'Luis','Popp','luis.popp@sqltutorial.org','515.124.4567','1999-12-07',6,6900.00,108,10);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (114,'Den','Raphaely','den.raphaely@sqltutorial.org','515.127.4561','1994-12-07',14,11000.00,100,3);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (115,'Alexander','Khoo','alexander.khoo@sqltutorial.org','515.127.4562','1995-05-18',13,3100.00,114,3);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (116,'Shelli','Baida','shelli.baida@sqltutorial.org','515.127.4563','1997-12-24',13,2900.00,114,3);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (117,'Sigal','Tobias','sigal.tobias@sqltutorial.org','515.127.4564','1997-07-24',13,2800.00,114,3);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (118,'Guy','Himuro','guy.himuro@sqltutorial.org','515.127.4565','1998-11-15',13,2600.00,114,3);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (119,'Karen','Colmenares','karen.colmenares@sqltutorial.org','515.127.4566','1999-08-10',13,2500.00,114,3);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (120,'Matthew','Weiss','matthew.weiss@sqltutorial.org','650.123.1234','1996-07-18',19,8000.00,100,5);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (121,'Adam','Fripp','adam.fripp@sqltutorial.org','650.123.2234','1997-04-10',19,8200.00,100,5);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (122,'Payam','Kaufling','payam.kaufling@sqltutorial.org','650.123.3234','1995-05-01',19,7900.00,100,5);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (123,'Shanta','Vollman','shanta.vollman@sqltutorial.org','650.123.4234','1997-10-10',19,6500.00,100,5);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (126,'Irene','Mikkilineni','irene.mikkilineni@sqltutorial.org','650.124.1224','1998-09-28',18,2700.00,120,5);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (145,'John','Russell','john.russell@sqltutorial.org',NULL,'1996-10-01',15,14000.00,100,8);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (146,'Karen','Partners','karen.partners@sqltutorial.org',NULL,'1997-01-05',15,13500.00,100,8);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (176,'Jonathon','Taylor','jonathon.taylor@sqltutorial.org',NULL,'1998-03-24',16,8600.00,100,8);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (177,'Jack','Livingston','jack.livingston@sqltutorial.org',NULL,'1998-04-23',16,8400.00,100,8);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (178,'Kimberely','Grant','kimberely.grant@sqltutorial.org',NULL,'1999-05-24',16,7000.00,100,8);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (179,'Charles','Johnson','charles.johnson@sqltutorial.org',NULL,'2000-01-04',16,6200.00,100,8);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (192,'Sarah','Bell','sarah.bell@sqltutorial.org','650.501.1876','1996-02-04',17,4000.00,123,5);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (193,'Britney','Everett','britney.everett@sqltutorial.org','650.501.2876','1997-03-03',17,3900.00,123,5);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (200,'Jennifer','Whalen','jennifer.whalen@sqltutorial.org','515.123.4444','1987-09-17',3,4400.00,101,1);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (201,'Michael','Hartstein','michael.hartstein@sqltutorial.org','515.123.5555','1996-02-17',10,13000.00,100,2);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (202,'Pat','Fay','pat.fay@sqltutorial.org','603.123.6666','1997-08-17',11,6000.00,201,2);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (203,'Susan','Mavris','susan.mavris@sqltutorial.org','515.123.7777','1994-06-07',8,6500.00,101,4);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (204,'Hermann','Baer','hermann.baer@sqltutorial.org','515.123.8888','1994-06-07',12,10000.00,101,7);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (205,'Shelley','Higgins','shelley.higgins@sqltutorial.org','515.123.8080','1994-06-07',2,12000.00,101,11);\par
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (206,'William','Gietz','william.gietz@sqltutorial.org','515.123.8181','1994-06-07',1,8300.00,205,11);\par
\par
\par
\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (1,'Penelope','Gietz','Child',206);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (2,'Nick','Higgins','Child',205);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (3,'Ed','Whalen','Child',200);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (4,'Jennifer','King','Child',100);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (5,'Johnny','Kochhar','Child',101);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (6,'Bette','De Haan','Child',102);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (7,'Grace','Faviet','Child',109);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (8,'Matthew','Chen','Child',110);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (9,'Joe','Sciarra','Child',111);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (10,'Christian','Urman','Child',112);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (11,'Zero','Popp','Child',113);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (12,'Karl','Greenberg','Child',108);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (13,'Uma','Mavris','Child',203);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (14,'Vivien','Hunold','Child',103);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (15,'Cuba','Ernst','Child',104);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (16,'Fred','Austin','Child',105);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (17,'Helen','Pataballa','Child',106);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (18,'Dan','Lorentz','Child',107);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (19,'Bob','Hartstein','Child',201);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (20,'Lucille','Fay','Child',202);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (21,'Kirsten','Baer','Child',204);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (22,'Elvis','Khoo','Child',115);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (23,'Sandra','Baida','Child',116);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (24,'Cameron','Tobias','Child',117);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (25,'Kevin','Himuro','Child',118);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (26,'Rip','Colmenares','Child',119);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (27,'Julia','Raphaely','Child',114);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (28,'Woody','Russell','Child',145);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (29,'Alec','Partners','Child',146);\par
INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES (30,'Sandra','Taylor','Child',176);\par
\par
show tables;\par
\par
SELECT * FROM employees;\par
\par
SELECT * FROM countries c, regions r WHERE  c.region_id = 3 AND r.region_id = 3;\par
\par
SELECT * FROM locations ORDER BY location_id;\par
\par
SELECT * FROM countries group by country_name;\par
\par
SET sql_mode = '';\par
\par
SELECT department_id, salary from employees group by department_id having salary>8000;\par
\par
SELECT * FROM departments;\par
\par
SELECT distinct department_ID from employees;\par
\par
SELECT * from employees e Inner Join departments d on d.department_id = e.department_id;\par
\par
SELECT * from departments d Left Join employees e on d.department_id = e.department_id;\par
\par
SELECT * from employees e Right Join departments d on d.department_id = e.department_id;\par
\par
SELECT * from employees e CROSS JOIN departments d;\par
\par
SELECT * from employees where first_name like "a%";\par
SELECT * from countries where country_id in ("DE","DK","EG","FR","HK");\par
SELECT * FROM employees where salary between 6000 and 9000;\par
SELECT * from DEPARTMENTS where department_name like '%ing';\par
SELECT * from dependents where relationship not like "child"; \par
SELECT avg(salary) 'Average salary' from employees;\par
SELECT max(salary) max_salary from employees;\par
SELECT * from regions;\par
select * from countries;\par
CREATE TABLE users(userid varchar (10) Primary KEY, age int, mobno int);\par
}

