import java.util.Scanner;

public class LösungAlgorithmusPlusMinus {

	
	//hier soll berechnet werden welche Elemte eines Array positiv, welche negativ sind und, 
	//welche null sind

	
	
	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        int size = scanner.nextInt();
	        
	        int[] a = new int[size];
	        
	        double fractionPositive = 0;
	        double fractionZero = 0;
	        double fractionNegative = 0;
	        
	        for (int i = 0; i < size; i++){
	            a[i] = scanner.nextInt();
	            if (a[i] > 0) fractionPositive += 1;
	            else if (a[i] == 0) fractionZero += 1;
	            else if (a[i] < 0) fractionNegative += 1;
	        }
	        
	        System.out.println(fractionPositive/size);
	        System.out.println(fractionNegative/size);
	        System.out.println(fractionZero/size);
	        
	    }
	}