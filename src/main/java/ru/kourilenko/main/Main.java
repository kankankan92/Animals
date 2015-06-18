package ru.kourilenko.main;

import ru.kourilenko.animals.*;
import ru.kourilenko.places.Meadow;
import ru.kourilenko.places.Sky;

public class Main {
    public static void main(String[] args) {
        Animal lesli = new Cat();
        Animal bobby = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        lesli.move(new Meadow());
        fish.move(new Sky());
   }
}
