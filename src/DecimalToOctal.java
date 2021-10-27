import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个十进制整数： ");
		
        int decimal = input.nextInt();
        int remainder = 0, octal = 0;
        for(int i=1; decimal>0; i*=10) {
        	remainder = decimal%8;
        	decimal /= 8;
        	octal += remainder*i;
        }
        System.out.println("它的八进制数为： "+octal);
        input.close();
	}

}
