import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kérem az első számot!");
        int number1 = input.nextInt();
        System.out.println("Kérem a második számot!");
        int number2 = input.nextInt();
        input.close();
        if (number2 <= number1) System.out.println("A második számnak nagyobbnak kellene lennie!");
        if (number2 > number1) {
            for (int i = number1; i < number2; i++) System.out.println(i);
        }

    }
}
