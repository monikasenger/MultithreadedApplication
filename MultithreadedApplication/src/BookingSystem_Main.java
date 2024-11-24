import java.util.Scanner;

/**
 * main class to implement thread
 */

public class BookingSystem_Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
char ans;//variable for user choice
System.out.println("**********Multithreading application**********");
    BookingSystem book=new BookingSystem();   // booking system class instance

        //loop to allow multiple booking
        do{
           book.BookingSystem(); // booking system method
            Thread.sleep(200);
           System.out.print("Do want more:(Y/N) ");
           ans=sc.next().charAt(0);//prompt user response
       }while(ans =='y' || ans=='Y');//continue if user input 'y' or 'Y'2
        System.out.print("ThankYou :) ");

    }
}
