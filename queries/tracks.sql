-- To execute the query, open a terminal and run:
-- sqlite3 db/db.sqlite < queries/example.sql

.mode json
SELECT *
FROM tracks
ORDER BY album_id, track_number ASC;