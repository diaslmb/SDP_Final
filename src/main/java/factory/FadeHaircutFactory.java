package main.java.factory;

import main.java.decorator.FadeHaircut;
import main.java.decorator.HaircutService;

public class FadeHaircutFactory implements ServiceFactory {
    @Override
    public HaircutService createService() {
        return new FadeHaircut();
    }
}
