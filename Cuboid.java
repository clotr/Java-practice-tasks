import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Add meg a téglatest szélességét:");
        int width = input.nextInt();
        System.out.println("Add meg a téglatest hosszát:");
        int length = input.nextInt();
        System.out.println("Add meg a téglatest magasságát:");
        int height = input.nextInt();
        int surface = (width * length + width * height + length * height) * 2;
        int volume = width * length * height;
        System.out.println("A téglatest felülete: " + surface);
        System.out.println("A téglatest térfogata: " + volume);
        input.close();
    }
}
