import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("El fogom dönteni, melyik beírt szám a nagyobb.");
        System.out.println("Add meg az első számot!");
        int number1 = input.nextInt();
        System.out.println("Add meg a második számot!");
        int number2 = input.nextInt();
        if (number1 > number2) System.out.println("A nagyobb szám: " + number1);
        else if (number1 == number2) System.out.println("A két szám egyenlő");
        else System.out.println("A nagyobb szám: " + number2);
        input.close();
    }
}
