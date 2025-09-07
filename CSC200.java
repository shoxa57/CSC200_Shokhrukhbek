import java.util.*;

public class CSC200 {
    public static void main(String[] args)
    {
        System.out.println("Hello, World");
        BestPractise(args);
        ConstantsLiterals(args);
        VariableAndDataTypes(args);
        DataTypeSize(args);
        start1();
        IdentifierRules(args);
            VariableScope(args);
        TypeConversion(args);
            IncrementDecrement(args);
    }

        // Best practices of programming
    public static void BestPractise(String[] args)
    {
        System.out.println("Hi, I'm Programmer Shokhrukhbek Khakimov.\n");
		System.out.println("A good application should have following best practices of programming");
		System.out.println("1. Clear Structure");
		System.out.println("2. Identifiers with meaningful names");
		System.out.println("3. Comments for providing context and understanding");
		System.out.println("4. Broken down the complex program into manageable components");
		System.out.println("5. Exception handling");
		System.out.println("6. Follow Coding Standards");
		System.out.println("7. Readable and Extensible");
		System.out.println("");
		System.out.println("What other aspects that you can think of for the best practices in programming?");
    }

    // Constants and Literals    // Constants (use 'final' keyword in Java)
    public static final int MAX_VALUE = 100;          // Integer constant
    public static final double PI = 3.14159;          // Floating-point constant
    public static final char NEWLINE = '\n';          // Character constant
    public static final String MY_NAME = "SATHISH SARMA"; // String constant

    public static void ConstantsLiterals(String[] args) {
        // Literals
        System.out.println("Integer literal: " + 25);
        System.out.println("Floating-point literal: " + 3.14);
        System.out.println("Character literal: " + 'A');
        System.out.println("String literal: " + "Hello, Java!");

        // Using constants
        System.out.println("Constant MAX_VALUE = " + MAX_VALUE);
        System.out.println("Constant PI = " + PI);
        System.out.println("Lecturer Name = " + MY_NAME);
    }

        public static void VariableAndDataTypes(String[] args) {
        System.out.println("Demonstrating Variable Data Types in Java");
        System.out.println("-----------------------------------------");

        // Primitive Data Types
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

        // Non-Primitive Data Types
        String str = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};


        System.out.println("String value: " + str);
        System.out.println("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

        public static void DataTypeSize(String[] args) {
        System.out.println("Demonstrating Data Type Size in Java");
        System.out.println("-----------------------------------------");

        // Primitive variables (excluding boolean)
        byte b = 100;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 12.34f;
        double d = 19.99;
        char c = 'A';

        System.out.println("Values of primitive data types:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);

        System.out.println("\nThis application shows the basic code that is needed " +
                           "to calculate data type size, the range (min & max value) for each data type.");

        // Data type size (in bytes)
        System.out.println("\n--- Size in bytes ---");
        System.out.println("byte: " + Byte.BYTES + " bytes");
        System.out.println("short: " + Short.BYTES + " bytes");
        System.out.println("int: " + Integer.BYTES + " bytes");
        System.out.println("long: " + Long.BYTES + " bytes");
        System.out.println("float: " + Float.BYTES + " bytes");
        System.out.println("double: " + Double.BYTES + " bytes");
        System.out.println("char: " + Character.BYTES + " bytes");

        // Data type size (in bits)
        System.out.println("\n--- Size in bits ---");
        System.out.println("byte: " + Byte.SIZE + " bits");
        System.out.println("short: " + Short.SIZE + " bits");
        System.out.println("int: " + Integer.SIZE + " bits");
        System.out.println("long: " + Long.SIZE + " bits");
        System.out.println("float: " + Float.SIZE + " bits");
        System.out.println("double: " + Double.SIZE + " bits");
        System.out.println("char: " + Character.SIZE + " bits");

        // Range of values
        System.out.println("\n--- Range of values ---");
        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

    }
    	String SwitchStatus = "On";

    public static void start1() {
        System.out.println("Static Method Output");
    }

    public static void IdentifierRules(String[] args) {

        int SecondPlace = 2;

        int firstname = 10;

        int price = 99;
		int username = 25;

		int classVar = 1;
		int doubleVar = 3;

        int Score = 10;

        System.out.println(SecondPlace);
        System.out.println(firstname);
        System.out.println(price);
        System.out.println(username);
        System.out.println(classVar);
        System.out.println(doubleVar);
        System.out.println(Score);
		System.out.println("This program is executed after all errors are rectified.");
    }
                                        public static void VariableScope(String[] args) {
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

    public static void TypeConversion(String[] args) {

        // Widening (Implicit Conversion)
        int intVar1 = 100;           // int (4 bytes)
		double doubleVar1 = intVar1 + 2.00;


        System.out.println("Widening (Implicit Conversion):");
        System.out.println("Integer value: " + intVar1);
        System.out.println("Result after implicit conversion from int to double: " + doubleVar1);
        System.out.println("Size of intVar1: " + Integer.BYTES + " bytes");
        System.out.println("Size of doubleVar1: " + Double.BYTES + " bytes");

        // Narrowing (Explicit Conversion / Type Casting)
        double doubleVar2 = 99.99;
        double intVar2 = doubleVar2 + 1;
		int intVar3 = (int) doubleVar2 + 1;

        System.out.println("\nNarrowing (Explicit Conversion):");
        System.out.println("Double value: " + doubleVar2);
        System.out.println("Result after calculate without conversion: " + intVar2);
		System.out.println("Result after explicit conversion from double to int: " + intVar3);
        System.out.println("Size of doubleVar2: " + Double.BYTES + " bytes");
        System.out.println("Size of intVar2: " + Integer.BYTES + " bytes");
        System.out.println("Size of intVar3: " + Integer.BYTES + " bytes");


        // Conversion between char and int
        char letter = 'A';     // character
        int asciiValue = letter; // implicit conversion (char to int)
        System.out.println("\nChar to Int Conversion:");
        System.out.println("Character: " + letter);
        System.out.println("ASCII value: " + asciiValue);
        System.out.println("Size of letter: " + Character.BYTES + " bytes");
        System.out.println("Size of asciiValue: " + Integer.BYTES + " bytes");

        int number = 66;
        char convertedChar = (char) number; // explicit conversion (int to char)
        System.out.println("\nInt to Char Conversion:");
        System.out.println("Integer: " + number);
        System.out.println("Converted to char: " + convertedChar);
        System.out.println("Size of number: " + Integer.BYTES + " bytes");
        System.out.println("Size of convertedChar: " + Character.BYTES + " bytes");
    }

                                        public static void IncrementDecrement(String[] args) {
                                            int a = 5;
                                            int b = 10;

                                            int pre_a, post_b, post_a, pre_b;


                                            System.out.println("Initial value of a: " + a);
                                            System.out.println("Initial value of b: " + b);

                                            // Prefix increment (++a): increases first, then uses the value
                                            pre_a = ++a;
                                            System.out.println("After prefix increment (++a), a = " + a);
                                            System.out.println("After prefix increment (++a), pre_a = " + pre_a);

                                            post_a = a++;
                                            System.out.println("After postfix increment (a++), a = " + a);
                                            System.out.println("After postfix increment (a++), post_a = " + post_a);
                                            // Postfix decrement (b--): uses value first, then decreases
                                            post_b = b--;
                                            System.out.println("After postfix decrement (b--), b = " + b);
                                            System.out.println("After postfix decrement (b--), post_b = " + post_b);

                                            pre_b = --b;
                                            System.out.println("After prefix decrement (--b), b = " + b);
                                            System.out.println("After prefix decrement (--b), pre_b = " + pre_b);
                                        }



}

                                        class VariableScope {
                                            // Static variable (class-level, shared by all objects)
                                            static int staticVar = 100;

                                            // Instance variable (object-level, each object has its own copy)
                                            int instanceVar = 50;

                                            public void printOutputMethod() {
                                                // Local variable (method-level, exists only inside this method)
                                                int localVar = 10;

                                                System.out.println("Local Variable: " + localVar);
                                                System.out.println("Instance Variable: " + instanceVar);
                                                System.out.println("Static Variable: " + staticVar);
                                            }
                                        }