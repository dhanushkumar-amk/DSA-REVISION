package LLD.OOPS.INHERITANCE;


class Animal1{
    void eat(){
        System.out.println("This animal eats food");
    }
}

class Mammal extends  Animal{
    void walk(){
        System.out.println("The mammal is walked");
    }
}

class Cat extends  Mammal{
    void drink(){
        System.out.println("Cat drinks the milk");
    }
}



public class MultilevelInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.drink();
        cat.walk();
    }
}
