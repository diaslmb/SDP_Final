package main.java.factory;

import main.java.decorator.HaircutService;
import main.java.decorator.KidsHaircut;

public class KidsHaircutFactory implements ServiceFactory {
    @Override
    public HaircutService createService() {
        return new KidsHaircut();
    }
}
