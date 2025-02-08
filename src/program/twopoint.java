package program;

public class twopoint {
	
	public static void main(String[] args) {
		int[] array = new int[] {2,11,15,7};
		int target = 9;
		
		twopoint b = new twopoint();
		
		int[] result = b.twoSum(array, target);
		
		System.out.println(result[0] + ","+ result[1]);
		
	}
	
	public int[] twoSum(int[] array, int target) {
		
		int left = 0;
		int rigth = array.length-1;
		
		while(left < rigth) {
			int sum = array[left] + array[rigth];
			
			if(sum == target) {
				return new int[] {left+1 , rigth+1};
			}
			else if(sum < target) {
				left++;
			}
			else {
				rigth--;
			}
		}
		
		return new int[] {};
	}

}
