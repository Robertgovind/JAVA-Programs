//enter multiples of ten only 
package Loops;

import java.util.*;

public class Berak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number multiple of 10: ");
            int number = sc.nextInt();
            if (number % 10 != 0) {
                break;
            }
            System.out.println(number);
        }
    }
}
