CREATE TABLE candidates (
	list_number  INT UNIQUE PRIMARY KEY NOT NULL,
	full_name VARCHAR(50) NOT NULL,
	agenda TEXT NOT NULL
);

INSERT INTO candidates(list_number,full_name, agenda)
VALUES (1,'Maria DiBrakova','Make taxes smaller, increase governemt spending for defense'), 
		(2,'John Don', 'Decrease governmet spending and we have to be aware of environment'),
		(3,'Candidate AI','I am AI and I will overtake the country. '),
		(4,'Mark Lens','We need to focus on healthcare');