package chapter3;

// String: stores text, such as "Hello", surrounded by double quotes.
// int: stores integers, without decimals.
// float: stores floating point numbers, with decimals.
// char: stores single characters, such as 'a' or 'B'
// boolean: stores either true or false
public class Variables {
    public static void main(String[] args) {
        int age = 23; // use camelCase
        System.out.println("The age is: " + age);
        age = 30; // variable is updated
        System.out.println("The age is: " + age);

        final int newAge = 25;
        // newAge = 30; we cannot update the variable later on if we use final

        float price = 30.15f; // you must use f at the end

        String name = "Kevin";
        boolean isMale = true;

        char aLetter = 'a';

        System.out.println(price);
        System.out.println(name);
        System.out.println(isMale);
        System.out.println(aLetter);



    }
}
