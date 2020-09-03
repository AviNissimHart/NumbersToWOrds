
public class Alpha {
	public String day(int a) {
		String d=" ";
		if(a==1) {
			d="monday";
		}
		if(a==2) {
			d="tuesday";
		}
		if (a==3) {
			d="wednesday";
		}
		return d;
	}
	
	public void CheckSwitch() {
		int T=1;
		switch(T) {
		case 1: System.out.println("A");break;
		case 2: System.out.println("B");break;
		case 3: System.out.println("C");break;
		case 4: System.out.println("D");break;
		case 5: System.out.println("E");break;
		}
	}
	public void CheckSwitch2(int regno) {
		switch(regno) {
		case 10: 
		case 20: 
		case 31: 
		case 42: 
		case 52: System.out.println("You are going to IBM"); break;
		case 11: 
		case 12: 
		case 13: 
		case 14: 
		case 15: System.out.println("You are going to Microsoft"); break;
		default: System.out.println("You are going nowhere");
		}
	}

}
