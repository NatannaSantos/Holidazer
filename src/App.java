import java.util.Scanner;

public class App {
    public static void main(String[] args) { 
        Scanner date = new Scanner(System.in);
        System.out.println("Digite a data no formato xx/xx/xxxx");

        String imputDay = date.next();

        Holidays holiday = new Holidays();   

        String title = holiday.getHolidayByDate(imputDay);    
        
        System.out.println(title);

        //System.out.println(holiday);

    }
}
