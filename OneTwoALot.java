import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Írj be kérlek egy számot:");
        int number = input.nextInt();
        if (number <= 0) System.out.println("Nem elég");
        else if (number == 1) System.out.println("Egy");
        else if (number == 2) System.out.println("Kettő");
        else System.out.println("Sok");
        input.close();
    }
}
