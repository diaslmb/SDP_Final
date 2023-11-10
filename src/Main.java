// Main.java
import main.java.cli.CLI;
// Main.java
import main.java.observer.BookingObserver;  // Import statement for BookingObserver
import main.java.observer.BookingObserverImpl;
import main.java.observer.BarberObserver;  // Import statement for BookingObserver
import main.java.observer.BarberObserverImpl;
public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI();

        // Create instances of observers and register them with the CLI
        BookingObserver bookingObserver = new BookingObserverImpl();
        BarberObserver barberObserver = new BarberObserverImpl();

        cli.addBookingObserver(bookingObserver);
        cli.addBarberObserver(barberObserver);

        cli.start();
    }
}
