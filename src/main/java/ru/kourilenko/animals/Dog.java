package ru.kourilenko.animals;

import ru.kourilenko.places.Place;
import ru.kourilenko.places.Sky;

public class Dog extends Animal {

    @Override
    public boolean isAllowed(Place place) {
        return !(place instanceof Sky);
    }
}
