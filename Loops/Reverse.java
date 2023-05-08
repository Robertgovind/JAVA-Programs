package Loops;

public class Reverse {
    public static void main(String[] args) {
        int n = 34556, rev = 0, digit;
        while (n > 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("The reversed number is: " + rev);
    }
}
