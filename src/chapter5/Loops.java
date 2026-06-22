package chapter5;

public class Loops {
    public static void main(String[] args) {
        // syntax is initial value; condition on when to terminate the loop; increment
        for (int i = 0; i < 4; i++) {
            // prints i at each iteration until i = 4 which breaks out of the loop
            System.out.println(i);
        }

        // there is also for-each loop

        String[] colors = {"red", "green", "blue", "yellow"};
        for (String s : colors) {
            System.out.println(s); // iterates through the colors
        }

        // While
        int x = 0;
        while (x <= 3) {
            System.out.println(x);
            // this will break the loop when x does not satisfy the condition (larger than 3)
            x++;
        }

        // Do-While
        // body of the do runs first before checking the while condition
        int j = 0;
        do {
            j++;
            System.out.println(j);
        } while ( j < 10); // prints 10
    }
}
