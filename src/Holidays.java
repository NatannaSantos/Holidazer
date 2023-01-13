import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Holidays {
    List<Holiday> holidays = new ArrayList<>();

    public Holidays() {
        Holiday confraternizacaoMundial = new Holiday("01/01/2023", "Confraternização Mundial");
        holidays.add(confraternizacaoMundial);
        Holiday carnaval = new Holiday("21/02/2023", "Carnaval");
        holidays.add(carnaval);
        Holiday pascoa = new Holiday("17/04/2023", "Páscoa");
        holidays.add(pascoa);
        Holiday tiradentes = new Holiday("21/04/2023", "Tiradentes");
        holidays.add(tiradentes);
        Holiday diaDoTrabalho = new Holiday("01/05/2023", "Dia do Trabalho");
        holidays.add(diaDoTrabalho);
        Holiday corpusChristi = new Holiday("08/06/2023", "Corpus Christi");
        holidays.add(corpusChristi);
        Holiday independenciaDoBrasil = new Holiday("07/09/2023", "Independência do Brasil");
        holidays.add(independenciaDoBrasil);
        Holiday nossaSenhoraAparecida = new Holiday("12/10/2023", "Nossa Senhora Aparecida");
        holidays.add(nossaSenhoraAparecida);
        Holiday finados = new Holiday("02/11/2023", "Finados");
        holidays.add(finados);
        Holiday proclamacaoDaRepublica = new Holiday("15/11/2023", "Proclamação da República");
        holidays.add(proclamacaoDaRepublica);
        Holiday natal = new Holiday("24/12/2023", "natal");
        holidays.add(natal);
    }

    public String getHolidayByDate(String date) {
        if (date.equals("t")) {
            getAllHolidays();  
            return null;            
        }
        
        for (int i = 0; i < holidays.size(); i++) {
            if (holidays.get(i).getDate().equals(date)) {
                return holidays.get(i).getTitle();
            }
        }
        return "Não é Feriado";

    }

    public void getAllHolidays(){       
        
         for(int i=0; i<holidays.size();i++){
           String holiday = (holidays.get(i).getDate() + "=>" + holidays.get(i).getTitle());
           System.out.println(holiday);                      
        }     
        
    }
}
