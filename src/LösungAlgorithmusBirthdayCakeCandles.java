import java.util.Scanner;

public class L�sungAlgorithmusBirthdayCakeCandles {

	
	 static int birthdayCakeCandles(int n, int[] ar) {
		return n; }
	        
		 
		 // Complete this function
	   

	    public static void main(String[] args) {
	    	
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] height = new int[n];
	        int highest = 0; // wir m�ssen die h�chste nummer finden 
	        for(int height_i = 0; height_i < n; height_i++){
	            height[height_i] = in.nextInt();
	            if (height[height_i] > highest) { // hier vergleichen wir
	        	highest = height[height_i]; // hier bekommen wir die h�chste nummer aus dem Krezen-Array
	        	
	            }
	        }
	        int total = 0; // gesmatzahl
	        for (int i=0;i<n;i++) {
	        	if (highest == height [i]) {   //z�hlt das Kerzenarray nochmal durch 
	        		total ++; // und gibt das total aus 
	        	
	        	}
	        }
	        System.out.println (total);
	        
	    }
	 }

