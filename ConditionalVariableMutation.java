public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        out = (a % 2 == 0) ? out + 1 : out;
        System.out.println(out);
        int b = 13;
        String out2 = "";
        if (b > 10 && b < 20) out2 = "Édes!";
        else if (b < 10) out2 = "Kevés!";
        else if (b > 20) out2 = "Sok!";
        System.out.println(out2);
        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        if (credits >= 50 && isBonus == false) c -= 2;
        else if (credits < 50 && isBonus == false) c -= 1;
        System.out.println(c);
        int d = 8;
        int time = 120;
        String out3 = "";
        if (d % 4 == 0 && time <= 200) out3 = "check";
        else if (time > 200) out3 = "Az idő lejárt!";
        else out3 = "Fuss, Forest, Fuss!";
        System.out.println(out3);
    }
}
