package Animal;

import Food.Food;

public class Duck extends Animal {
    String name;
    int age;

    public Duck (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat(Food food) {
        System.out.println("Спасибо за любую еду");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
