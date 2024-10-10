-- To execute the query, open a terminal and run:
-- sqlite3 db/db.sqlite < queries/example.sql

.mode json
SELECT albums.*, artists.name AS artist_name
FROM albums
INNER JOIN artists ON albums.artist_id = artists.id
ORDER BY name;