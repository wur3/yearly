DROP TABLE IF EXISTS events;

CREATE TABLE events (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  day INT NOT NULL,
  month INT NOT NULL,
  desc VARCHAR(250) NOT NULL
);

INSERT INTO events (month, day, desc) VALUES
  (9, 8, 'My birthday'),
  (9, 16, 'TS'),
  (11, 7, 'FS');