package nestedFor.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfLetters {
	public static void main(String[] args) {
		
		String s= "Greeeeeennnnnssss";
		Map<Character, Integer> mp= new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mp.containsKey(c)) {
				Integer count = mp.get(c);
				mp.put(c, count+1);
				
			}else {
				mp.put(c, 1);
				
			}
			
		}
		System.out.println(mp);
	}
	

}
