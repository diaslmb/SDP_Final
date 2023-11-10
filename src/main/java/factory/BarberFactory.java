package main.java.factory;

import main.java.strategy.BarberCategory;

public interface BarberFactory {
    BarberCategory createBarber();
}
