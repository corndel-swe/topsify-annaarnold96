-- Two users have signed up!
-- Write a SQL statement to add them to the database

-- [
--   {
--     first_name: 'Vincenza',
--     last_name: 'Kovacek',
--     email: 'Vincenza.Kovacek35@hotmail.com',
--     username: 'Vincenza.Kovacek',
--     password: 'oH_d5pqv7Ne0_Mc'
--   },
--   {
--     first_name: 'Lionel',
--     last_name: 'Ruecker',
--     email: 'Lionel.Ruecker@yahoo.com',
--     username: 'Lionel_Ruecker27',
--     password: '6CGHykGWEzFYRA_'
--   }
-- ]
INSERT INTO users (username,first_name,last_name,email,password)
VALUES ('Vincenza.Kovacek','Vincenza', 'Kovacek','Vincenza.Kovacek35@hotmail.com','oH_d5pqv7Ne0_Mc');

INSERT INTO users (username,first_name,last_name,email,password)
VALUES ('Lionel_Ruecker27', 'Lionel','Ruecker','Lionel.Ruecker@yahoo.com','6CGHykGWEzFYRA_');

