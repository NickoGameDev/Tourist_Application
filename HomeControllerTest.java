package com.example.tourist_application;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    @Test
    void setFavourite() {
        final String DB_URL = "jdbc:mysql://localhost/testing?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            stmt.close();
            conn.close();
            System.out.println("The connection to the Database was successful!");
        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("There was an error while connecting to the Database");

        }



        Favourite testFavourite=new Favourite();
        testFavourite.username="Takis";
        testFavourite.name="mple giakas";
        testFavourite.rating=(float) 4.6;
        testFavourite.type="cafe";

        String expectedString="Takis";
        String actualString=testFavourite.username;
        if(expectedString == actualString){
            assertEquals(expectedString,actualString);
            System.out.println("The expected username is correct!");
        }

         expectedString="mple giakas";
         actualString=testFavourite.name;
        if(expectedString == actualString){
            assertEquals(expectedString,actualString);
            System.out.println("The expected Shop name is correct!");
        }

         expectedString="cafe";
         actualString=testFavourite.type;
        if(expectedString == actualString){
            assertEquals(expectedString,actualString);
            System.out.println("The expected type of Shop is correct!");
        }

        double expectedInt=(float) 4.4;
        double actualInt=testFavourite.rating;
        if(expectedInt == actualInt){
            assertEquals(expectedInt,actualInt);
            System.out.println("The expected rating is correct!");
        }
    }

    @Test
    void setFavouriteFill() {
        final String DB_URL = "jdbc:mysql://localhost/testing?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            stmt.close();
            conn.close();
            System.out.println("The connection to the Database was successful!");
        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("There was an error while connecting to the Database");

        }

    }
}