package LogicalProgram;

public class dublicateNumbersfromArray {
	
	public static void main(String []args) {
		
		int ar[]= {1,2,3,4,5,5,4,3};
		boolean isduplicate=false;
		
		for(int i=0;i<=ar.length-1;i++) {
			
			for(int j=ar.length-1;j>=0;j--) {
				
				if( i!=j && ar[i]==ar[j]) {
					isduplicate=true;
					break;
				}
				
			}
			
			if(isduplicate) {
				System.out.println("Duplicate number is :="+ar[i]);
			}
			else {
				System.out.println("unique Number are :="+ar[i]);
			}
			
		}
		
	
	}

}
