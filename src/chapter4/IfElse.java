package chapter4;

/*
    if (condition1) {
        // code is executed if condition1 is true
    } else if (condition2) {
        // code is executed if condition1 is false and condition2 is true
    } else if (condition3) {
        // code is executed if condition 1 & condition2 are false and condition3 is true
    } else {
        // code is executed if all conditions are false
    }
 */
public class IfElse {
    public static void main(String[] args) {
        int num = 10000;

        if (num < 1000) {
            System.out.println("number is smaller than 1000");
        } else if ( num < 2000) {
            System.out.println("number is larger than 1000 and smaller than 2000");
        } else if (num < 5000) {
            System.out.println("number is larger than 2000 and smaller than 5000");
        } else {
            System.out.println("number is larger than 5000");
        }
    }
}