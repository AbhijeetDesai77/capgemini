package LogicalProgram;

public class countfromstring {
	
	public static void main(String []args) {
		
		String str="functional Testing,nonfunctional testing,regression testing";
		
		str=str.toLowerCase();
		
		String[] words = str.split(" ");
		
		int testingcount=0;
		int functionalcount=0;
		
		for(String word:words) {
			
			if(word.contains("testing")) {
				testingcount++;
			}
			else if(word.contains("functional")) {
				functionalcount++;
			}
			
		}
		System.out.println("testing word count occenrence is:="+testingcount);
		System.out.println("functional word count occurence is:= "+functionalcount);
	}

}
