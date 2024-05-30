package automation22;

public class FindGcd {

	public static void main(String[] args) {
		int a = 24;
		int b = 36;
		int gcd = 0;
		for(int i=1; i<=a && i<=b;i++) {
			if(a % i == 0 && b % i == 0)
				gcd=i;
		}
		System.out.println("GCD is " +gcd);
	}

}
