package org.example.oop;

public class Main {
    String monday = "monday";
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();
        cleanFur(lion);
    }

    public boolean isWeekend(Day day) {
        return switch (day) {
            case SATURDAY, SUNDAY -> true;
            default -> false;
        };
    }

    public static void cleanFur(Fluffy animal) {
        animal.combFur();
    }
}
