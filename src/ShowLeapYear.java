
public class ShowLeapYear {

	public static void main(String[] args) {
		int count = 0;
		
        for(int year = 101; year<=2100; year++) {
        	if((year%4==0&&year%100!=0)||year%400==0) {
        		count++;
        		System.out.printf("%d ",year);
        		if(count % 10 == 0)
        			System.out.print("\n");
        	}
        }
        System.out.println("\nThe number of leap year "
        		+ "between 101 and 2100 are "+ count);
	}

}
