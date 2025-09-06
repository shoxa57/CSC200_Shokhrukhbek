import java.util.Date;

public class Main {
    public static void main(String[] args) {
        intro(args);
        time(args);
        Variable(args);
        Data(args);
        identifier(args);
        scope(args);
        conversion(args);
        incrementDecrementDemo(args);
    }

    public static void intro(String[] args) {
        System.out.println("Hi, I'm Programmer Ali Khakimov.\n");
        System.out.println("A good application should have following best practices of programming");
        System.out.println("1. Clear Structure");
        System.out.println("2. Identifiers with meaningful names");
        System.out.println("3. Comments for providing context and understanding");
        System.out.println("4. Broken down the complex program into manageable components");
        System.out.println("5. Exception handling");
        System.out.println("6. Follow Coding Standards");
        System.out.println("7. Readable and Extensible\n");
        System.out.println("What other aspects that you can think of for the best practices in programming?\n");
    }

    public static void time(String[] args) {
        Date mydate = new Date();
        System.out.println("System date : " + mydate.toString() + "\n");
    }

    public static void Variable(String[] args) {
        System.out.println("Demonstrating Variable Data Types in Java");
        System.out.println("-----------------------------------------");
        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
        boolean bool = true;
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);
        System.out.println("\n--- Non-Primitive Data Types ---");
        String str = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("String value: " + str);
        System.out.print("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    public static void Data(String[] args) {
        System.out.println("Demonstrating Data Type Size in Java");
        System.out.println("-----------------------------------------");
        System.out.println("This application shows the basic code that is needed to calculate data type size, the range (min & max value) for each data type.");
        System.out.println("Size of int: " + Integer.BYTES + " bytes.");
        System.out.println("Size of char: " + Character.BYTES + " bytes.");
        System.out.println("Size of char: " + Character.SIZE + " bits.");
        System.out.println("Size of double: " + Double.SIZE + " bits.");
        System.out.println("Minimum value of int range: " + Integer.MIN_VALUE + ".");
        System.out.println("Maximum value for double range: " + Double.MAX_VALUE + ".\n");
    }

    public static void start() { 
        System.out.println("Static Method Output\n");
    }

    public static void identifier(String[] args) {
        int secondPlace = 2;
        int firstName = 10;
        int price = 99;
        int userName = 25;
        int classNumber = 1; 
        int doubleValue = 3;
        int score = 10;
        System.out.println("Score = " + score);
        System.out.println("This program is executed after all errors are rectified.\n");
        start();
    }

    public static void scope(String[] args) {
        VariableScope obj1 = new VariableScope();
        VariableScope obj2 = new VariableScope();
        System.out.println("---- Object 1 ----");
        obj1.printOutputMethod();
        obj1.instanceVar = 200;
        VariableScope.staticVar = 500;
        System.out.println("\n---- Object 2 ----");
        obj2.printOutputMethod();
        System.out.println("\n---- Object 1 Again ----");
        obj1.printOutputMethod();
    }

    public static void conversion(String[] args) {
        System.out.println("Demonstrating Type Conversions in Java");
        System.out.println("-----------------------------------------");
        int intVar1 = 100;
        double doubleVar1 = intVar1 + 2.00;
        System.out.println("Widening (Implicit Conversion):");
        System.out.println("Integer value: " + intVar1 + " (size: " + Integer.SIZE + " bits)");
        System.out.println("Result after implicit conversion from int to double: " + doubleVar1 + " (size: " + Double.SIZE + " bits)");
        double doubleVar2 = 99.99;
        double intVar2 = doubleVar2 + 1;
        int intVar3 = (int) doubleVar2 + 1;
        System.out.println("\nNarrowing (Explicit Conversion):");
        System.out.println("Double value: " + doubleVar2 + " (size: " + Double.SIZE + " bits)");
        System.out.println("Result after calculate without conversion: " + intVar2 + " (size: " + Double.SIZE + " bits)");
        System.out.println("Result after explicit conversion from double to int: " + intVar3 + " (size: " + Integer.SIZE + " bits)");
        char letter = 'A';
        int asciiValue = letter;
        System.out.println("\nChar to Int Conversion:");
        System.out.println("Character: " + letter + " (size: " + Character.SIZE + " bits)");
        System.out.println("ASCII value: " + asciiValue + " (size: " + Integer.SIZE + " bits)");
        int number = 66;
        char convertedChar = (char) number;
        System.out.println("\nInt to Char Conversion:");
        System.out.println("Integer: " + number + " (size: " + Integer.SIZE + " bits)");
        System.out.println("Converted to char: " + convertedChar + " (size: " + Character.SIZE + " bits)\n");
    }

    public static void incrementDecrementDemo(String[] args) {
        System.out.println("Demonstrating Prefix and Postfix Operations");
        System.out.println("-----------------------------------------");
        int a = 5;
        int b = 10;
        int pre_a, post_b;
        System.out.println("Initial value of a: " + a);
        pre_a = ++a;
        System.out.println("After prefix increment (++a), a = " + a);
        System.out.println("After prefix increment (++a), pre_a = " + pre_a);
        post_b = b--;
        System.out.println("After postfix decrement (b--), b = " + b);
        System.out.println("After postfix decrement (b--), post_b = " + post_b + "\n");
    }
}

class VariableScope {
    static int staticVar = 100;
    int instanceVar = 50;

    public void printOutputMethod() {
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}