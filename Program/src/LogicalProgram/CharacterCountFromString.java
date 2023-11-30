package LogicalProgram;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountFromString {
	
	public static void main(String[] args) {
		String str="abhijeet";
		
		char[] ch = str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				Integer count = map.get(c);
				map.put(c, count+1);
			}
		}
		System.out.println(map);
	}

}
