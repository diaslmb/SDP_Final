package main.java.decorator;

public class KidsHaircut implements HaircutService {
    @Override
    public String getDescription() {
        return "Kids Haircut";
    }

    @Override
    public double getPrice() {
        // Implement the pricing logic for KidsHaircut
        return 7000;
    }
}