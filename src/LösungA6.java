import java.util.Scanner;

public class L�sungA6 {

	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
       int t=in.nextInt();
       for(int i=0;i<t;i++){
           int a = in.nextInt();
           int b = in.nextInt();
           int n = in.nextInt();
           int res = a;
           for (int j = 0; j < n; j++)
           {
               res += (int)(Math.pow(2, j) * b);
               System.out.print(Integer.toString(res)  + ' ');
           }
           System.out.print('\n');
       }
   in.close();
   }
}


/*We use the integers , , 
 * and to create the following series:
You are given queries in the form of , , and . For each query, print the series corresponding 
to the given , , and values as a single line of space-separated integers.
Input Format The first line contains an integer, , denoting the number of queries.
Each line of the subsequent lines contains three space-separated integers describing 
the respective , , and values for that query. */