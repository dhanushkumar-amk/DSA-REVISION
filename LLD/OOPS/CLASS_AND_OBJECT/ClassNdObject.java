package LLD.OOPS.CLASS_AND_OBJECT;

public class ClassNdObject {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "M3", 4);
        Car lamborghini = new Car("Lamborghini", "r3", 2);

        bmw.startEngine();
        bmw.displayInfo();

        lamborghini.startEngine();
        lamborghini.displayInfo();
    }
}


class Car{
    String name;
    String model;
    int seat;

    public Car(String name, String model, int seat) {
        this.name = name;
        this.model = model;
        this.seat = seat;
    }

    public void startEngine(){
        System.out.println("The "  + this.name + " car engine is started");
    }

    public void displayInfo(){
        System.out.println("This is " + this.name + " and its model is a " + this.model + " and it has " + this.seat + " seats");
    }
}
