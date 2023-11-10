package main.java.strategy;

public class ProBarber implements BarberCategory {
    private String name;
    private int experience;
    private int age;

    public ProBarber(String name, int experience, int age) {
        this.name = name;
        this.experience = experience;
        this.age = age;
    }

    @Override
    public String getCategory() {
        return "Pro Barber";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public int getAge() {
        return age;
    }
}
