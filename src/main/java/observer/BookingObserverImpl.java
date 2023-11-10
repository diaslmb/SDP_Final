package main.java.observer;

public class BookingObserverImpl implements BookingObserver {
    @Override
    public void update(String message) {
        System.out.println("Booking Observer: " + message);
    }
}
