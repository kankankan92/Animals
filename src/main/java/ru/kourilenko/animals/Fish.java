package ru.kourilenko.animals;


import ru.kourilenko.places.Lake;
import ru.kourilenko.places.Place;

public class Fish extends Animal {
    @Override
    public boolean isAllowed(Place place) {
        return place instanceof Lake;
    }
}
