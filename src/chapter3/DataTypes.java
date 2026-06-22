package chapter3;

// Primitive Types
// byte: 1 byte size and stores whole numbers from -128 to 127
// short: 2 bytes size and stores whole numbers from -32,768 to 32,767
// int: 4 bytes size and stores whole numbers from -2,147,483,648 to 2,147,483,647
// long: 8 bytes size and stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float: 4 bytes size and stores fractional numbers 6 to 7 digits
// double: 8 bytes size and stores fractional numbers 15 digits
// boolean: 1 bit size and stores true or false values
// char: 2 bytes size and stores a single character/letter or ASCII values
public class DataTypes {
    public static void main(String[] args) {
        byte num = 100;
        System.out.println(num);

        // byte num2 = 1_000_000;  cannot use byte for this
        int num2 = 1_000_000;

        long num3 = 100_000_000_000L; // must use L at the end for long

        // we can use exponent
        float f = 1.4e2f;
        double doubleNumber = 1.3e5d;

        // we can define multiple variables in a single line
        char a = 'A', b = 'B', c = 'C';
        int n1 = 10, n2 = 15, n3 = 20;


        int numberOfItems = 100;
        float costPerItem = 1.99f;
        float totalCost = numberOfItems * costPerItem;
        System.out.println("Total Cost is: " + totalCost);
    }
}
