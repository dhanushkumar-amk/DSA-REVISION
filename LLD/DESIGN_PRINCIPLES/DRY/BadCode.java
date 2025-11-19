package LLD.DESIGN_PRINCIPLES.DRY;

public class BadCode {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;

        // swapping methods
        int temp = a;
        a = b;
        b = temp;

        // later in code we need to swap other two numbers
        int x = 30;
        int y = 40;

        // repeating the same task
        temp = x;
        x = y;
        y = temp;
    }
}

