import java.util.Scanner;
public class IntheTriangle {

	public static void main(String[] args) {
		double x, y;
		System.out.print("Enter a point's x- and y-coordinates: ");
		
		Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
        
        if(x<(200-2*y) && x>0 && y>0)
            System.out.println("The point is in the triangle");
        else
        	System.out.println("The point is not in the triangle");
        
        input.close();
	}

}
