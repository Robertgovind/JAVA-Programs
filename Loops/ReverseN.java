package Loops;

import java.util.*;

public class ReverseN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0, digit;
        while (n > 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("the reversed number is: " + rev);

    }
}
