import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Add meg a testtömeged kg-ban!");
        int weight = in.nextInt();
        System.out.println("Add meg a magasságod centiméterben!");
        int height = in.nextInt();
        float heightm = (float) height / 100;
        float bmi = (float) weight / (heightm * heightm);
        System.out.println("A testtömegindexed: " + bmi);
        in.close();
        if (bmi < 25) {
            System.out.println("Ön nem túlsúlyos.");
        } else {
            System.out.println("Ön túlsúlyos.");
        }
        if (bmi >= 25 && bmi < 30) System.out.println("A túlsúlya minimális egészségügyi kockázatú.");
        if (bmi >= 30 && bmi < 35) System.out.println("A túlsúlya alacsony egészségügyi kockázatú.");
        if (bmi >= 35 && bmi < 40) System.out.println("A túlsúlya közepes egészségügyi kockázatú.");
        if (bmi >= 40) System.out.println("A túlsúlya magas egészségügyi kockázatú.");


    }
}
