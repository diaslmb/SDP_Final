package main.java.factory;

import main.java.strategy.BarberCategory;
import main.java.strategy.StylistBarber;

public class StylistBarberFactory implements BarberFactory {
    @Override
    public BarberCategory createBarber() {
        // You might get the required data from user input or any other source
        String name = "DefaultStylistName";
        int experience = 0;
        int age = 0;

        // Create and return a new instance of StylistBarber
        return new StylistBarber(name, experience, age);
    }
}
