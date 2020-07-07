package Cage;

import Animal.Herbivore;
import Food.Food;

import java.util.ArrayList;
import java.util.List;

public class CageForHerbivore {
    private int maxPlace;
    private int sumAnimal = 0;

    public CageForHerbivore(int maxPlace) {
        this.maxPlace = maxPlace;
    }


    List<Herbivore> place2 = new ArrayList<>();

    public void addAnimal(Herbivore animal) {
        if (maxPlace == sumAnimal) {
            System.out.println("Вальер переполнен. Мест нет");
            return;
        }
        System.out.println("Травоядный " + animal.getName() + " поселился в вольере");
        place2.add(animal);
        sumAnimal++;
    }

    public void feedAnimal(Food food) throws NoAnimalException {
        if (sumAnimal == 0) {
            throw new NoAnimalException("А животных пока не привезли");
        } else {
            place2.get(0).eat(food);
            System.out.println("Вы покормили " + place2.get(0).getName());
        }
    }

}
