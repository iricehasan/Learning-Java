package chapter5;

public class WhileLoops {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            if (i == 2) {
                i++;
                continue; // skip printing 2
            }
            System.out.println(i);
            i++;
        }
    }
}
