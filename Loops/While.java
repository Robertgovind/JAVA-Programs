package Loops;

public class While {
    public static void main(String[] args) {
        int sum = 0, counter = 1;
        while (counter <= 50) {
            sum += counter;
            counter++;
        }
        System.out.println("The sum is : " + sum);
    }
}
