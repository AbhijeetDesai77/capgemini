package LogicalProgram;

import java.util.ArrayList;
import java.util.List;

public class StringCountFromArray {

	public static void main(String[] args) {
		
		List<Object> lists =List.of("abhijeet","rani","aru",1,true);
		
		int stringcount=0;
		
		int integercount=0;
		int booleancount=0;
		
		
		for(Object list:lists) {
			
			if(list instanceof String) {
				
				stringcount++;
			}
			else if(list instanceof Integer) {
				integercount++;
			}
			else if(list instanceof Boolean) {
				booleancount++;
			}
		}
		System.out.println("String count:= "+stringcount);
		System.out.println("Integer count:= "+integercount);
		System.out.println("Boolean count:= "+booleancount);
		
	}
}
