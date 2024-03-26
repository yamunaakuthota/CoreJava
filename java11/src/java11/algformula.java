package java11;

public class algformula {

	public int mul1(int a) {
		
		return a*a;
		
	}
	
     
     public int mul2(int a, int b) {
    	 
    	 return 2*a*b;
     }
     
	public static void main(String args[]) {
		
		algformula algorithamformula= new algformula();
		
		int a=algorithamformula.mul1(5);
		int b=algorithamformula.mul1(9);
		
		int output=algorithamformula.mul2(4, 7);
		
		int finaloutput=a+b+output;
		
		System.out.println(finaloutput);
	}
}
