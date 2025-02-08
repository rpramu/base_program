package demo;

import java.util.HashMap;

public class simple_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "level";
		String s1 = "levels";
		
		if(s.length()<s1.length()) {
			System.out.println("it's not vaild");
		}
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i =0 ;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				int op  = map.get(s.charAt(i));
				op = op + 1;
				map.put(s.charAt(i), op);
			}
			else {
				map.put(s.charAt(i),1);
			}
		}
		//System.out.println(map);
		HashMap<Character, Integer> map1 = new HashMap<>();
		
		for(int i =0 ;i<s1.length();i++) {
			if(map1.containsKey(s1.charAt(i))) {
				int op  = map1.get(s1.charAt(i));
				op = op + 1;
				map1.put(s1.charAt(i), op);
			}
			else {
				map1.put(s1.charAt(i),1);
			}
		}
		//System.out.println(map1);
		
		int count = 0;
		int exp = map1.size();
		
		for(Character c : map1.keySet()) {
			if(map.containsKey(c)) {
				if(map.get(c) == map1.get(c)) {
					count++;
					
				}
				
			}
		}
		System.out.println(count + " " + exp);
		if(count == exp) {
			System.out.println("it's Vaild");
		}
		else {
			System.out.println("not vaild");
		}	

	}

}
