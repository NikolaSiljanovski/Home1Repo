
import java.util.Scanner;


public class Stepen {

	public static void main(String[] args) {

		
		int c ; // Celziusovi stepeni
		int f ; // farenhajtovi stepeni
		
		
		//Vlez na podatok od tastatura 
		
		
		Scanner tastatura = new Scanner(System.in);
		
		// vcituvanje na stepeni vo celzius od korisnikot 
		System.out.println(" Vnesete celziusovi stepeni : ");
		c = tastatura.nextInt();
		
		
		f = 9*c/5 + 32;
		
		
		System.out.println( c + " " + " stepeni Celziusovi =         ");
		System.out.println( f + " " +  " stepeni Farenjahtovi =       ");

	}

}
