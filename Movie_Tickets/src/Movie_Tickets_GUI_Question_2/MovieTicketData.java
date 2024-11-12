/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Movie_Tickets_GUI_Question_2;

/**
 *
 * @author damia
 */
public class MovieTicketData {

    //populated class with necessary values neede for the movie tickets
    String name;
    double price;
    int numTickets;

    public MovieTicketData(String name, double price, int numTickets) {
        this.name = name;
        this.price = price;
        this.numTickets = numTickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }

}
