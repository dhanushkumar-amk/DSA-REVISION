package LLD.DESIGN_PRINCIPLES.SOLID.I;

interface Scan{
    void scan();
}

interface Fax{
    void fax();
}

interface Print{
    void print();
}

class allInOnePrinter implements Scan, Fax, Print{
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

class basicPrinter implements  Print, Scan{
    @Override
    public void print() {
        System.out.println("Basic printer print");
    }

    @Override
    public void scan() {
        System.out.println("Basic printer scan");
    }
}


public class GoodCode {
    public static void main(String[] args) {
        basicPrinter basicPrinter = new basicPrinter();
        basicPrinter.print();
        basicPrinter.scan();

        allInOnePrinter all = new allInOnePrinter();
        all.fax();
        all.print();
        all.print();
    }
}
