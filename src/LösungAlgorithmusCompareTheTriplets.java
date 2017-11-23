import java.util.Scanner;

public class LösungAlgorithmusCompareTheTriplets {
	// es werden für zwei Personen eine Bewertung abgegebn im Zahlenbereich von 1 bis 100
	// drei Kategorien sollen bedient werden. 
	//Für ALICE soll A = (a0,a1,a2) für Bob B = (b0,b1,b2)
	// Die Aufgabe ist  zu vergleichen a0 ist Alice besser also a0>b0 Alice bekommt eine belohnung
	
	
	
	
	private static Scanner in;

	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		// Init. Points Array for Alice and Bob, means Array with 2 values
		// Alice: result[0], Bob: result[1]
		// Init. with score 0 for both (Alice, Bob)
		
		int[] result = {0,0};
		result [0] = ((a0>b0)?1:0) + ((a1>b1)?1:0) + ((a2>b2)?1:0); //3kleine Schleife: wenn, dann, ansonsten//
		result [1] = ((b0>a0)?1:0) + ((b1>a1)?1:0) + ((b2>a2)?1:0); // siehe: Ternärer Operator 
		return result;
		
		
        // Complete this function
    }

    public static void main(String[] args) {
        in = new Scanner(System.in); //er geht hier in den Scanner und holt sich die Werte für das Array
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2); 
        for (int i = 0; i < result.length; i++) {  //result ist das Array als Zusammenfassung// darf nicht größer sein als die gesamte länge des Arrays 
            System.out.print(result[i] + (i != result.length - 1 ? " " : "")); //hier muss man -1 schreiben, weil das arrray bei null beginnt
            // ? " " : " " - ist eine kleine Schleife 
        }
        System.out.println("");
        

    }
}
