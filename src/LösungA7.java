import java.util.Scanner;

public class L�sungA7 {

	 private static Scanner sc;

	public static void main(String []argh)
	    {



	        sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	    {

	                try
	        {
	            long x=sc.nextLong();
	            System.out.println(x+" can be fitted in:");
	            if(x>=-128 && x<=127) {
	                System.out.println("* byte");
	            }
	            if (x>=Math.pow(2, 15)*-1 && x<=Math.pow(2, 15)-1){
	                System.out.println ("* short");
	            }
	            if (x>=Math.pow(2,31)*-1 && x<=Math.pow (2,31)-1) {
	                System.out.println ("* int");  
	            }
	            if (x>=Math.pow(2,63)*-1 && x<=Math.pow(2, 63)-1) {
	              	System.out.println("* long");
	            }
	          
	            
	        }
	        catch(Exception e)
	        {
	            System.out.println(sc.next()+" can't be fitted anywhere.");
	        }

	    	}
	    }
	}
