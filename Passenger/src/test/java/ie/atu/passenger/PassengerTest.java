package ie.atu.passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger title;
    Passenger name;
    Passenger Id;
    Passenger phone;
    Passenger age;


    @BeforeEach
    void setUp() {
        title = new Passenger();
        name = new Passenger();
        Id = new Passenger();
        phone = new Passenger();
        age = new Passenger();
    }

    @Test
    void testTitle(){
        assertEquals("Ms",title.getTitle("Ms"));
    }

    @Test
    void testName(){assertEquals("John",name.getName("John"));}

    @Test
    void testId(){assertEquals("G0038288011",Id.getId("G0038288011"));}

    @Test
    void testPhone(){assertEquals("0899483215",phone.getPhone("0899483215"));}

    @Test
    void testAge(){assertEquals(16,age.getAge(16));}
    @AfterEach
    void tearDown() {
    }
}