package LLD.OOPS.INHERITANCE;

class AnimalClass {
    void eat(){
        System.out.println("The animal eats the food");
    }
}


interface Mammal1{
    void walk();
}

interface Pet{
    void play();
}


class Dog1 extends AnimalClass implements Mammal1, Pet{
    @Override
    void eat() {
        System.out.println("The dogs eats the food");
    }

    @Override
    public void walk() {
        System.out.println("The dogs walks on the road");
    }

    @Override
    public void play() {
        System.out.println("The dogs play with children");
    }
}


public class HybridInheritance {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.eat();
        dog.play();
        dog.walk();
    }
}
