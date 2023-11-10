package main.java.singleton;

public class BarberShopSingleton {
    private static BarberShopSingleton instance;

    private BarberShopSingleton() {
        // Private constructor to prevent instantiation
    }

    public static BarberShopSingleton getInstance() {
        if (instance == null) {
            instance = new BarberShopSingleton();
        }
        return instance;
    }
}
