import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hány lány jön a partiba?");
        int numberOfGirls = input.nextInt();
        System.out.println("Hány fiú jön a partiba?");
        int numberOfBoys = input.nextInt();
        int total = numberOfBoys + numberOfGirls;
        if (total > 20 && numberOfBoys == numberOfGirls) System.out.println("Kitűnő lesz a buli!");
        else if (total > 20 && numberOfBoys != numberOfGirls && numberOfGirls > 0) System.out.println("Egész jó lesz a buli!");
        else if (total <= 20 && numberOfGirls > 0) System.out.println("Átlagos lesz a buli");
        else if (numberOfGirls == 0) System.out.println("Hűha");
        input.close();
    }
}
