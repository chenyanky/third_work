import java.util.Scanner;
public class IntheRectangle {

	public static void main(String[] args) {
		double x,y;
        System.out.print("Enter a point with two coordinates: ");
		
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
        
        x = Math.abs(x);
        y = Math.abs(y);
        
        if(x<5 && y<2.5)
        	System.out.println("Point "+"("+ x +","+ y +")"
        			+" is in the rectangle");
        else
        	System.out.println("Point "+"("+ x +","+ y +")"
        			+" is not in the rectangle");
        input.close();
	}

}
