create table USER
(
	ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
	ACCOUNT_ID varchar(100),
	NAME varchar(50),
	TOKEN character(36),
	GMT_CREATE bigint,
	GMT_MODIFIED bigint
);