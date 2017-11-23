import java.util.Scanner;

public class LösungAlgorithmusSparseArrays {
	
	
   
    	private static Scanner in;

		public static void main(String[] args) {
            
            in = new Scanner (System.in); 
    	       int n = in.nextInt ();
    	           String s[] = new String [n];
    		             for (int i = 0; i< s.length; i++) {
    			
                             s [i] = in.next ();
    			
    		}
    		int q = in.nextInt();
    		int count [] = new int [q];
    		  for (int i = 0; i < q; i++) {
    			String ss = in.next ();
    			     for (int j =0; j < s.length; i++) {
    				    if (s[j].equals(ss)) {
    					   count [i] ++;
                        }
    				}
    			}
    			for (int i = 0; i < count.length; i++) {
    				System.out.println (count [i]);
    				
    			}
    		}
    	}
