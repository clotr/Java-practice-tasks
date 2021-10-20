public class CodingHours {
    public static void main(String[] args) {
        System.out.println("Egy átlagos Green Fox hallgató naponta 6 órát kódol.");
        int codingHours = 6*5*17;
        System.out.println("Egy félév során (17 hét) a hallgató átlagosan " + codingHours + " órát kódol, ha hétvégén pihen.");
        int totalHours = 52*17;
        float percentage = (float) codingHours / (float) totalHours * 100;
        float roundedPercentage = (float) Math.round(percentage*10) / 10;
        System.out.println("Ez a félévének " + roundedPercentage + " %-át teszi ki." );
    }
}
