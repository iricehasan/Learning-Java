package chapter3;

/*
    Widening Casting (automatically): converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually): converting a larger type to a smaller type size
    double -> float -> long -> int -> char -> short -> byte

 */
public class TypeCasting {
    public static void main(String[] args) {

        // Widening Casting
        int num = 10;
        double doubleNum = num; // we can cast automatically

        System.out.println(num);
        System.out.println(doubleNum);

        // Narrowing Casting
        double doubleNum2 = 10.5d;
        int castedInt = (int) doubleNum2;

        System.out.println(doubleNum2);
        System.out.println(castedInt);

        // we do manual casting since widening casting only happens after the value is calculated
        // 165 / 200 = 0 with integer division and then this is converted to 0.0 with widening casting
        // So, we use float explicitly to calculate correctly
        int maxScore = 200;
        int actualScore = 165;
        float percentage = (float) actualScore / maxScore * 100;

    }
}
