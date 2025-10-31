package DSA.ARRAYS;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {66,55,88,33,55,11,99};
        int max = largest(arr);
        int min = smallest(arr);
        System.out.println("The largest value in array is " + max + " and smallest value in array is " + min);
    }

    public static int largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
