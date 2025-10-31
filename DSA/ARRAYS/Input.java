package DSA.ARRAYS;


import java.util.Arrays;
import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(Arrays.toString(arr));


        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}



