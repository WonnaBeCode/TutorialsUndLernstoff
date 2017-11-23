import java.util.Scanner;

public class AlgorithmusStaircase {
	
	
	
	public static void main (String[]ars) {
			
		
			
			Scanner in = new Scanner (System.in); //Scanner holt sich die Zahlen
			int n = in.nextInt(); //deklaration einer neuen Variablen aus dem Scanner
			for (int i=0;i<n; i++) { //zählt die Reihe des Arrays 
				for (int j=0;j<n;j++) { // zählt die Spalten des Arrays
					if (j<n-1-i) { // WENN:  - 1 in der ersten Spalte, dann - i für die nächsten Reihen
					System.out.print(" ");//DANN: schreibt ein Leerzeichen
					}else { //ANSONSTEN
						System.out.print("#"); //schreibt er Route
						
					}
					}
			System.out.println(" ");	//macht den zeilenumbruch bezieht sich auf die erste for schleife
			}
			}
	}