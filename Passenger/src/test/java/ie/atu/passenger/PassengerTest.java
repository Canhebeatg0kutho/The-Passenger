package ie.atu.passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger title;


    @BeforeEach
    void setUp() {
        title = new Passenger();
    }

    @Test
    void testTitle(){
        assertEquals("Ms",title.getTitle("Ms"));
    }


    @AfterEach
    void tearDown() {
    }
}