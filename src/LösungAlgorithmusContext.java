import java.util.Scanner;

public class LösungAlgorithmusContext {

	//bei dieser Übung geht es um die Darstellung einer "Sanduhr" in einem 6*6 Array 
	//aber: auf 3*3. insgesamt sind 16 (3*3)Sanduhren im 6*6 Array. 
	//Es soll die Summe für jede Sanduhr im Array berechnet werden. 
	//Die Sanduhr mit der höchsten Summe soll ausgegeben werden.
	
	
	public static class Solution {

		
		
		
		
		
		   public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int [][] values  = new int[6][6];
		        int max = Integer.MIN_VALUE;
		        int temp;
		        
		        // Auffüllen des Arrays
		        
		        for (int i = 0 ; i < 6; i ++) {
		        	for (int k = 0; k<6; k++) {
		        		values [i][k] = in.nextInt ();
		        		
		        	}
		        }
		        // [k=1][k=2][k=3]// i=1
		        //      [k =1]    // i=2
		        // [k =1][k=2][k =3] // i=3 
		        //i = rows Reihen, k=cols Zeilen
		      
		        for (int i =0; i<4;i++) {
		        	for (int k = 0; k<4;k++) {
		        		temp = values [i][k] + values [i] [k+1] + values [i][k+2] // Reihe 1
		        				+ values [i +1 ] [k + 1] // Reihe 2
		        						+ values [i+2][k] + values [i+2][k+1] + values [i+2][k+2]; //Reihe 3
		        		max= Math.max (temp, max);
		        		
		        	}
		        }
		    
		   System.out.println (max);
		   }
	}
	
}
	

//ein video dazu: https://www.youtube.com/watch?v=y7-X-L26j3o
		   
		   //FUNKTIONIERT NICH, nochmal bitte
		   
		   
		   
		    
		    
		 /*   private  static void Sum (int arr[][]){
		            
		            int sum=-1000;
		            for(int i =0 ; i<4;i++){ //und versuche die Sanduhr durchzuzählen
		                for(int x =0 ; x<4; x++){ //erste Zeile

		                		                }
		                    
		                    int x = 0;
							int top = arr[i][x]+arr[i][x+1]+arr[i][x+2]; //die obere Zeile 
		                    int middle = arr[i+1][x+1]; //die mittlere Zeile
		                    int bottom = arr[i+2][x]+arr[i+2][x+1]+arr[i+2][x+2]; //die untere Zeile
		                    if(top+middle+bottom>sum){
		                    	sum=top+middle+bottom;
		                  
		                    	
		                    	
		                }
		                    
		            }
		            System.out.println(sum);
		            
		            
		        }
	}
}	 */
