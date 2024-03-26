package inheritance;

public class phone {

	public void call() {
		System.out.println("make calls");
	}
	
	public void camera() {
		System.out.println("we can take the pictures");
	}
	
	public static void main(String args[]) {
		
		phone Phones = new phone();
		
		Phones.call();
		Phones.camera();
	}
}
