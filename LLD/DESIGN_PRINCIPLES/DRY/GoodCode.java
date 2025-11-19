package LLD.DESIGN_PRINCIPLES.DRY;

import java.util.Arrays;

public class GoodCode {
    public static void main(String[] args) {
        int[] numbers1 = {45,60};
        swap(numbers1);
        System.out.println("The swapped numbers of an array" + Arrays.toString(numbers1));
    }

    public static void swap(int[] numbers){
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
    }
}
