package main.java.factory;

import main.java.decorator.HaircutService;
import main.java.decorator.Shave;

public class ShaveFactory implements ServiceFactory {
    @Override
    public HaircutService createService() {
        return new Shave();
    }
}
