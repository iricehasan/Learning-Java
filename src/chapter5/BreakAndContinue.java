package chapter5;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaks at 5");
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Skips printing 5");
                continue;
            }
            System.out.println(i);
        }

        OUTER_LOOP: for (int i = 0; i < 5; i++) {
            System.out.println("Outer Loop");
            INNER_LOOP: for (int j=0; j < 3; j++) {
                if (j == 2) {
                    break OUTER_LOOP; // We can label loops and use them in break
                }
                System.out.println("Inner Loop");
            }
        }
    }
}
