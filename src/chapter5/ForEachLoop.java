package chapter5;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        for (int n = 0; n < numbers.length + 1; n++) {
            System.out.println(numbers[n]);
        }

        // instead we can use for-each loop
        for (int num : numbers) {
            System.out.println(num);
        }

        // we can also iterate on array of strings
        String[] names = {"BMW", "Mercedes", "KIA", "Mazda"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
