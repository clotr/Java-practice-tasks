public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 23;
        int currentMinutes = 21;
        int currentSeconds = 12;
        int remainingHours = 23 - currentHours;
        int remainingMinutes = 59 - currentMinutes;
        int remainingSeconds = 59 - currentSeconds;
        int remainingTotal = 1 + remainingSeconds + remainingMinutes * 60 + remainingHours * 60 * 24;
        System.out.println("Éjfélig hátralévő másodpercek: " + remainingTotal);
    }
}
