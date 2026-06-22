package chapter3;

public class Strings {
    public static void main(String[] args) {
        // strings are not primitive types, they are reference type

        String name = "Kevin";
        System.out.println(name);

        // Since they are reference type, we can use some operations
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        name.toUpperCase(); // this updates the value but doesn't update the original variable
        System.out.println(name); // this is because string is immutable reference type

        name = name.toUpperCase();
        System.out.println(name); // This essentially creates a new string

        // String concatenation
        String s1 = "Hello ";
        String s2 = "World!";

        System.out.println(s1 + s2);
        // or
        System.out.println(s1.concat(s2));
    }
}
