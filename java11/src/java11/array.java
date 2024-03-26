package java11;

public class array {

	int [] marks= {5,10,15,20};
	int sum=0;
	double sum1;
	
	public void sumofnumber() {
		
		for(int x=0; x<marks.length; x++) {
			
			sum= sum+marks[x];
		
		}
		
		System.out.println("sum aquried by 4 students: "+sum);
	}
	
	public void percentage(){
		sum1=(sum*100)/400;
		System.out.println("percentage aquried by 4 students: "+sum1);
	}
	
	public static void main(String args[]) {
		
		array Array= new array();
		
		Array.sumofnumber();
		Array.percentage();
	}
}
