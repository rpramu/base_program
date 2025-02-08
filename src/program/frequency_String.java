package program;

import java.util.Scanner;

public class frequency_String {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		char c[] = s.toCharArray();
		
		int frq[] = new int[c.length];
		
		for(int i=0;i<c.length;i++) {
			frq[i]=1;
			
			for(int j=i+1;j<c.length;j++) {
				if(c[j]!='0' && c[i]==c[j]) {
					c[j]='0';
					frq[i]++;
				}
			}
		}
		//it's used to find the frequency in String 
		for(int j =0;j<c.length;j++) {
			if(c[j]!='0') {
			System.out.println(c[j]+"-"+frq[j]);
			}
		}
		
		//it's used to find the duplicated in string
		for(int j =0;j<c.length;j++) {
			if(c[j]!='0') {
			System.out.print(c[j]);
			}
		}
		
		
	}

}
