import java.util.Scanner;

public class L�sungDatenStrukturArrays {

public static void main(String[] args) {  
	
	
    Scanner input = new Scanner(System.in); 
    int length = input.nextInt(); 
    int[] values = new int[length]; 
    	for(int i=0; i < values.length ; i++){ 
    	    values [i] = input.nextInt (); }   		     	
    		for (int i = values.length-1; i >= 0; i--) {
    	
                System.out.print(values [i] + " ");
        
    }
}
}


//Video dazu: https://www.youtube.com/watch?v=hKQphShaM6g

/*	public static void main(String[] args) {  //er geht in die Main
	
	
    Scanner in = new Scanner(System.in); // Scanner holt sich die Eingabe
    
    int length = in.nextInt(); //die erste Eingabe soll ein Integer mit dem Namen "length" sein 
    //- legt fest wie gro� das Array sein soll
    int [] values  = new int[length]; // hier werden die Zahlen des Array eingegeben
    // der input soll sein 1432, der index des Arrays z�hlt 0123 das Value[2] w�re als die Zahl 3
    
    	for(int i=0; i < length ; i++){  //hier z�hlen wir einmal durch length
    	
    	    values [i] = input.nextInt ();}  	
    	
    		for (int i = length -1; 1>=0; i--) { //hier z�hlen wir nun einfach zur�ck
    	
    			System.out.print(values [i] + " ");
        
    }
    }
}*/



