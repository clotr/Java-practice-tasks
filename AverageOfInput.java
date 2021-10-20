import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Átlagot fogok számolni 5 egész számból.");
        System.out.println("Kérem az első számot:");
        int number1 = input.nextInt();
        System.out.println("Kérem az második számot:");
        int number2 = input.nextInt();
        System.out.println("Kérem az harmadik számot:");
        int number3 = input.nextInt();
        System.out.println("Kérem az negyedik számot:");
        int number4 = input.nextInt();
        System.out.println("Kérem az ötödik számot:");
        int number5 = input.nextInt();
        float averageOfFive = ((float) number1 + (float) number2 + (float) number3 + (float) number4 + (float) number5) / 5;
        System.out.println("Az öt szám számtani átlaga: " + averageOfFive);
    }
}
