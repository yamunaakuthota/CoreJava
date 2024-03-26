package java11;

public class switchcase {

	String month="april";
	
	public void SwitchCase() {
		
		switch(month)
		{
		case "jan" : System.out.println("1st month");
		break;
		case "feb" : System.out.println("2nd month");
		break;
		case "march" : System.out.println("3rd month");
		break;
		case "april" : System.out.println("4th month");
		break;
		case "may" : System.out.println("5th month");
		break;
		case "june" : System.out.println("6th month");
		break;
		default : System.out.println("invalid");
		}
		
	}
	
	public static void main(String[] args) {
		
		switchcase mnth = new switchcase();
		
		mnth.SwitchCase();
	}
}

