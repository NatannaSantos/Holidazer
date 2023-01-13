import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);
        System.out.println("Digite a data no formato xx/xx/xxxx ou digite t para saber todos os feriados");

        String imputDay = date.next();

        Holidays holiday = new Holidays();

        String title = holiday.getHolidayByDate(imputDay);

        if (title != null) {
            System.out.println(title);
        }

    }
}
