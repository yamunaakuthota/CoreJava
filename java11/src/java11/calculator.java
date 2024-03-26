package java11;
                      
public class calculator {
	
	int x=10, y=5;
	
	public void addition(){
		System.out.println(x+y);
	}

	public void subtraction(){
		System.out.println(x-y);
	}
	
	public void multiplication(){
		System.out.println(x*y);
	}
	
	public void division(){
		System.out.println(x/y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		calculator Calculation = new calculator();
		
		Calculation.addition();
		Calculation.subtraction();
		Calculation.multiplication();
		Calculation.division();
		
	}

}
