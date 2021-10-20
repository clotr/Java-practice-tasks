import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Add meg a sorok számát:");
        int lineCount = input.nextInt();
        input.close();
        // generating first row
        String rowContent = "%";
        for (int i = 0; i < lineCount; i++) {
            System.out.print("%");
            if (i == lineCount - 1) System.out.println("");
        }
        // generating middle rows using a concatenated string
        for (int i = 1; i <= lineCount - 2; i++) {
            for (int j = 1; j <= lineCount; j++) {
                rowContent += " ";
                if (j == lineCount - 2) rowContent += "%";
            }
            System.out.println(rowContent);
            rowContent = "%";
        }

        // generating last row
        for (int i = 0; i < lineCount; i++) {
            System.out.print("%");
        }
    }
}
//    Add meg a sorok számát:
//    10
//        %%%%%%%%%%
//        %        %
//        %        %
//        %        %
//        %        %
//        %        %
//        %        %
//        %        %
//        %        %
//        %%%%%%%%%%