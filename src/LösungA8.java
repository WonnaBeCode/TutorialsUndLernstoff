import java.util.Scanner;

public class LösungA8 {

	private static Scanner userInput;
	
// gibt die Zeilen Nummer plus eingefügten Text aus
	
	public static void main(String[] args) {
	    
	    
	    userInput = new Scanner(System.in);
	int lineNum = 1;    

	while (userInput.hasNextLine() == true) {
	    System.out.println(lineNum + " " + userInput.nextLine());
	    lineNum++;
	}

	}
	} 
