package Animal;

import Food.Food;

public abstract class Animal {
    private String name;
    private int age;


    public abstract String getName();

    public abstract int getAge();

    public abstract void eat(Food food);
}