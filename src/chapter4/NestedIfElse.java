package chapter4;

/*
    if (condition1) {
        // code is executed if condition1 is true
        if (condition2) {
            // code is executed if condition1 and condition2 is true
        }
    }
 */

public class NestedIfElse {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 87;
        int number3 = 100;
        int greatestNumber;

        if (number1 >= number2) {
            if (number1 >= number3) {
                greatestNumber = number1;
            } else {
                greatestNumber = number3;
            }
         } else {
            if (number2 >= number3) {
                greatestNumber = number2;
            } else {
                greatestNumber = number3;
            }
        }

        System.out.println("Largest number is: " + greatestNumber);
    }
}
