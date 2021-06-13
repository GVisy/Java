package ru.geekbrains.HomeWork;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat(5, "Муся"),
                new Cat(7, "Паштет"),
                new Cat(10, "Ковин")
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        plate.increaseFood(50);

        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }
}
