package main.java.decorator;

public class ClassicHaircut implements HaircutService {
    @Override
    public String getDescription() {
        return "Classic Haircut";
    }

    @Override
    public double getPrice() {
        // Implement the pricing logic for ClassicHaircut
        return 10000.0;
    }
}
