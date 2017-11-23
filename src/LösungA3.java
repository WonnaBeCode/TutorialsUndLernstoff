import java.util.Scanner;

public class LösungA3 {

	
/* Eine If Else Abfrage für bestimmte Bedingungen; wenn n gleich ist sollte weird ausgegeben werden - einfach bei HackerRank nochmal schauen: Given an integer, , perform the following conditional actions:

    If is odd, print Weird
    If is even and in the inclusive range of to , print Not Weird
    If is even and in the inclusive range of to , print Weird
    If is even and greater than , print Not Weird

Complete the stub code provided in your editor to print whether or not is weird. 
 
*/
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}

