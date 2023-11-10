package main.java.decorator;

public class FadeHaircut implements HaircutService {
    @Override
    public String getDescription() {
        return "Fade Haircut";
    }

    @Override
    public double getPrice() {
        // Implement the pricing logic for FadeHaircut
        return 12000;
    }
}