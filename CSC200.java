import java.util.Scanner;

import org.junit.platform.console.shadow.picocli.CommandLine.Spec;

@SuppressWarnings("unused")
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
        Math(args);
        IncrementDecrement(args);
        BitwiseOperators(args);
        TernaryOperators(args);
        OperatorPrecedenceAssociativity(args);
        /*Input(args);*/
        SpecialCharaters(args);
        StringCreation(args);
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
    public static final String MY_NAME = "SHOKHRUKHBEK KHAKIMOV"; // String constant

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

    public static void Math(String[] args) {
        int a, b;
        a = 7;
        b = 2;
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }

        public static void IncrementDecrement(String[] args) {
        int a = 5;
        int b = 10;

        int pre_a, post_b, post_a, pre_b;

        System.out.println("Initial value of a: " + a);

        // Prefix increment (++a): increases first, then uses the value
        pre_a = ++a;
        System.out.println("After prefix increment (++a), a = " + a);
        System.out.println("After prefix increment (++a), pre_a = " + pre_a);

        // Postfix decrement (b--): uses value first, then decreases
        post_b = b--;
        System.out.println("After postfix decrement (b--), b = " + b);
        System.out.println("After postfix decrement (b--), post_b = " + post_b);

        post_a = a++;
        System.out.println("After postfix increment (a++), a = " + a);
        System.out.println("After postfix increment (a++), post_a = " + a);

        pre_b = --b;
        System.out.println("After prefix decrement (--b), b = " + b);
        System.out.println("After prefix decrement (--b), pre_b = " + b);
    }

        public static void BitwiseOperators(String[] args) {
        int a = 36;   // 12 in binary = 00001100
        int b = 75;   // 25 in binary = 00011001

        System.out.println("a = " + a + " (Binary: " + String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0') + ")");
        System.out.println("b = " + b + " (Binary: " + String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0') + ")");
        System.out.println("-----------------------------------------");

        // Bitwise AND
        System.out.println("a & b = " + (a & b) + " (AND)");
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a & b)).replace(' ', '0'));

        // Bitwise NOT
        System.out.println("~a = " + (~a) + " (NOT)");
        System.out.println("Binary Result: " + String.format("%32s", Integer.toBinaryString(~a)).replace(' ', '0'));

        // Left shift
        System.out.println("a << 1 = " + (a << 1) + " (Left Shift by 1)");
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a << 1)).replace(' ', '0'));

        // Bitwise OR
        System.out.println("a | b = " + (a | b) + "(OR)");
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a | b)).replace(' ', '0'));

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b) + "(XOR)");
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a ^ b)).replace(' ', '0'));

        // Right shift
        System.out.println("a >> 1 = " + (a >> 1) + " (Right Shift by 1)"); 
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a >> 1)).replace(' ', '0'));

        // Unsigned right shift
        System.out.println("a >>> 1 = " + (a >>> 1) + " (Unsigned Right Shift by 1)"); 
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a >>> 1)).replace(' ', '0'));
    }


     public static void TernaryOperators(String[] args) {
        int a = 10, b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);
        System.out.println("-------------------------------------------");

        // 1. Unary Operators
        System.out.println("Unary Operators:");
        System.out.println(" -a = " + (-a) + " (Unary minus)");
        System.out.println(" ++a = " + (++a) + " (Prefix increment)");

		//Update the code to perform the postfix decrement on the variable b

        System.out.println(" b after b-- = " + b); 
        System.out.println(" b-- = " + (b--) + " (Postfix decrement)");

        // Update the code to Reset values of a and b to the original

        a = 10;
        b = 5;

        System.out.println("Value reset:");
        System.out.println("a =" +a);
        System.out.println("b =" +b);

        // 2. Binary Operators
        System.out.println("Binary Operators:");
        System.out.println(" a + b = " + (a + b) + " (Addition)");

		//Update the code to perform subtraction, b minus from a

        System.out.println(" a - b = " + (a - b) + " (Substraction)");

		//Update the code to perform multiplication, a multiply with b

        System.out.println(" a * b = " + (a * b) + "(Multiplication)");

		//Update the code to perform division, divide b from a

        System.out.println(" b / a = " + (b / a) + "(Division)");

		//Update the code to find the remainder of the process a divide b

        System.out.println(" b % a = " + (b % a) + ("Remainder"));

        // 3. Ternary Operator
        System.out.println("Ternary Operator:");

		//update the code to determine the value of a is odd or even using ternary operator

		String result =  (a % 2 ==0) ?"Even" : "Odd";
        System.out.println("The value of number is " + result);
    }

    public static void OperatorPrecedenceAssociativity(String[] args) {
        int a = 10, b = 5, c = 2;
		int result;

		System.out.println("This program demonstrates both operator precedence and associativity.");
        System.out.println("Initial values: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("---------------------------------------------------");
		System.out.println("This program has incomplete parts. Refer to the comments below for the instructions. The first example is provided for you.");
        // ---------------- Precedence Examples ----------------

        // Example 1: Multiplication has higher precedence than addition.
		// show the result of a add b multiply with c.
        result = a + b * c;   // evaluated as a + (b * c)
        System.out.println("a + b * c = " + result + " (Multiplication before addition)");

        // Example 2: Parentheses override precedence
        int result2 = (a + b) * c; // evaluated as (a + b) * c
        System.out.println("(a + b) * c = " + result2 + " (Parentheses force addition first)");

        // Example 3: Division vs multiplication (same precedence, left-to-right associativity)
        int result3 = a / b * c;   // evaluated as (a / b) * c
        System.out.println("a / b * c = " + result3 + " (Same precedence, evaluated left to right)");

        // Example 4: Unary minus has higher precedence than multiplication
        int result4 = -a * b;      // evaluated as (-a) * b
        System.out.println("-a * b = " + result4 + " (Unary minus before multiplication)");

        // Example 5: Relational operators after arithmetic
        boolean result5 = a + b > c * 2;  // (a + b) compared to (c * 2)
        System.out.println("a + b > c * 2 = " + result5 + " (Arithmetic before comparison)");

        // Example 6: Logical AND vs OR (AND has higher precedence)
        boolean result6 = (a > b) || (b > c) && (a < c);
        System.out.println("(a > b) || (b > c) && (a < c) = " + result6
                + " (&& before ||)");

        // Example 7: Assignment has the lowest precedence
        int x;
        x = a + b * c;   // (b * c) evaluated first, then added to a, then assigned
        System.out.println("x = a + b * c -> x = " + x);

        System.out.println("---------------------------------------------------");

        // ---------------- Associativity Examples ----------------

        // Example 8: Left-to-right associativity for subtraction
        int result8 = a - b - c;   // evaluated as (a - b) - c
        System.out.println("a - b - c = " + result8 
                + " (Subtraction is left-to-right)");

        // Example 9: Left-to-right associativity for division
        int result9 = a / b / c;   // evaluated as (a / b) / c
        System.out.println("a / b / c = " + result9 
                + " (Division is left-to-right)");

        // Example 10: Right-to-left associativity for assignment
        int p, q, r;
        p = q = r = 5;   // evaluated as p = (q = (r = 5))
        System.out.println("p = q = r = 5 -> p = " + p + ", q = " + q + ", r = " + r
                + " (Assignment is right-to-left)");

        // Example 11: Ternary operator (right-to-left associativity)
        int result11 = (a > b) ? (b > c ? b : c) : a;
        System.out.println("Ternary nested (a > b) ? (b > c ? b : c) : a = " + result11
                + " (Ternary operator associates right-to-left)");
    }

    public static void Input(String[] args) {

        Scanner myObj = new Scanner(System.in);

        // String input
        System.out.print("Enter your name: ");
        String name = myObj.nextLine();

        // Integer input
        System.out.print("Enter your age: ");
        int age = myObj.nextInt();

        // Double input
        System.out.print("Enter your height (in meters, e.g., 1.75): ");
        double height = myObj.nextDouble();

        // Boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = myObj.nextBoolean();

        // Clear the newline left-over from nextBoolean or nextDouble
        myObj.nextLine();

        // Character input
        System.out.print("Enter your gender (M/F): ");
        char gender = myObj.nextLine().charAt(0); // takes first character

        // Display all inputs
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Student: " + isStudent);
        System.out.println("Gender: " + gender);
        }

        public static void SpecialCharaters(String[] args) {
		
		/*****
		Update the code below to ensure all special characters are placed accordingly and correctly.
		The string XYZ is used as the placeholder for the special characters.
		Replace all println with print and use suitable special character as replacement.
		*****/

        System.out.print("Demonstrating Special Characters in Java\n");
        System.out.print("---------------------------------------\n");
    
        // New line
        System.out.print("New line example:\nHello\nWorld\n");
    
        // Tab
        System.out.print("Tab example:\tTab\tExample\n");
    
        // Backslash
        System.out.print("Backslash: \\Example\n");
    
        // Double quote
        System.out.print("Double quote: \"Example\" double\n");
    
        // Single quote
        System.out.print("Single quote: \'Example\' single\n");
    
        // Carriage return
        System.out.print("Carriage return example: Original Line\rOverwritten line\n");
    
        // Backspace
        System.out.print("Backspace example: ABCD\b \n");
    
        // Form feed
        System.out.print("Form feed example: First page\fSecond page\n");
}
public static void StringCreation(String[] args) {
    System.out.println("Demonstrate string creation using various methods.");
    String str1 = "Hello World!";
    String str2 = new String("Hello World");
    char[] chars = {'J', 'a', 'v', 'a'};
    String str3 = new String(chars);
    byte[] bytes = {72, 101, 108, 108, 111};
    String str4 = new String(bytes);

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
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
