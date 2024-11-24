/**
 * class for customer thread
 */

public class CustomerThread extends Thread {
 static TicketBooking bookingSystem;  //  TicketBooking object
    static String customerName;  // Customer name to identify

    // constructor to initialize  booking system and customer name
    public CustomerThread(TicketBooking bookingSystem, String customerName) {
        this.bookingSystem = bookingSystem;  // set the shared booking system
        this.customerName = customerName;   // set the customer name
    }

    // run method  for the thread's execution
    @Override
    public void run() {
        // Each customer tries to book a ticket
        bookingSystem.bookTicket(customerName);
    }
}
