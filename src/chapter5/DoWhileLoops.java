package chapter5;

public class DoWhileLoops {
    public static void main(String[] args) {
        int i = 0;

        do {
            if (i == 2) {
                i++;
                continue; // skip printing 2
            }
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
