package com.codecool.de;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {


    public Connection getConnection() throws IOException, SQLException {

        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/connection.properties"));
        final String DATABASE = "jdbc:postgresql://" + br.readLine() + "/" + br.readLine();
        final String DB_USER = br.readLine();
        final String DB_PASSWORD = br.readLine();
        br.close();

        return DriverManager.getConnection(
                DATABASE,
                DB_USER,
                DB_PASSWORD);
    }

    public void executeQuery(String query) {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
        ) {
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
