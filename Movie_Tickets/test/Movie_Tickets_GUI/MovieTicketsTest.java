/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Movie_Tickets_GUI;

import Movie_Tickets_GUI_Question_2.MovieTickets;
import Movie_Tickets_GUI_Question_2.MovieTicketData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author damia
 */
public class MovieTicketsTest {
    
    public MovieTicketsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of CalculateTotalTicketPrice method, of class MovieTickets.
     */
    @Test
    public void testCalculateTotalTicketPrice() {
        System.out.println("CalculateTotalTicketPrice");
        int numberOfTickets = 10;
        double ticketprice = 123.0;
        MovieTickets instance = new MovieTickets();
        double expResult = 172.2;
        double result = instance.CalculateTotalTicketPrice(numberOfTickets, ticketprice);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of ValidateData method, of class MovieTickets.
     */
    @Test
    public void testValidateData() {
        System.out.println("ValidateData");
        MovieTicketData movieTicketData = new MovieTicketData(" ", 1223, 12);
        MovieTickets instance = new MovieTickets();
        boolean expResult = false;
        boolean result = instance.ValidateData(movieTicketData);
        assertEquals(expResult, result);
    }
    
}
