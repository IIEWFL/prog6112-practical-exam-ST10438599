/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Movie_Tickets_GUI_Question_2;

/**
 *
 * @author damia
 */
public class MovieTickets implements IMovieTickets {

    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketprice) {

        double price = 0;
        double VAT = 0.14;

        //included all factors in calculation
        price = (numberOfTickets * ticketprice) * VAT;

        return price;

    }

    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {

        boolean isValid = false;

        //checked all validation measures are correct 
        if (!movieTicketData.getName().isEmpty()
                && movieTicketData.getPrice() > 0
                && movieTicketData.getNumTickets() > 0) {

            isValid = true;

        }

        return isValid;

    }

}
