
public class PrintPyramid {

	public static void main(String[] args) {
	    for(int i=0; i<8; i++) {
	    
	    	for(int j=0; j<i+8; j++) {
	    		if(j<8) {
	    			if(i==7 && j==0)
	    				System.out.print((int)(Math.pow(2, i+j-7)));
	    			else if(j==0)
	    				System.out.print(" ");
	    			else if(j>=7-i) {
		    				int a =(int)(Math.pow(2, i+j-7));
		    				if(a<10)
		    					System.out.print("   "+a);
		    				else if(a<100)
		    					System.out.print("  "+a);
		    				else
		    					System.out.print(" "+a);
		    		}
	    			else
	    				System.out.print("    ");
	    			
	    		}
	    		else {
	    			int b = (int)(Math.pow(2, 7-j+i));
	    			if(b<10)
	    				System.out.print("   "+b);
	    			else if(b<100)
	    				System.out.print("  "+b);
	    			else
	    				System.out.print(" "+b);
	    		}
	    	}
	    	System.out.println();
	    }

	}

}
