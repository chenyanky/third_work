
public class CalculateTuition {

	public static void main(String[] args) {
		double tuition = 10000;
		double total = 0;
		for(int i=0;i<10;i++) {
			tuition=tuition*1.05;
		}
		double tuition10=tuition;
		System.out.print("The tuition fee in ten years is $");
		System.out.println(String.format("%.2f", tuition10));
		for(int i=0;i<4;i++) {
			tuition=tuition*1.05;
			total += tuition;		
		}
		System.out.println("Ten years from now, the total tuition "
				+ "fee in four years is $" );
		System.out.println(String.format("%.2f",total));
	}

}
