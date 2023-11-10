package main.java.factory;

import main.java.strategy.BarberCategory;
import main.java.strategy.JuniorBarber;

public class JuniorBarberFactory implements BarberFactory {
    @Override
    public BarberCategory createBarber() {
        // You might get the required data from user input or any other source
        String name = "DefaultJuniorName";
        int experience = 0;
        int age = 0;

        // Create and return a new instance of JuniorBarber
        return new JuniorBarber(name, experience, age);
    }
}
