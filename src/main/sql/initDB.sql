DROP TABLE IF EXISTS counter;
DROP TABLE IF EXISTS users;



CREATE TABLE counter
(
  id SERIAL PRIMARY KEY,
  count int
);

CREATE TABLE game
(
  id SERIAL PRIMARY KEY,
  name varchar(40),
  game varchar(900)
);