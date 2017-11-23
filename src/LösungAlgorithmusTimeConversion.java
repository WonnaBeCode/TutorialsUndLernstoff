import java.util.*;
import java.text.*;


public class LösungAlgorithmusTimeConversion {

    private static Scanner in;

	public static void main(String[] args) {
    	in = new Scanner(System.in);
        String s = in.next();
        // Verarbeitung
        try {
        	SimpleDateFormat givenFormat = new SimpleDateFormat("h:mm:ssa");	// Input-Format definiert
        	SimpleDateFormat returnFormat = new SimpleDateFormat("HH:mm:ss");	// Output-Format definiert
        	Date date = givenFormat.parse(s);									// Eingabe auf Date Objekt anwenden (parsen)
        																		// Falls fehlerhafte Eingabe -> catch: Exception
        	String output = returnFormat.format(date);
            // Ausgabe
            System.out.println(output);
        } catch (ParseException e) {
        	e.printStackTrace();
        }
        

    }
}