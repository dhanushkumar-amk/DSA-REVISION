package LLD.OOPS.INHERITANCE;

class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog extends  Animal{
    void bark(){
        System.out.println("The Dog is barked");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}

