import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kérek egy egész számot!");
        int number = input.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + number + " = " + i * number);
        }
        input.close();
    }
}
