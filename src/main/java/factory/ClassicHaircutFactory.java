package main.java.factory;

import main.java.decorator.ClassicHaircut;
import main.java.decorator.HaircutService;

public class ClassicHaircutFactory implements ServiceFactory {
    @Override
    public HaircutService createService() {
        return new ClassicHaircut();
    }
}
