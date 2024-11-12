/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package movie_tickets;

import movie_tickets_Question_1.Movie_Tickets;
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
public class Movie_TicketsTest {
    
    public Movie_TicketsTest() {
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
     * Test of Totalmoviesales method, of class Movie_Tickets.
     */
    @Test
    public void testTotalmoviesales() {
        System.out.println("Totalmoviesales");
        int[] movieTicketSales = {2000,2000,3000};
        Movie_Tickets instance = new Movie_Tickets();
        int expResult = 7000;
        int result = instance.Totalmoviesales(movieTicketSales);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of TopMovie method, of class Movie_Tickets.
     */
    @Test
    public void testTopMovie() {
        System.out.println("TopMovie");
        String[] movies = {"napolean","Shrek"};
        int[] totalSales = {20000,5676};
        Movie_Tickets instance = new Movie_Tickets();
        String expResult = "napolean";
        String result = instance.TopMovie(movies, totalSales);
        assertEquals(expResult, result);
    }

   
    
}
