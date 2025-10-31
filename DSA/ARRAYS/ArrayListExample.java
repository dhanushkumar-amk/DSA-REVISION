package DSA.ARRAYS;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public  static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(1));
        list.set(1,12);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
