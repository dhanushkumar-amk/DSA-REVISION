package LLD.DESIGN_PRINCIPLES.SOLID.O;

public class BadCodeForOpenClosePrinciple {

    public double calculateArea(String type){
        int a = 4;
        int length = 20;
        int breath = 30;
        int width = 34;
        if(type.equals("square")){
            return a * a;
        } else if (type.equals("rectangle")) {
            return length * breath;
        }else if(type.equals("triangle")){
            return 0.0;
        }
        // and many more
        // if i need to add more values it will effect
        return 0.0;
    }

}
