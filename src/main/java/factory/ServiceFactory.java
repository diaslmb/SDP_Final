package main.java.factory;

import main.java.decorator.HaircutService;

public interface ServiceFactory {
    HaircutService createService();
}
