import java.util.Scanner;

public class L�sungA5 {

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
 * Der Zweck dieser �bung besteht darin, Ihr Verst�ndnis der Formatierung von Ausgaben mit printf zu testen.
Um Ihnen den Einstieg zu erleichtern, wird ein Teil der L�sung f�r Sie im Editor bereitgestellt. 
Sie m�ssen die Eingabe formatieren und drucken, um die L�sung zu vervollst�ndigen.
Eingabeformat
Jede Eingabezeile enth�lt einen String gefolgt von einer ganzen Zahl.
Jeder String hat ein Maximum an alphabetischen Zeichen und jede ganze Zahl liegt im Inklusivbereich von bis.
Ausgabeformat
In jeder Ausgabezeile sollte es zwei Spalten geben:
Die erste Spalte enth�lt die Zeichenfolge und wird mit genau Zeichen ausgerichtet.
Die zweite Spalte enth�lt die ganze Zahl, ausgedr�ckt in genauen Ziffern; Wenn die urspr�ngliche 
Eingabe weniger als drei Ziffern hat, m�ssen Sie die f�hrenden Ziffern Ihrer Ausgabe mit Nullen auff�llen.*/