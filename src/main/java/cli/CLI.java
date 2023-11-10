package main.java.cli;

import main.java.factory.*;
import main.java.observer.*;
import main.java.singleton.BarberShopSingleton;
import main.java.adapter.TimeAdapter;
import main.java.strategy.*;
import main.java.decorator.*;
import main.java.Booking;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI {
    private Scanner scanner;
    private BarberShopSingleton barberShop;
    private List<BookingObserver> bookingObservers;
    private List<BarberObserver> barberObservers;
    private TimeAdapter timeAdapter;
    private List<Customer> customers = new ArrayList<>();

    public CLI() {
        this.scanner = new Scanner(System.in);
        this.barberShop = BarberShopSingleton.getInstance();
        this.bookingObservers = new ArrayList<>();
        this.barberObservers = new ArrayList<>();
        this.timeAdapter = new TimeAdapter();
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Enter customer information");
            System.out.println("2. List barbers");
            System.out.println("3. List services");
            System.out.println("4. Book an appointment");
            System.out.println("5. Cancel booking");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    listBarbers();
                    break;
                case 3:
                    listServices();
                    break;
                case 4:
                    bookAppointment();
                    break;
                case 5:
                    cancelBooking();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter customer age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        Customer customer = new Customer(name, surname, age);
        customers.add(customer);

        System.out.println("Customer added successfully!");

        // Notify observers about the added customer
        for (BookingObserver observer : bookingObservers) {
            observer.update("Customer added - Name: " + name + ", Surname: " + surname + ", Age: " + age);
        }
    }

    private void listBarbers() {
        System.out.println("List of Barbers:");

        // Create instances of barbers for each category
        BarberCategory juniorBarber1 = new JuniorBarber("Darkhan", 2, 25);
        BarberCategory juniorBarber2 = new JuniorBarber("Kobylandy", 3, 26);

        BarberCategory stylistBarber1 = new StylistBarber("Samat", 5, 30);
        BarberCategory stylistBarber2 = new StylistBarber("Temirkhan", 6, 32);

        BarberCategory proBarber1 = new ProBarber("Batyr", 10, 40);
        BarberCategory proBarber2 = new ProBarber("Aldiyar", 12, 38);

        // Display barbers information
        displayBarberInformation(juniorBarber1);
        displayBarberInformation(juniorBarber2);
        displayBarberInformation(stylistBarber1);
        displayBarberInformation(stylistBarber2);
        displayBarberInformation(proBarber1);
        displayBarberInformation(proBarber2);

        // Notify observers about listing barbers
        for (BarberObserver observer : barberObservers) {
            observer.update("Barbers are listed.");
        }
    }

    private void listServices() {
        System.out.println("List of Services:");

        // Create instances of services
        HaircutService classicHaircut = new ClassicHaircut();
        HaircutService fadeHaircut = new FadeHaircut();
        HaircutService kidsHaircut = new KidsHaircut();
        HaircutService shave = new Shave();

        // Display services information
        displayServiceInformation(classicHaircut);
        displayServiceInformation(fadeHaircut);
        displayServiceInformation(kidsHaircut);
        displayServiceInformation(shave);

        // Notify observers about listing services
        for (BookingObserver observer : bookingObservers) {
            observer.update("Services are listed.");
        }
    }

    private void displayServiceInformation(HaircutService service) {
        System.out.println("Service: " + service.getDescription());
        System.out.println("Price: " + service.getPrice() + "₸");
        System.out.println();
    }

    private void bookAppointment() {
        System.out.println("Booking an appointment:");

        BarberFactory barberFactory = getBarberFactory();
        BarberCategory barber = barberFactory.createBarber();

        ServiceFactory serviceFactory = getServiceFactory();

        System.out.print("Enter date (dd/mm/yyyy): ");
        String date = scanner.nextLine();
        System.out.print("Enter time (hh:mm): ");
        String time = scanner.nextLine();
        String processedTime = timeAdapter.processTime(time);

        // Notify bookingObservers about the new booking
        for (BookingObserver observer : bookingObservers) {
            observer.update("New booking made for " + barber.getCategory() + " on " + date + " at " + processedTime);
        }
    }
    private void displayBarberInformation(BarberCategory barber) {
        System.out.println("Category: " + barber.getCategory());
        System.out.println("Name: " + barber.getName());
        System.out.println("Experience: " + barber.getExperience() + " years");
        System.out.println("Age: " + barber.getAge() + " years");
        System.out.println();
    }
    private void cancelBooking() {
        System.out.println("Canceling a booking:");
        // Get user input for appointment to cancel

        // Notify bookingObservers about the cancellation
        for (BookingObserver observer : bookingObservers) {
            observer.update("Booking canceled.");
        }
    }

    public void addBookingObserver(BookingObserver observer) {
        bookingObservers.add(observer);
    }

    public void addBarberObserver(BarberObserver observer) {
        barberObservers.add(observer);
    }

    private BarberFactory getBarberFactory() {
        System.out.println("Choose a barber category:");
        System.out.println("1. Junior Barber");
        System.out.println("2. Stylist Barber");
        System.out.println("3. Pro Barber");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        switch (choice) {
            case 1:
                return new JuniorBarberFactory();
            case 2:
                return new StylistBarberFactory();
            case 3:
                return new ProBarberFactory();
            default:
                System.out.println("Invalid choice. Defaulting to Junior Barber.");
                return new JuniorBarberFactory();
        }
    }
    private static void displayBookings() {
        // Assume you have a list of bookings to display
        List<Booking> bookings = getBookings();

        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            System.out.println("Bookings:");

            for (Booking booking : bookings) {
                System.out.println("Barber: " + booking.getBarberCategory().getName());
                System.out.println("Service: " + booking.getService().getDescription());
                System.out.println("Date: " + booking.getDate());
                System.out.println("Time: " + booking.getTime());
                System.out.println("-----------------------");
            }
        }
    }
    private static List<Booking> getBookings() {
        // Implement this method based on your requirements
        // Return a list of Booking objects
        return new ArrayList<>();
    }

    private ServiceFactory getServiceFactory() {
        System.out.println("Choose a service:");
        System.out.println("1. Classic Haircut");
        System.out.println("2. Fade Haircut");
        System.out.println("3. Kids Haircut");
        System.out.println("4. Shave");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        switch (choice) {
            case 1:
                return new ClassicHaircutFactory();
            case 2:
                return new FadeHaircutFactory();
            case 3:
                return new KidsHaircutFactory();
            case 4:
                return new ShaveFactory();
            default:
                System.out.println("Invalid choice. Defaulting to Classic Haircut.");
                return new ClassicHaircutFactory();
        }
    }

    public static void main(String[] args) {
        CLI cli = new CLI();

        // Create instances of observers and register them with the CLI
        BookingObserver bookingObserver = new BookingObserverImpl();  // Use BookingObserverImpl
        BarberObserver barberObserver = new BarberObserverImpl();

        cli.addBookingObserver(bookingObserver);
        cli.addBarberObserver(barberObserver);

        cli.start();
    }
}
