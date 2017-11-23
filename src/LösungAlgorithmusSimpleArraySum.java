import java.util.Scanner;

public class LösungAlgorithmusSimpleArraySum {

	
	// Hier soll die Summe des Arrays ausgegeben werden. die einfachste, die ich 
	// gefunden habe ist folgende 

	private static Scanner in;

	static int simpleArraySum (int n, int[] ar) { //die Variablen sind breits bekannt
		int result = 0;                              // das Int wird auf 0 gesetzt
		
		
		for(int value : ar) {                  // in der neuen for-Each schleife werden die Werte nacheinander ausgelesen 
			result += value;						// die 'result' variable wird um den Wert aufaddiert
		}
		return result;
		
        // Complete this function
    }

    public static void main(String[] args) {   // zuerst geht das Programm in die Main
        in = new Scanner(System.in);
        int n = in.nextInt();                  // der erste Wert n (wird die Anzahl der Summanden)
        int[] ar = new int[n];                 // dann schreibt er diese in ein Array
        for(int ar_i = 0; ar_i < n; ar_i++){   // for schleife 1 wird initalisiert; 2 bedingung; 3 Zählvariable (Anzahl der Loops: n)
            ar[ar_i] = in.nextInt();           // dann schreibt er jeden Integer Eingabewert vom Scanner in das Array
            								   // Elemente sehen so aus: ar[0] = erster Wert, ..., ar[n-1] = letzter Wert
        }
        System.out.println(simpleArraySum(n, ar));  // bevor er hier her kommt geht er hoch zur Mehtode
    }
}

