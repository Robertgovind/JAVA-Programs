package Operators;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 14;
        int b = 3;

        // Binary Operators
        System.out.println("Sum : " + (a + b));
        System.out.println("Difference : " + (a - b));
        System.out.println("Product : " + (a * b));
        System.out.println("Divide : " + (a / b));
        System.out.println("Modulo : " + (a % b));

        // Unary Operators
        System.out.println("preincrement: " + (++a));
        System.out.println("postincrement: " + (a++));
        System.out.println("predecrement: " + (--b));
        System.out.println("postdecrement: " + (b--));

    }
}
