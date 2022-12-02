package com.example.tourist_application;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegisterTest {
    @Test
    void ShouldaddUserToDatabase() {
        User testUser = new User();
        testUser.id = 1;
        testUser.name = "Michael Scott";
        testUser.email = "mike@gmail.com";
        testUser.phone = "6945639754";
        testUser.address = "Kostaki 41";
        testUser.password = "veryGoodPassword";
        testUser.favourites = "a coffee store";

        int expectedInteger =1;
        int actualInteger=testUser.id;
        assertEquals(expectedInteger,actualInteger);

        String expectedString= "Michael Scott";
        String actualString = testUser.name;
        assertEquals(expectedString,actualString);

        expectedString="mike@gmail.com";
        actualString = testUser.email;
        assertEquals(expectedString,actualString);

        expectedString= "6945639754";
        actualString = testUser.phone;
        assertEquals(expectedString,actualString);

        expectedString= "Kostaki 41";
        actualString = testUser.address;
        assertEquals(expectedString,actualString);

        expectedString= "veryGoodPassword";
        actualString = testUser.password;
        assertEquals(expectedString,actualString);

        expectedString = "a coffee store";
        actualString = testUser.favourites;
        assertEquals(expectedString,actualString);

    }
}