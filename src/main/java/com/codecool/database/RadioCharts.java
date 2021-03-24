package com.codecool.database;


import java.sql.*;
import java.sql.DriverManager;


public class RadioCharts {
    private static String DB_URL;
    private static String DB_USER;
    private static String DB_PASSWORD;

    public Connection connection = null;

    public RadioCharts(String DB_URL, String DB_USER, String DB_PASSWORD) {
        this.DB_URL = DB_URL;
        this.DB_USER = DB_USER;
        this.DB_PASSWORD = DB_PASSWORD;
        getConnection();
    }

    public Connection getConnection() {
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connect;
    }

    public String getMostPlayedSong() {

        String sql = "";
        return sql;
    }

    public String getMostActiveArtist() {
        String sql = "";
        return sql;
    }
}
