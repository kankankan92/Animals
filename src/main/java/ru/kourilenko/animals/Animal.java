package ru.kourilenko.animals;

import ru.kourilenko.places.*;

public abstract class Animal {
    Place place;

    public abstract boolean isAllowed(Place place);

    public Animal(){
        while (place == null) {
            switch (Math.round((float) (Math.random() * 3))) {
                case 0:
                    move(new House());
                    break;
                case 1:
                    move(new Lake());
                    break;
                case 2:
                    move(new Meadow());
                    break;
                case 3:
                    move(new Sky());
                    break;

            }
        }
        System.out.println("Привет! Я родился! Место, где я родился :" + " " + place.getName());
   }

    public void move(Place place){
        if (this.isAllowed(place)) {
            this.place = place;
            System.out.println("Мое новое местоположение :" + " " + place.getName());
        }
   }
}
