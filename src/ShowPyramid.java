import java.util.Scanner;
public class ShowPyramid {

	public static void main(String[] args) {
	    System.out.print("Enter the number of lines: ");
	    Scanner input = new Scanner(System.in);
	    int number = input.nextInt();
	    if(number<10) {
	    	for(int i=0;i<number;i++) {
	        	for(int j=0;j<i+number;j++) {
	        		if(j<number) {
	        			if(i>=number-1-j)
	        				System.out.print(number-j+" ");
	        			else
	        				System.out.print("  ");
	        		}
	        		else 
	        			System.out.print(j+2-number+" ");
	        			
	        	}
	        	System.out.println();
	        }
	    }
	    else if(number<16) {
	    	for(int i=0;i<number;i++) {
	        	for(int j=0;j<i+number;j++) {
	        		if(j<number) {
	        			if(i>=number-1-j) {
	        				if(number-j<10)
	        				    System.out.print(number-j+"  ");
	        				else
	        					System.out.print(number-j+" ");
	        			}
	        			else
	        				System.out.print("   ");
	        		}
	        		else {
	        			if(j+2-number<10)
	        				System.out.print(j+2-number+"  ");
	        			else
	        				System.out.print(j+2-number+" ");
	        		}
	        	}
	        	System.out.println();
	        }
	    }
        input.close();
	}

}
