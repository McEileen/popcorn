use popcorn;

truncate table studios;
truncate table movies;
set FOREIGN_KEY_CHECKS = 1;

insert into studios (created_at, est, name, updated_at, version) values ('2016-08-22', '1901-03-11', 'MGM', '2016-08-22', 0);
insert into studios (created_at, est, name, updated_at, version) values ('2016-08-22', '1901-04-12', 'Fox', '2016-08-22', 0);
insert into studios (created_at, est, name, updated_at, version) values ('2016-08-22', '1901-05-13', 'Universal', '2016-08-22', 0);
insert into studios (created_at, est, name, updated_at, version) values ('2016-08-22', '1901-06-14', 'WB', '2016-08-22', 0);
insert into studios (created_at, est, name, updated_at, version) values ('2016-08-22', '1901-07-15', 'Paramount', '2016-08-22', 0);



INSERT INTO `popcorn`.`movies` (`version`, `name`, `released`, `created_at`, `updated_at`, `genre`, `rating`, `studio_id`)
VALUES
  ('0', 'The Matrix', '1999-03-15', '2001-01-11', '2001-01-11', 'scifi', 'r', '1'),
  ('0', 'Avatar', '1998-03-15', '2001-01-11', '2001-01-11', 'scifi', 'pg', '2'),
  ('0', 'Star Wars I', '1998-03-15', '2001-01-11', '2001-01-11', 'scifi', 'pg', '2'),
  ('0', 'Harry Potter', '1998-03-15', '2001-01-11', '2001-01-11', 'scifi', 'pg', '2'),
  ('0', 'Lord of the Rings', '1998-03-15', '2001-01-11', '2001-01-11', 'scifi', 'pg', '2'),
  ('0', 'Titantic', '1997-03-15', '2001-01-11', '2001-01-11', 'action', 'pg', '2');