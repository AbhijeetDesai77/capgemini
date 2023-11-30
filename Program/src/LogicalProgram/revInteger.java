package LogicalProgram;

public class revInteger {
	
	
	
	public static void main(String[] args) {
	int a=1234;
	
	int rev=0;
	
	while(a>0) {
		int lastdigit=a%10;
		
		rev=rev*10+lastdigit;
		
		a=a/10;
	}
	
	System.out.println(rev);

	}


}
