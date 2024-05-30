package automation22;

public class Prime {

	public static  void countPrime(int n) {
		int m=n;
		int f=0;
		int count=0;
		
		for(int i=2;i<=m;i++) {
			f=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					f=1;
				}
			}
			if(f==0) {
				System.out.println(i);
				count++;
				
			}
			
		
		}
		System.out.println("No. of Prime " +count);
		

	}
	public static void main(String[]args) {
		countPrime(33);
		
		
		
	}

}
