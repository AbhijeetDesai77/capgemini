package LogicalProgram;

public class maxnumberFromarray {

	public int maxnumber() {
		int ar[]= {1,2,3,4,5,6,10};
		int max=0;
		
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]>max) {
				max=ar[i];
				
			}
			
		}
		return max;
	}
	public static void main(String[]args) {
		maxnumberFromarray maxnumbers=new maxnumberFromarray();
		int number = maxnumbers.maxnumber();
		System.out.println("Max number from Array is:="+number);
	}
}
