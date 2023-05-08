package Conditionals;

import java.util.*;

public class ternary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a > b) ? a : b;
        System.out.println("The greater number is : " + c);
    }
}
