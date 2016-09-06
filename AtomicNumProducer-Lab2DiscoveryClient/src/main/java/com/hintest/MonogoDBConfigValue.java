package com.hintest;

/**
 * Created by hinlam on 6/9/2016.
 */
public class MonogoDBConfigValue {

    private String database;
    private String username;
    private String password;

    public MonogoDBConfigValue(String database, String username, String password) {
        this.database = database;
        this.username = username;
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
