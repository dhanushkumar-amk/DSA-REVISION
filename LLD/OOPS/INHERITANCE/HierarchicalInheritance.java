package LLD.OOPS.INHERITANCE;


class Birds{
    void fly(){
        System.out.println("The bird is fly over a sky");
    }
}


class Eagle extends  Birds{
    void eat(){
        System.out.println("Eagle eats the snake");
    }
}


class Parrot extends Birds{
    void speak(){
        System.out.println("The parrot speaks");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();

        Parrot parrot = new Parrot();
        parrot.speak();
        parrot.fly();
    }
}
