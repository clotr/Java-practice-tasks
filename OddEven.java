import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kérlek, írj be egy egész számot!");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("A beírt szám páros.");
        } else {
            System.out.println("A beírt szám páratlan.");
        }
        // ternary version of the if statement:
        String result = (number % 2 == 0) ? " páros" : " páratlan";
        System.out.println("A beírt szám" + result + ".");
        input.close();
    }
}
