package java11;

public class loop {

	public void descendingorder(){
	
	for(int i=4; i>=1; i--) {
		for(int j=1; i>=j; j++) {
			
			System.out.print(j);
		}
		
		System.out.println();
	}
}
	
	public static void main(String[] args) {
		
		loop loops=new loop();
		
		loops.descendingorder();
	}
}