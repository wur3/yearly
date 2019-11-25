DROP TABLE IF EXISTS events;
CREATE TABLE events (
  id INT AUTO_INCREMENT PRIMARY KEY,
  day INT NOT NULL,
  month INT NOT NULL,
  desc VARCHAR(250) NOT NULL
);

INSERT INTO events (month, day, desc) VALUES
  (9, 8, 'Friend''s Birthday'),
  (3, 16, 'Friend''s Wedding'),
  (3, 16, 'Bank Heist'),
  (9, 11, '9/11'),
  (6, 7, 'Wedding Anniversary');