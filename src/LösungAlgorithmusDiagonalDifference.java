import java.util.Scanner;

public class LösungAlgorithmusDiagonalDifference {

	//hier soll die Summe der Diagonale in einem zweidimensionalen Array genommen werden. 
	//Dann die Differenz der beiden Summe gebildet werden
	// Video zur diagonale einer Matrix: https://www.youtube.com/watch?v=4U9EstDWxVs ab min.1
	
	
	private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int n = in.nextInt(); // die Eingabe 
        int array[][] = new int[n][n]; // java legt ein Array an 
        int d1 = 0, d2 =0; // die variablen werden auf 0 gesetzt, sonst funktionierts nicht  
        for(int i =0; i<n;i++) { //die erste for schleife quasi für die waagerechte 
        	for (int j = 0; j<n;j++) { // die schleife definiert den nächsten ArrayWert und orientiert sich an den zuvor eingegebenen Werten 
        		array [i][j] = in.nextInt(); //eingabe der werte
        		if (i==j){ //???????????
        			d1 = d1 + array [i][j];
        			
        		}
        		if (i+j==n-1) {
        			d2 = d2 + array[i][j];
        			
        		}
        	}
        }
        System.out.println(Math.abs(d1-d2));
        
            }
            }
