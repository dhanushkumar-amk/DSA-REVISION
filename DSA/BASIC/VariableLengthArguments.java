package DSA.BASIC;

import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7);
        multiple(10, 20, 3,4,5,67,8,9);
    }

    public static void fun(int ...variables){ // array of integer
        System.out.println(Arrays.toString(variables));
    }

    public static void multiple(int a, int b, int ...c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }
}
