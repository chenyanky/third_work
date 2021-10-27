import java.util.Scanner;

public class CalculatePerimeter {

	public static void main(String[] args) {
		double a,b,c,perimeter=0;
		
		System.out.print("Enter the first egde of the triangle: ");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		
		System.out.print("Enter the second egde of the triangle: ");
		b = input.nextDouble();
		
		System.out.print("Enter the third egde of the triangle: ");
		c = input.nextDouble();
		
		if(a+b>c && a+c>b && b+c>a) {
			perimeter = a+b+c;
			System.out.println("The perimeter of the triangle is "+perimeter);
		} 
		else
			System.out.println("The input is invalid");
		
		input.close();
	}

}
