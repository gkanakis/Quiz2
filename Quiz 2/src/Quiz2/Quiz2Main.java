package Quiz2;

import java.util.Scanner; 

public class Quiz2Main {
	static Scanner inputs = new Scanner(System.in);
	
	public static void main(String[ ], args) {
		System.out.println("Enter the cost of your tuition: ");
		double tuitioncost = inputs.nextDouble( );
		System.out.println("Enter the percentage of increase of your tuition: ");
		double percentin = inputs.nextDouble( ); 
		System.out.println("Enter your APR in decimal form: ");
		double apr = inputs.nextDouble( );
		Systme.out.println("Enter years of payment: ");
		double term = inputs.nextDouble( );
		Quiz2 newbill = new TuitionBill(tuitioncost, percentin, apr, term);
		System.out.println("Your full tuition payment is" + newbill.fulltuition());
	}
}
