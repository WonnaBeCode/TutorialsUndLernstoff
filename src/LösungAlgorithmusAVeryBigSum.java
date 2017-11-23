import java.util.Scanner;

public class LösungAlgorithmusAVeryBigSum {

	
	private static Scanner in;

	//es soll die Summer der Elemente eines Array herausgegeben werden "Die Zahl kann sehr groß sein"
	//es ist dasselbe Vergahren wie mit der kleinen Summe, hier mit "long"
	
	
	 static long aVeryBigSum(int n, long[] ar) {
	    
		 long result = 0;                            
			
			
			for(long value : ar) {                
				result += value;						
			}
			return result;  
	    		
	    		
	    		
	    		// Complete this function
	    }

	    public static void main(String[] args) {
	        in = new Scanner(System.in);
	        int n = in.nextInt();
	        long[] ar = new long[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextLong();
	        }
	        long result = aVeryBigSum(n, ar);
	        System.out.println(result);
	    }
	}
