package chapter4;

public class Switch {
    public static void main(String[] args) {
        int day = 1;

        // this one falls-through next case if we don't use break
        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            default:
                System.out.println("Not a valid input"); // no need to define break here
        };

        System.out.println("End of switch");

        int x = 1;

        // no need to use break, no fall-through
        String s = switch (x) {
            case 1 -> "one";
            case 2 -> "two";
            case 3, 4, 5 -> "three, four, five";
            default -> "not a valid input";
        };

        System.out.println(s);
    }
}
