/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movie_tickets_Question_1;

/**
 *
 * @author damia
 */
public class Movie_Tickets implements IMovieTickets {

    //instantiated all values needed for the report
    static int[][] movieTicketSales = {{3000, 1500, 1700}, {3500, 1200, 1600}};

    static String[] months = {"JAN", "FEB", "MAR"};

    static String[] movies = {"Napoleon", "Oppenheimer"};

    @Override
    public int Totalmoviesales(int[] movieTicketSales) {

        int cost = 0;

        //calculates each movies total tickt sales
        for (int index = 0; index < movieTicketSales.length; index++) {

            cost += movieTicketSales[index];

        }

        return cost;

    }

    @Override
    public String TopMovie(String[] movies, int[] totalSales) {

        //index for the value with the highest sales
        int index = 0;
        if (totalSales[index] < totalSales[index + 1]) {
            index = 1;
        }

        //finds the movie with the most ticket sales
        return movies[index];

    }

    //method to print the report
    public void printReport() {
        String topMovie = null;

        String output = "\nMOVIE TICKET SALES REPORT - 2024\n";
        output += String.format("%-15s %-15s %-15s %-15s ",
                "", months[0], months[1], months[2]);
        output += "\n--------------------------------------------------------\n";
        for (int row = 0; row < movieTicketSales.length; row++) {
            output += String.format("%-15s %-15s %-15s %-15s",
                    movies[row], movieTicketSales[row][0], movieTicketSales[row][1], movieTicketSales[row][2]) + "\n";
        }
        // calculate the total ticket sales for each movie 
        for (int row = 0; row < movieTicketSales.length; row++) {
            output += "\nTotal movie ticket sales for  " + movies[row] + " " + Totalmoviesales(movieTicketSales[row]);

            //find the top performing movie
            topMovie = TopMovie(movies, movieTicketSales[row]);

        }
        output += "\n";

        output += "\n\nTop performing movie : " + topMovie;

        System.out.println(output);
    }

}
