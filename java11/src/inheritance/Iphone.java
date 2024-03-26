package inheritance;

public class Iphone extends phone{
	
	
	
	public void pixel() {
		
		System.out.println("megapixel");
		
		super.call();
	}
	
	
	
	public static void main(String args[]) {
		
		Iphone iPhones = new Iphone();
		
		//iPhones.call();
		iPhones.pixel();
	
		
	}
}

