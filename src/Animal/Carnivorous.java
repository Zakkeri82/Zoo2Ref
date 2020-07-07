package Animal;

import Food.Food;

public abstract class Carnivorous extends Animal {
    private String name;
    private int age;

    public Carnivorous(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void eat(Food food) {
        if(food.getHerbOrNo() == 1) {
            System.out.println("Спасибо. Очень вкусная " + food.getTranslate());
        }
        else if(food.getHerbOrNo() == 2) {
            System.out.println("Ужас. Я эту гадость не ем");
        }
    }
}
