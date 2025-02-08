package program;

public class expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "(a+b)+(c)";
		if(isValidexp(exp)) {
			System.out.println("it's vaild");
		}else {
			System.out.println("not vaild");
		}
	}
	
	public static boolean isValidexp(String exp) {
		int balance = 0;
		
		for(char c : exp.toCharArray()) {
			if(c == '(') {
				balance++;
			}else if(c == ')') {
				balance--;
				if(balance < 0) {
					return false;
				}
			}
		}
		return balance == 0;
	}

}
