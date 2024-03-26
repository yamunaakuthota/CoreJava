package java11;

public class Operators {

	int a=10;
	
	public void elseifstatment() {
		
		if(a%5==0 && a%3==0) {
			System.out.println("53");
		} 
		else if(a%5==0 && a%3!=0){
			System.out.println("5");
		}
		else if(a%5!=0 && a%3==0){
			System.out.println("3");
		}
		
	}
	
	public static void main(String[] args) {
		
	Operators conditionalOperators = new Operators();
	
	conditionalOperators.elseifstatment();
		
	}
}
