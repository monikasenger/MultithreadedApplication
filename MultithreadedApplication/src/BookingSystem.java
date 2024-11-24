import java.util.Scanner;

/**
 * class of booking system for available tickets
 */
public class BookingSystem {
    public static void BookingSystem(){
        // create a Scanner instance
        Scanner sc = new Scanner(System.in);

        // ssk from user how available ticket need
        System.out.print("Enter the number of available tickets: ");
        int availableTickets = sc.nextInt();  // get  number of tickets from  user

        // create TicketBooking instace
        TicketBooking ticketBooking = new TicketBooking(availableTickets);

        // create multiple thread to book tickets
        CustomerThread customer1 = new CustomerThread(ticketBooking, "Customer 1");
        CustomerThread customer2 = new CustomerThread(ticketBooking, "Customer 2");
        CustomerThread customer3 = new CustomerThread(ticketBooking, "Customer 3");
        CustomerThread customer4 = new CustomerThread(ticketBooking, "Customer 4");
        CustomerThread customer5 = new CustomerThread(ticketBooking, "Customer 5");
        CustomerThread customer6 = new CustomerThread(ticketBooking, "Customer 6");

        // start the threads
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
        customer5.start();
        customer6.start();

    }
}
