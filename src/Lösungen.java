import java.util.Scanner;

public class Lösungen {

	// HackerRank Lösung für stdin/stdout (standard input und standard output) mit einem Skanner
	// hier wird nur ausgegeben, was eingegeben wird
	
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			int a=sc.nextInt();
			System.out.println(a);
		}
	}
}