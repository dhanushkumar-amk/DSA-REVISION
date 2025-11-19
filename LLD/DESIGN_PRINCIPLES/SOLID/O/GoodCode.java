package LLD.DESIGN_PRINCIPLES.SOLID.O;

interface areaCalculation{
    public double area();
}

class Square implements areaCalculation{
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}


class Rectangle implements areaCalculation{
    double length;
    double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public double area() {
        return length * breath;
    }
}


public class GoodCode {
    public static void main(String[] args) {
        Square square = new Square(4);
        double areaOfSquare = square.area();
        System.out.println(areaOfSquare);
    }
}



