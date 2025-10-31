package LLD.OOPS.POLYMORPHISM;

// runTime (dynamic) polymorphism


class VehicleClass{
    void start(){
        System.out.println("Vehicle is started");
    }
}


class Car extends VehicleClass{
    @Override
    void start() {
        System.out.println("Car is started");
    }
}

class Bike extends VehicleClass{
    @Override
    void start() {
        System.out.println("Bike is started");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Bike bike = new Bike();
        bike.start();
    }
}
