import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JavaLearning {

    public static void main(String[] args) {
        LocalDate date, date2;
        RandomDate randomDate = new RandomDate();
        date = randomDate.generateDefault();
        date2 = randomDate.dayBounds(1, 3).monthBounds(1, 3).yearBounds(1900, 1910).generate();
        String pattern = "dd.MMM.yyyy";
        String formatDate = date.format(DateTimeFormatter.ofPattern(pattern));

        Button add = new Button("Add");
        Button ok = new Button("Ok");

        Step log = new Step();
        log.logClick("Нажимаем кнопку", add);
        log.logClick("Нажимаем кнопку", ok);

        log.logClick("Нажимаем кнопку", () -> {
                    Button cancel = new Button("Cancel");
                    cancel.click();
                }
        );
        log.logClick("Нажимаем кнопку", () -> System.out.println("БлаБлаБла"));


        System.out.println(date);
        System.out.println(date2);

    }
}
