
public class PerfectNumber {

	public static void main(String[] args) {
		System.out.print("The perfect numbers are ");
		for(int n=1; n <= 10000; n++) {
			int total=0;
			for(int i=1; i<n; i++) {
				if(n%i==0)
					total+=i;
			}
			if(total==n)
				System.out.print(n+" ");
		}

	}

}
