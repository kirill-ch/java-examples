package ru.javatutor.inheritance;

public class InheritanceAnimal {
    public static void main(String[] args) {
        Rex rex = new Rex();
        rex.feed(10, FoodType.MEAT);
        rex.feed(10, FoodType.GRASS);
    }

}

abstract class Animal {
    abstract boolean feed(int amount, FoodType foodType);
}

abstract class Predator extends Animal {

    @Override
    public boolean feed(int amount, FoodType foodType) {
        if (foodType.equals(FoodType.MEAT)) {
            // implementation of an abstract method
            System.out.println("Predator is eating");
            return true;
        }
        System.out.println("Predator doesn't eat such meat");
        return false;
    }
}

class Rex extends Predator {

}

enum FoodType {
    MEAT, GRASS
}