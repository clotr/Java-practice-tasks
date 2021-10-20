import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hány számból számoljak?");
        int countOf = input.nextInt();
        int sumTotal = 0;
        for (int i = 1; i <= countOf; i++) {
            System.out.println("Add meg a " + i + ". számot:");
            sumTotal += input.nextInt();
        }
        System.out.println("Összeg: " + sumTotal);
        System.out.println("Átlag: " + sumTotal / countOf);
    }
}
