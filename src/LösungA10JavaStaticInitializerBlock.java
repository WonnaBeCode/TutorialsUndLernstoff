import java.util.Scanner;

public class LösungA10JavaStaticInitializerBlock {

	
		//statischer Initialisierungsblock static Initialization Blocks: Wir haben eine main Methode gegeben. 
		// das Ziel: Die Ausgabe der Höhe und Breite eines Parallelogramms; Die Variablen sollen über den Standard input gelesen werden. 
		// Sollten Breite oder HÖhe kleiner gleich Null sein soll die Ausgabe "java.lang.Exception: Breadth and height must be positive" lauten.
		
			
		static int B,H;
		static boolean flag;

		static{
			B=new Scanner(System.in).nextInt(); 
			H=new Scanner(System.in).nextInt();
			if(B>0&&H>0){
				flag=true;
			}else{
				System.out.println("java.lang.Exception: Breadth and height must be positive");
			}
	    }

		public static void main1(String[]args){    //Warum funktioniert es hier und nicht in HackerRank?????????
			if(flag){
				int area=B*H;
				System.out.println(area);
			}
		}
		public static void main(String [] args) { 
			if (flag) {
				int area =B*H;
				System.out.print(area);;
			}
		
			}
		}


