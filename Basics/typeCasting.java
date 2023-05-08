//explicit conversion
public class typeCasting {
    public static void main(String[] args) {
        float a = 34.44f;
        // int b = a; // not allowed

        int b = (int) a;
        System.out.println(b);
    }
}