
CREATE TABLE playlists (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    user_id INTEGER NOT NULL,
    name TEXT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE playlist_tracks (
    playlist_id INTEGER,
    track_id TEXT NOT NULL,
    FOREIGN KEY (playlist_id) REFERENCES playlist(id),
    FOREIGN KEY (track_id) REFERENCES tracks(id)
);

-- Debugging
INSERT INTO playlists (user_id, name) VALUES (6, "Anna"),(48732956,"Hala");

INSERT INTO playlist_tracks (playlist_id, track_id) VALUES (789478530, "5pyoxDZ1PX0KxBxiRVxA4U"),(48732956,"5YLGlPYkZBDXieMwzVve7g");


SELECT * FROM playlists;

SELECT * FROM playlist_tracks;

DELETE FROM playlists WHERE user_id = 1;