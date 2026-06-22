package chapter3;

public class Arrays {
    public static void main(String[] args) {
        int x = 10; // Single integer value

        int[] numbers = {1,2,3,4,5}; // Stored in RAM, and values are located right next to each other

        // We can use random indexing O(1) and indexes start with 0 in Java
        System.out.println(numbers[0]);

        String[] names = {"Ana","Adam", "Kevin"};
        System.out.println(names[2]); // prints Kevin

        names[1] = "Daniel"; // updates value at index 1 which is Adam to Daniel
        System.out.println(names[1]); // prints Daniel
    }
}
