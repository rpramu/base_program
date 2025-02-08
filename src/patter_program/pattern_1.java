package patter_program;

public class pattern_1 {
	
	public static void main(String[] args) {
		int row = 4;
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		/* 
				* 
				** 
				*** 
				**** 
				***** 
		 */
		
		System.out.println("==============================");
		
		for(int i=0;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		/* 
				***** 
				**** 
				*** 
				** 
				* 
		*/
		
		System.out.println("==============================");
		
		for(int i=0;i<=row;i++) {
			for(int j=row;j>=0;j--) {
				if(j>i) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
		/*
			    * 
			   ** 
			  *** 
			 **** 
			*****
		*/
		System.out.println("==============================");
		
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=row;j++) {
				if(j<i) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
		
		/*
		    ***** 
			 **** 
			  *** 
			   ** 
			    * 
	    */
		
		System.out.println("==============================");
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=(row-i);j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
System.out.println("==============================");
		
		for(int i=row;i>=0;i--) {
			for(int j=1;j<=(row-i);j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("==============================");
		
		for(int i =1;i<=row;i++) {
			for(int j =1;j<=(row-i);j++) {
				System.out.print(" ");
			}
			for(int k =1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i= row-1;i>=0;i--){
			for(int j=1;j<=(row-i);j++) {
				System.out.print(" ");
			}
			for(int k =1; k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
