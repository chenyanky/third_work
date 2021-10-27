import java.util.Scanner;

public class DetectISBN {

	public static void main(String[] args) {
		int isbn, total=0, d;
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		isbn = input.nextInt();
		int isbn1 = isbn;
		for(int i=9; i>0; i--) {
			total += isbn % 10 * i;
			isbn = isbn / 10;
		}
		d = total % 11;
		if(d==10)
			System.out.println("The ISBN-10 number is "
		            +isbn1+"X");
		else
			System.out.println("The ISBN-10 number is "
					+isbn1+d);
		input.close();
	}

}
