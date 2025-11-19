package LLD.OOPS.ABSTRACTION;


abstract class Animal{
    // abstract methods
    abstract void makeSound();

    // normal methods
    void sleep(){
        System.out.println("Sleeping...");
    }
}


class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class AbstractExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Cat cat = new Cat();
        cat.makeSound();
        cat.sleep();
    }
}
