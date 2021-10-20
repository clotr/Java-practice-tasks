import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hány baromfid van?");
        int chickenNumber = input.nextInt();
        System.out.println("Hány sertésed van?");
        int pigNumber = input.nextInt();
        int legNumber = chickenNumber * 2 + pigNumber * 4;
        System.out.println("Az állatok lábainak száma: " + legNumber);
        input.close();
    }
}
