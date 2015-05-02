BEGIN TRANSACTION;
CREATE TABLE `Word` (
	`key`	INTEGER,
	`name`	TEXT,
	`imageURL`	TEXT,
	`imageURL2`	TEXT,
	`soundURL`	TEXT,
	`correct`	INTEGER,
	`type`	INTEGER,
	PRIMARY KEY(key)
);
);
CREATE TABLE `Picture` (
	`key`	INTEGER,
	`name`	TEXT,
	`URL`	TEXT,
	PRIMARY KEY(key)
);
);
CREATE TABLE "Alphabet" (
	`key`	INTEGER,
	`name`	TEXT,
	`imageURL`	TEXT,
	`imageURL2`	TEXT,
	`soundURL`	TEXT,
	PRIMARY KEY(key)
);
);
COMMIT;
