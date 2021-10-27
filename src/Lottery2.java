import java.util.Scanner;
public class Lottery2 {

	public static void main(String[] args) {
		int lottery = (int)(Math.random()*100);
		
		Scanner input = new Scanner(System.in);
		
		while (lottery % 10 == lottery / 10) {
            lottery = (int) (Math.random() * 100);
        }
		System.out.print("Please enter your guess: ");
		
        int guess = input.nextInt();
        System.out.println("The lottery number is "+lottery);
        
        int lottery1;
        int lottery2;
        int guess1;
        int guess2;
        if (lottery < 10) {
            lottery1 = lottery;
            lottery2 = 0;
        } else {
            lottery1 = lottery % 10;
            lottery2 = lottery / 10;
        }
        if (guess < 10) {
            guess1 = guess;
            guess2 = 0;
        } else {
            guess1 = guess % 10;
            guess2 = guess / 10;
        }

        int money; 
        if (lottery1 == guess1 && lottery2 == guess2) {
            money = 10000;
        } else if ((lottery1 == guess1 || lottery1 == guess2) && (lottery2 == guess1 || lottery2 == guess2)) {
            money = 3000;
        } else if (lottery1 == guess1 || lottery1 == guess2 || lottery2 == guess1 || lottery2 == guess2) {
            money = 1000;
        } else {
            money = 0;
        }
        System.out.println("you win: $" + money);
        input.close();
	}

}
