package LLD.OOPS.CONSTRUCTOR;

class ConstructorChainingExample {
    private String name;
    private int age;


    public ConstructorChainingExample(String name) {
        this(name, 21); // constructor chaining
    }

    public ConstructorChainingExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("The name is " + this.name + " and age is " + this.age);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        ConstructorChainingExample person = new ConstructorChainingExample("dhanushkumar");
        person.display();
    }
}
