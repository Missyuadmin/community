create table comment
(
	id BIGINT auto_increment,
	parent_id BIGINT not null,
	type int not null,
	commentator int not null,
	gmt_create BIGINT not null,
	gmt_modified bigint not null,
	like_count bigint default 0,
	constraint comment_pk
		primary key (id)
);