package LLD.DESIGN_PRINCIPLES.SOLID.L;

// solve using interface
abstract class Vechicle{
    public  void move(){
        System.out.println("vehicle move logic");
    }
}

    abstract class EnginedVehicle extends Vechicle{
        // engine started logic
        public void startEngine(){
            System.out.println("engine started");
        }
    }

    abstract class NonEnginedVehicle extends Vechicle{
        // no engine related methods
    }

    class Bus extends EnginedVehicle{
        @Override
        public void startEngine() {
            super.startEngine();
        }
    }

    class Cycle extends NonEnginedVehicle{
    // non engined vehicle logics
    }

public class GoodeCode {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.startEngine();
        bus.move();

        Cycle cycle = new Cycle();
        cycle.move();
    }

}
