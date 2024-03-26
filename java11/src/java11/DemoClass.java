package java11;

public class DemoClass {
	
	byte bytevar =10;
	
	int intvar=299;
	
	long longvar=167321;
	
	float floatvar = 1111.123456789f;
	
	double doublevar = 1111.34565787678678789879;
	
	char charvar='y';
	
	boolean boolvar = true;
	
	String name= "yamuna";
	
	public void methodname(){
		
		System.out.print(bytevar+"\n");
		System.out.print(intvar+"\n");
		System.out.print(longvar+"\n");
		System.out.print(floatvar+"\n");
		System.out.print(doublevar+"\n");
		System.out.print(charvar+"\n");
		System.out.print(boolvar+"\n");
		System.out.print(name+"\n");
	}
	
	
	public static void main(String[] args) {
		
		
		
		DemoClass dataType = new DemoClass();
		
		System.out.print(dataType.bytevar+"\n");
		System.out.print(dataType.intvar+"\n");
		System.out.print(dataType.longvar+"\n");
		System.out.print(dataType.floatvar+"\n");
		System.out.print(dataType.doublevar+"\n");
		System.out.print(dataType.charvar+"\n");
		System.out.print(dataType.boolvar+"\n");
		System.out.print(dataType.name+"\n");
		System.out.print("==================================="+"\n");
		dataType.methodname();
		
		
		
	}

}
