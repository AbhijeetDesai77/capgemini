package LogicalProgram;

import java.util.ArrayList;
import java.util.List;

public class ContCharacter {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[]args) {
		
		
		@SuppressWarnings("rawtypes")
		ArrayList list =new ArrayList();
		
		List abc=List.of("abcd",'c',1,true);
		
		list.add("abhijeet");
		list.add("aru");
		list.add("rani");
		list.add(1);
		list.add(true);
		
		List<Object>lists2= List.of("abhijeet","abhi",1);
		List<Object> listss = List.of("abhijeet", "abhi", 1, true);
		List <Object>list1=List.of("abhijeet",1,true);
		int Stringcount=0;
		int IntCount=0;
		int BoolCount=0;
		
		for(Object str:list) {
			
			if(str instanceof String) {
				Stringcount++;
			}
			else if(str instanceof Integer){
				IntCount++;
			}
			else if(str instanceof Boolean) {
				BoolCount++;
			}
			
		}
		System.out.println(Stringcount);
		System.out.println(IntCount);
		System.out.println(BoolCount);
	}
	


}
