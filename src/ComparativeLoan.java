import java.util.Scanner;
public class ComparativeLoan {

	public static void main(String[] args) {
		int loanYears;
		double loanAmount;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		loanYears = input.nextInt();

		System.out.printf("%s%20s%20s\n", "Interest Rate","Monthly Payment",
				"Total Payment");
		for(double i=5; i<=8; i+=1.0/8) {
			double interestRate=i/100;
			double monthlyPayment=loanAmount*(interestRate/12)/
					(1-1/Math.pow(1+(interestRate/12), loanYears*12));
			double totalPayment=monthlyPayment*loanYears*12;
			System.out.printf("%.3f%%%18.2f%24.2f\n",i,monthlyPayment,totalPayment);
		}
		input.close();
	}
}
