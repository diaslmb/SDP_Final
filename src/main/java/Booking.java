package main.java;

import main.java.decorator.HaircutService;
import main.java.strategy.BarberCategory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
    private BarberCategory barberCategory;
    private HaircutService service;
    private Date date;
    private int time;

    public Booking(BarberCategory barberCategory, HaircutService service, String dateString, int time) throws ParseException {
        this.barberCategory = barberCategory;
        this.service = service;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.date = dateFormat.parse(dateString);
        this.time = time;
    }

    public BarberCategory getBarberCategory() {
        return barberCategory;
    }

    public HaircutService getService() {
        return service;
    }

    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

    public int getTime() {
        return time;
    }

    // Other methods for getting and setting values...
}
