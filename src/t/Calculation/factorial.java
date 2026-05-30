package t.Calculation;

public class factorial {
public static void main(String[] args) {
		
		
		
		int[] num = {5,0,7};
		int fact;
		
		for (int f : num) {
			fact = 1;
			
			for (int i = 1; i <= f; i++) {
				fact = fact * i;
			}
			System.out.println("factorial of "+f+" is "+fact);
			}
		
		
		}
	

}
