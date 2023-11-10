package main.java.factory;

import main.java.strategy.BarberCategory;
import main.java.strategy.ProBarber;

public class ProBarberFactory implements BarberFactory {
    @Override
    public BarberCategory createBarber() {
        // You might get the required data from user input or any other source
        String name = "DefaultProName";
        int experience = 0;
        int age = 0;

        // Create and return a new instance of ProBarber
        return new ProBarber(name, experience, age);
    }
}
