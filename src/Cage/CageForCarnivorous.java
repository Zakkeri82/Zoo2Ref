package Cage;

import Animal.Animal;
import Animal.Carnivorous;
import Animal.Duck;
import Food.Food;

import java.util.ArrayList;
import java.util.List;

public class CageForCarnivorous {
    private int maxPlace;
    private int sumAnimal = 0;

    public CageForCarnivorous(int maxPlace) {
        this.maxPlace = maxPlace;
    }

    List<Animal> place = new ArrayList<>();

    public void addAnimal(Carnivorous animal) {
        if (maxPlace == sumAnimal) {
            System.out.println("Вальер переполнен. Мест нет");
            return;
        }
        System.out.println("Хищник " + animal.getName() + " поселился в вольере");
        place.add(animal);
        sumAnimal++;
    }

    public void addAnimal(Duck animal) {
        if (maxPlace == sumAnimal) {
            System.out.println("Вальер переполнен. Мест нет");
            return;
        }
        System.out.println("Утка поселилась в вольере");
        place.add(animal);
        sumAnimal++;
    }

    public void feedAnimal(Food food) throws NoAnimalException {
        if (sumAnimal == 0) {
            throw new NoAnimalException("А животных пока не привезли");
        } else {
            place.get(0).eat(food);
            System.out.println("Вы покормили " + place.get(0).getName());
        }
    }

}
