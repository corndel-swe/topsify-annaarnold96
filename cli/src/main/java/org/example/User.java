package org.example;

public class User {

    private String id;
    private String username;
    private String first_name;
    private String  last_name;
    private String email;
    private String avatar;
    private String password;

    public User (String id, String username, String first_name, String last_name, String email, String avatar, String password) {
        this.id = id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.avatar = avatar;
        this.password = password;
    }
}
