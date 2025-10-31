package DSA.BASIC;

public class Shadowing {
  static int x =  10;
    public static void main(String[] args) {
        System.out.println(x); // 10
        int x = 30;  // shadowing scopes variables
        System.out.println(x); // 30
        print(); // 10
    }

    static void print(){
        System.out.println(x);
    }
}
