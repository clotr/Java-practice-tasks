import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Esdeklem egy számért:");
        int lineCount = input.nextInt();
        int i = 0;
        int numberOfX = 1;
        do {
            for (int j = i; lineCount - j > 0; j++) {
                System.out.print(" ");
                if (lineCount - j == 1) {
                    for (int k = 0; k < numberOfX; k++) {
                        System.out.print("x");
                    }
                }
            }
            i++;
            numberOfX += 2;
            System.out.println("");
        } while (i <= lineCount);
        input.close();
    }
}
