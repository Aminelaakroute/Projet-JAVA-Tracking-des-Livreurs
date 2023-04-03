package com.demo.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public abstract class DatabaseConnection<T> {
    private static DatabaseConnection instance = null;
    private Connection connection = null;
    private final String DB_URL = "jdbc:mysql://100.0.0.1:3306/glovo1";
    private final String USER = "root";
    private final String PASSWORD = "";

    DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            displayErrorAlert("JDBC driver not found");
        } catch (SQLException e) {
            displayErrorAlert("Database connection failed");
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection() {

                @Override
                public void Save(Object object) throws SQLException {

                }

                @Override
                public void Update(Object object) throws SQLException {

                }

                @Override
                public void Remove(Object object) throws SQLException {

                }

                @Override
                public List getAll() throws SQLException {
                    return null;
                }

                @Override
                public Object getOne(Long id) throws SQLException {
                    return null;
                }
            };
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            displayErrorAlert("Failed to close database connection");
        }
    }

    public void displayErrorAlert(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText(message);
        alert.showAndWait();
    }


    public abstract void Save( T object ) throws SQLException;

    public abstract void Update( T object ) throws SQLException ;

    public abstract void Remove( T object ) throws SQLException ;


    public abstract List<T> getAll() throws SQLException ;


    public abstract T getOne( Long id  ) throws SQLException  ;
}


