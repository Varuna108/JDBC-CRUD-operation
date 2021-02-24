package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static helpers.Environments.*;

public class DBWorker {
    private Connection connection;

    public DBWorker() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД открыто!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (!connection.isClosed()) {
                connection.close();
                System.out.println("Соединение с БД закрыто!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}

