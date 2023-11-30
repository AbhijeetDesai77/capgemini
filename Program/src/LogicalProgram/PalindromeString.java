package LogicalProgram;

public class PalindromeString {
	
	public static void main(String[] args) {
		String str="madam";
		char[] ch = str.toCharArray();
		
		for(int i=0;i<str.length()-1;i++) {
			for(int j=str.length()-1;j>0;j--) {
				if(ch[i]==ch[j]) {
					System.out.println("String is pallindrom := "+str);
				}
				else {
					System.out.println("String is not pallindrome :="+str);
				}
			}
			
		}
	}

}
