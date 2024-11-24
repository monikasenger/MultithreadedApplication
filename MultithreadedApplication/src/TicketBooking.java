import java.util.Scanner;

/**
 * class for booking the ticket
 */

public class TicketBooking {
  static int availableTickets;  //  available tickets

    // constructor to initialize the available tickets
    public TicketBooking(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    // synchronized method to ensure only one thread can book a ticket at a time
    public synchronized void bookTicket(String customerName) {
        // condition to check if there are any available tickets
        if (availableTickets > 0) {
            System.out.println(customerName + " is booking a ticket.");
            availableTickets--;  // decrease  number of available tickets
            System.out.println(customerName + " booked a ticket. Tickets left: " + availableTickets);
        } else {
            // condition for no tickets are left, print a message
            System.out.println("No tickets available for " + customerName);
        }
    }

    // getter method to retrieve the number of available tickets
    public int getAvailableTickets() {
        return availableTickets;
    }
}

