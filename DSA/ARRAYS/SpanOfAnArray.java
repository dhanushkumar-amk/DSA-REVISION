package DSA.ARRAYS;

import java.util.Arrays;

public class SpanOfAnArray {
    public static void main(String[] args) {
        int[] arr = {44,55,77,33,88,99,11};
        int span = span(arr);
        System.out.println("The span of an array is " + span);
    }

    public static int span(int[] arr){
        // span = max - min;
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        return max - min;
    }

}
