package automation22;

public class Armstrong {

	public static void main(String[] args) {
		int  n=121;
		int t1=n;
		int len=0;
		while(t1!=0) {
			t1=t1/10;
			len++;
			
		}
int t2=n;
int rem;
int arm=0;

while(t2!=0) {
	rem=t2/10;
	int mul=1;
	for(int i=1;i<len;i++) {
		mul=arm*rem;
	}
	arm=arm*mul;
		t2=t2/10;
	}
	if(n==arm) {
		System.out.println("No. is armstrong");
	}
	else {
		System.out.println("No. is not armstrong");
	}
}
	}


