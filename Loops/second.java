package Loops;

import java.util.*;

public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 1;
        while (counter <= num) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}
