package LLD.DESIGN_PRINCIPLES.SOLID.I;

//interface separation based on functionalities

interface machine{
    void print();
    void scan();
    void fax();
}

class AllinOnePrinter implements machine{
    @Override
    public void print() {
        System.out.println("print ");
    }

    @Override
    public void scan() {
        System.out.println("scan ");
    }

    @Override
    public void fax() {
        System.out.println("fax ");
    }
}


class BasicPrinter implements machine{
    public void print() {
        System.out.println("print ");
    }

    @Override
    public void scan() {
        System.out.println("scan ");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Basic printer can't have fax option");
    }
}


public class BadCode {
    public static void main(String[] args) {
        AllinOnePrinter allinOnePrinter = new AllinOnePrinter();
        allinOnePrinter.fax();
        allinOnePrinter.print();
        allinOnePrinter.scan();

        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.scan();
        basicPrinter.print();

        try{
            basicPrinter.fax();
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage() + " ");
        }
    }
}
