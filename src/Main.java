import Animal.*;
import Cage.CageForCarnivorous;
import Cage.CageForHerbivore;
import Cage.NoAnimalException;
import Food.Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CageForCarnivorous cage1 = new CageForCarnivorous(10);
        cage1.addAnimal(new Bear("Сеня", 2));
        cage1.addAnimal(new Tiger("Полосатый", 3));
        cage1.addAnimal(new Duck("Кря", 2));
        cage1.addAnimal(new Duck("Кри", 3));

        CageForHerbivore cage2 = new CageForHerbivore(6);
        cage2.addAnimal(new Camel("Яшка", 5));
        cage2.addAnimal(new Rabbit("Демон", 2));
        cage2.addAnimal(new Rabbit("Демоница", 2));
        System.out.println(" ");

        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss");
        System.out.println("Сегодня " + formatForDateNow.format(date));

        System.out.println("Вы вошли в зоопарк. Выберете куда пойти к хищникам(1) или к травоядным(2)");
        try {
            int number = Integer.parseInt(reader.readLine());
            if (number == 1) {
                System.out.println("Вы зашли к хищникам, давайте покормим их");
                Food food = Food.FISH;
                cage1.feedAnimal(food);
            } else if (number == 2) {
                Food food = Food.CARROT;
                System.out.println("Вы зашли к травоядным");
                cage2.feedAnimal(food);
            }
        } catch (IOException | NoAnimalException e) {
            System.out.println("Это не 1 и не 2");
            e.printStackTrace();
        }
    }
}
