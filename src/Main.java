import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        //creo un oggetto OffsetDateTime con all'interno la stringa suggerita in consegna
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //ottengo l'anno
        Integer dataString1 = data.getYear();

        //ottengo il nome del mese
        String dataString2 = data.getMonth().name();

        //ottengo il giorno del mese
        Integer dataString3 = data.getDayOfMonth();

        //ottengo il nome del giorno del mese
        DayOfWeek dataString4 = data.getDayOfWeek();

        //stampo i risultati
        System.out.println(dataString1);
        System.out.println(dataString2);
        System.out.println("DAY : " + dataString3);
        System.out.println(dataString4);
    }
}