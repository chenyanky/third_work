import java.util.Scanner;
public class IntheCircle {

	public static void main(String[] args) {
		double x, y, d;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		x = input.nextDouble();
		y = input.nextDouble();
    
		d = Math.pow(Math.pow(x, 2)+Math.pow(y, 2),0.5);
		
		if(d>10)
			System.out.println("Point "+ "(" + x + "," + y + ")" 
					+ " is not in the circle");
		else
			System.out.println("Point "+ "(" + x + "," + y + ")"
					+ " is in the circle");
		
		input.close();
	}

}
