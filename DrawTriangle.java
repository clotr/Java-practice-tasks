import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Esdeklem egy számért:");
        int lineCount = input.nextInt();
        for (int i = 1; i < lineCount + 1; i++) {
            System.out.println("");
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
        }
    }
}
