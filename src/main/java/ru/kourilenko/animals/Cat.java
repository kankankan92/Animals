package ru.kourilenko.animals;

import ru.kourilenko.places.House;
import ru.kourilenko.places.Meadow;
import ru.kourilenko.places.Place;

public class Cat extends Animal{

    @Override
    public boolean isAllowed(Place place) {
        return place instanceof House || place instanceof Meadow;
        /* Замена
        if (place instanceof House || place instanceof Meadow)
        return true;
        else
            return false;

        */
    }
}
