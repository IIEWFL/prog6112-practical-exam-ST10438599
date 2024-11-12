/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Movie_Tickets_GUI_Question_2;

/**
 *
 * @author damia
 */
public interface IMovieTickets {

    //populated interface 
    double CalculateTotalTicketPrice(int numberOfTickets, double ticketprice);

    boolean ValidateData(MovieTicketData movieTicketData);

}
