import java.util.Scanner;
public class CalculateAverage {

	public static void main(String[] args) {
		double n, total=0, totalSquares=0;
		double average, variance;
		System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        for(int i=1; i<=10; i++) {
        	n = input.nextDouble();
        	total += n;
        	totalSquares += n*n;
        }
        average = total / 10;
        variance = Math.sqrt((totalSquares - (total*total/10))/9);
        
        System.out.printf("The mean is %.2f\n",average);
        System.out.printf("The standard deviation is %.5f", variance);
        input.close();
	}

}
