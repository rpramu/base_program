package demo;

import java.util.HashMap;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'a','b','c','d','a','b','c'};
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c1 : c) {
			map.put(c1, map.getOrDefault(c1, 0)+1);
		}
		
		for(char cc : map.keySet()) {
			System.out.println(cc + " -"+ map.get(cc));
		}
		System.out.println("hjdd");
	}

}
