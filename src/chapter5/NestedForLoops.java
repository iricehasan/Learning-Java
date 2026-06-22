package chapter5;

public class NestedForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Outer loop with i: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner loop with j: " + j);
            }
        }

        String[] symbols = {"UP", "DOWN"};
        int[] numbers = {1,2,3};
        String[] colors = {"red", "green", "blue"};

        for (int num : numbers) {
            for (String symbol : symbols) {
                for (String color: colors) {
                    System.out.println(num + "-" + symbol + "-" + color);
                }
            }
        }

    }
}
