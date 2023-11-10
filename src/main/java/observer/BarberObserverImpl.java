package main.java.observer;

public class BarberObserverImpl implements BarberObserver {
    @Override
    public void update(String message) {
        System.out.println("Barber Observer: " + message);
    }
}
