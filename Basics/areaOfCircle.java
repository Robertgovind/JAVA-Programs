import java.util.*;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.println("Enter the radius of the circle: ");
        r = sc.nextFloat();
        float area = 3.1248f * r * r;
        // java takes 3.124 as double
        // java takes 3.124f as float
        // use f behind number to make it float
        System.out.println("The area of the cirlce is : " + area);
    }
}
