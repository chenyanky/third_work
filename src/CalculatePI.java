
public class CalculatePI {

	public static void main(String[] args) {
		double number = 0;
		
		for(int i=1; i<=100000; i++) {
			number += Math.pow(-1, i+1) / (2*i-1);
			if(i%10000==0)
				System.out.println("The PI value for i = "+ i +" is "+ number*4);
		}

	}

}
