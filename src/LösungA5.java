import java.util.Scanner;

public class LösungA5 {

	  private static Scanner sc;

	public static void main(String[] args) {
		
	        sc = new Scanner(System.in);
	        System.out.println("================================");
	        for(int i=0;i<3;i++)
	        {
	            String s1=sc.next();
	            int x=sc.nextInt();
	            System.out.printf("%-15s%03d%n", s1, x);
	        }
	        System.out.println("================================");

	    }
	}

/*Die Java-Funktion System.out.printf kann zum Drucken formatierter Ausgaben verwendet werden. 
 * Der Zweck dieser Übung besteht darin, Ihr Verständnis der Formatierung von Ausgaben mit printf zu testen.
Um Ihnen den Einstieg zu erleichtern, wird ein Teil der Lösung für Sie im Editor bereitgestellt. 
Sie müssen die Eingabe formatieren und drucken, um die Lösung zu vervollständigen.
Eingabeformat
Jede Eingabezeile enthält einen String gefolgt von einer ganzen Zahl.
Jeder String hat ein Maximum an alphabetischen Zeichen und jede ganze Zahl liegt im Inklusivbereich von bis.
Ausgabeformat
In jeder Ausgabezeile sollte es zwei Spalten geben:
Die erste Spalte enthält die Zeichenfolge und wird mit genau Zeichen ausgerichtet.
Die zweite Spalte enthält die ganze Zahl, ausgedrückt in genauen Ziffern; Wenn die ursprüngliche 
Eingabe weniger als drei Ziffern hat, müssen Sie die führenden Ziffern Ihrer Ausgabe mit Nullen auffüllen.*/