package LogicalProgram;

public class ReverseStringf {
	public static void main(String[] args) {
		String str="my name is abhijeet";
		
		String[] words = str.split(" ");
		String Actulrev=" ";
		String capital="";
		
		String rev="";
		
		for(String word:words) {
			
			capital = word.substring(0,1).toUpperCase()+word.substring(1);
			
			System.out.print(capital+" ");
			


		}
		
		for(int i=capital.length()-1;i>=0;i--) {
			rev=rev+" ";
			System.out.println(rev);
			
		}
	
		
			
		}
		
		
	}


