package LLD.DESIGN_PRINCIPLES.SOLID.L;

class Vehicle{
    public void startEngine(){
        // some logics
    }
}

class Car extends Vehicle{
    @Override
    public void startEngine() {
        // car start methods
    }
}

class ByCycle extends Vehicle{
    @Override
    public void startEngine() {
        // if bicycle really needs start engine methods it is not needed
    }
}

public class BadCode {
    // the child class must be substituted
}
