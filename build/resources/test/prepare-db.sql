use popcorn;

truncate table studios;
set FOREIGN_KEY_CHECKS = 1;

insert into studios (created_at, est, name, updated_at, version) values ('2016-08-22', '1901-03-11', 'MGM', '2016-08-22', 0);
insert into studios (created_at, est, name, updated_at, version) values ('2016-08-22', '1901-04-12', 'Fox', '2016-08-22', 0);
insert into studios (created_at, est, name, updated_at, version) values ('2016-08-22', '1901-05-13', 'Universal', '2016-08-22', 0);
insert into studios (created_at, est, name, updated_at, version) values ('2016-08-22', '1901-06-14', 'WB', '2016-08-22', 0);
insert into studios (created_at, est, name, updated_at, version) values ('2016-08-22', '1901-07-15', 'Paramount', '2016-08-22', 0);
