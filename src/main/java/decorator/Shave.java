package main.java.decorator;

public class Shave implements HaircutService {
    @Override
    public String getDescription() {
        return "Shave";
    }

    @Override
    public double getPrice() {
        // Implement the pricing logic for Shave
        return 3000;
    }}