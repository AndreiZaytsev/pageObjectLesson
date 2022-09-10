import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {

    private int day;
    private int month;
    private int year;

    public RandomDate dayBounds(int from, int to) {
        day = randomValue(from, to);
        return this;
    }

    public RandomDate monthBounds(int from, int to) {
        month = randomValue(from, to);
        return this;
    }

    public RandomDate yearBounds(int from, int to) {
        year = randomValue(from, to);
        return this;
    }


    private int randomValue(int origin, int bound) {
        return ThreadLocalRandom.current().nextInt(origin, bound);
    }

    public LocalDate generateDefault() {
        int day = randomValue(1, 20);
        int month = randomValue(1, 13);
        int year = randomValue(1900, 2022);
        return LocalDate.of(year, month, day);
    }

    public LocalDate generate() {
        return LocalDate.of(year, month, day);
    }
}
