package LLD.OOPS.POLYMORPHISM;


// compileTime (static) polymorphism

class Vehicle{

    void start(String vehicleType){
        System.out.println("Starting a " + vehicleType );
    }

    void start(String vehicleType, int speed){
        System.out.println("Starting a " + vehicleType + " and it speed goes to " + speed);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Vehicle bmw = new Vehicle();
            bmw.start("BMW", 320);
            bmw.start("audi");
    }
}

