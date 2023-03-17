import Time.Times;

public class Main {
    public static void main(String[] args) {
        Times time = new Times();

        System.out.println(time.returnLocalDate());
        System.out.println(time.returnLocalTime());
        System.out.println(time.returnLocalDateTime());
        System.out.println(time.returnZonedDateTime());
        time.addAminuteAhourAdayAyear();
    }
}