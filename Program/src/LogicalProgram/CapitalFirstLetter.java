package LogicalProgram;

public class CapitalFirstLetter {
	
	public static void main(String[] args) {
		
		String str="my name is abhijeet";
		
		String[] words = str.split(" ");
		
		for(String word:words) {
			String capital = word.substring(0,1).toUpperCase()+word.substring(1);
			System.out.print(capital+" ");
		}
		
	}

}
