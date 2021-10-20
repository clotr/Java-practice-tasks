import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Írd be a mérföldek számát!");
        float numberOfMiles = input.nextFloat();
        float numberOfKms = numberOfMiles * 1.609344f;
        System.out.println("Kilométerre átszámolva: " + numberOfKms);
        input.close();
    }
}
