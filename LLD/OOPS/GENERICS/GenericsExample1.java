package LLD.OOPS.GENERICS;



public class GenericsExample1 {


    static <T> void generateDisplay(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        generateDisplay(7080);
        generateDisplay("dhanushkumar");
        generateDisplay(1.0);
    }

}
