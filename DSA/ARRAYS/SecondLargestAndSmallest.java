package DSA.ARRAYS;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int secondLarge = secondLargest(arr);
        int secondSmall = secondSmallest(arr);
        System.out.println("The second largest value in array is "  + secondLarge);
        System.out.println("The second Smallest value in array is "  + secondSmall);

    }

    public static int secondLargest(int[] arr){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int secondSmallest(int[] arr){
       int firstSmallest = Integer.MAX_VALUE;
       int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            } else if (arr[i] > firstSmallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
