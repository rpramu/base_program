package program;

public class sliding_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[] {1,1,3,4,5,6,7,8,4};
		
		int k =4;
		int len = array.length;
		
		System.out.println(slidinfWindow(array, k, len));
	}
	
	public static int slidinfWindow(int[] array,int k,int len) {
		
//		int max_value = Integer.MIN_VALUE;
//		
//		for(int i=0;i<len-k-1;i++) {
//			int sum =0;
//			for(int j=0;j<k;j++) {
//				sum =sum + array[i+j];
//				max_value = Math.max(max_value, sum);
//			}
//		}
		
		//it's other method  to write a program in Sliding_window
		
		int sum =0;
		for(int i =0 ; i<k;i++) {
			sum =sum + array[i];
		}
		
		int window_sum = sum;
		for(int i =k ;i<len;i++) {
			int a =array[i] - array[i-k];
			window_sum  = window_sum + a;
			sum = Math.max(window_sum, sum);
		}
		
		return sum;
	}

}
