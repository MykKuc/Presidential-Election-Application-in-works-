CREATE TABLE voters
(
	id INT UNIQUE NOT NULL PRIMARY KEY,
	region VARCHAR(50) NOT NULL,
	vote VARCHAR(15) DEFAULT NULL	
);
--Insert voters into table.
INSERT INTO voters
VALUES (1,'midlands'),
(2,'east'),
(3,'west'),
(4,'east'),
(5,'midlands'),
(6,'east'),
(7,'west'),
(8,'east'),
(9,'midlands'),
(10,'east'),
(11,'west'),
(12,'midlands'),
(13,'west'),
(14,'west'),
(15,'west'),
(16,'midlands'),
(17,'midlands'),
(18,'east'),
(19,'east'),
(20,'west');