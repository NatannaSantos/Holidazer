import java.util.Scanner;

public class App {
    public static void main(String[] args) { 
        Scanner date = new Scanner(System.in);
        System.out.println("Digite a data no formato xx/xx/xxxx");

        String imputDay = date.next();

        Holidays holiday = new Holidays();   
        
        holiday.getHolidayByDate(imputDay);        

        //System.out.println(holiday);

    }
}
