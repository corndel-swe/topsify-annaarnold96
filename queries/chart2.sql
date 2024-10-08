.mode json

SELECT artists.name AS artist_name, albums.name AS album_name,
AVG(features.danceability) AS average_danceability,
AVG(features.energy) AS average_energy,
AVG(features.speechiness) AS average_speechiness,
AVG(features.acousticness) AS average_acousticness,
AVG(features.liveness) AS average_liveness
FROM features
INNER JOIN tracks ON tracks.id = features.track_id
INNER JOIN albums ON albums.id = tracks.album_id
INNER JOIN artists ON artists.id = albums.artist_id
GROUP BY albums.id;
