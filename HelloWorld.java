import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num = 1;
        int val = 5;
        double x = 3.142;
        double y = 2.0 / 3;
        float a = 1.0f / 3;
        float b = 1/3f;
        char alpha = 'J';
        char ban = 'k';

        System.out.println(num);
        System.out.println(val);
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(alpha);
        System.out.println(ban);

        System.out.println("Demonstrating Data Type Size in Java");
        System.out.println("-----------------------------------------");

        int i = 123456789;
        double d = 19.99;
        char c = 'A';

        System.out.println("Size of short: " + Short.BYTES + " bytes.");
        System.out.println("The variable i is int data type has the value " + i +"\nSize of int: " + Integer.BYTES + " bytes.");
        System.out.println("Size of char: " + Character.BYTES + " bytes.");
        System.out.println("Size of char: " + Character.SIZE + " bits.");
        System.out.println("Size of double: " + Double.SIZE + " bits.");
        System.out.println("Minimum value of int range: " + Integer.MIN_VALUE + ".");
        System.out.println("Maximum value for double range: " + Double.MAX_VALUE + ".");
    }
}

class SwitchClass {
    String switchStatus = "On";
}

class IdentifierRules {
    public static void start1() {
        System.out.println("Static Method Output");
    }

    public static void main(String[] args) {
        int secondPlace = 2;
        int firstName = 10;
        int price = 99;
        int userName = 25;
        int classValue = 1;
        int doubleValue = 3;

        int Score = 10;
        System.out.println(Score);

        System.out.println("This program is executed after all errors are rectified.");
        start1();
    }
}