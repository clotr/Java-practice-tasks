import java.util.Scanner;

public class HelloMe {
    public static void main(String[] args) {
        System.out.println("Hogy hívnak?");

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        System.out.println("Helló " + name + "!");

        in.close();
    }
}
