import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        long actual = service.calculate(5_000, true);
        System.out.println("1. " + expected + "== ? == " + actual);

        expected = 140;
        actual = service.calculate(5_000, true);
        System.out.println("2. " + expected + "== ? == " + actual);
    }

}
