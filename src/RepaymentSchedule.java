import java.util.Scanner;
public class RepaymentSchedule {

	public static void main(String[] args) {
		int Year;
		double loanAmount, rate, monthlyPayment, totalPayment, monthlyRate, balance;
		
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        loanAmount = input.nextDouble();
        
        System.out.print("Number of Years: ");
        Year = input.nextInt();
        
        System.out.print("Annual Interest Rate: ");
        rate = input.nextDouble();
        
        monthlyPayment = loanAmount * (rate / 1200) / (1-1/Math.pow(1+(rate/1200), Year * 12));
        totalPayment = monthlyPayment * Year *12;
        balance = loanAmount;
        monthlyRate = rate / 1200;
        
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n\n",totalPayment);
        
        System.out.printf("Payment#\tInterest\tPrincipal\tBalance\n");
        for(int i=1; i<=Year*12; i++) {
        	double interest = monthlyRate * balance;
        	double principal = monthlyPayment - interest;
        	balance = balance - principal;
        	System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, balance);
        }
        input.close();
	}

}
