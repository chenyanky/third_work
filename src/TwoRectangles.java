import java.util.Scanner;
public class TwoRectangles {

	public static void main(String[] args) {
		double x1, x2, y1, y2, w1, w2, h1, h2;
        System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
        Scanner input = new Scanner(System.in);
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        w1 = input.nextDouble();
        h1 = input.nextDouble();
        
        System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        w2 = input.nextDouble();
        h2 = input.nextDouble();
        
        double xDistance = x1-x2 >= 0 ? x1-x2 : x2-x1;
        double yDistance = y1-y2 >= 0 ? y1-y2 : y2-y1;
        
        if(xDistance <= (w1 - w2)/2 && yDistance <= (h1 - h2)/2)
        	System.out.println("r2 is inside r1");
        else if(xDistance <= (w1+w2)/2 && yDistance <= (h1+h2)/2)
        	System.out.println("r2 overlaps r1");
        else
        	System.out.println("r2 does not overlap r1");
        
        input.close();
	}

}
