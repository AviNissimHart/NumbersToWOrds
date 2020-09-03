
public class Boom {
	public void Convert(int A) {
		
		Thousands(A);
		Hundreds(A);
		//System.out.println("and");
		Tens(A);
		Singles(A);
		
	}
	
	public void Thousands(int A) {
		int T = A/1000;
		
		switch(T) {
		case 1: System.out.println("One Thousand");break;
		case 2: System.out.println("Two Thousand");break;
		case 3: System.out.println("Three Thousand");break;
		case 4: System.out.println("Four Thousand");break;
		case 5: System.out.println("Five Thousand");break;
		case 6: System.out.println("Six Thousand");break;
		case 7: System.out.println("Seven Thousand");break;
		case 8: System.out.println("Eight Thousand");break;
		case 9: System.out.println("Nine Thousand");break;
		//default: break;
		
		}
	}
	public void Hundreds(int A) {
		int H = (A%1000)/100;
		switch(H) {
		case 1: System.out.println("One Hundred");break;
		case 2: System.out.println("Two Hundred");break;
		case 3: System.out.println("Three Hundred");break;
		case 4: System.out.println("Four Hundred");break;
		case 5: System.out.println("Five Hundred");break;
		case 6: System.out.println("Six Hundred");break;
		case 7: System.out.println("Seven Hundred");break;
		case 8: System.out.println("Eight Hundred");break;
		case 9: System.out.println("Nine Hundred");break;
		//default: break;
	}
}
	public void Tens(int A) {
		int Ten = (A%100)/10;
		switch(Ten) {
		case 1: System.out.println("Onety");break; //potentially nest another case select here??
		case 2: System.out.println("Twenty");break;
		case 3: System.out.println("Thirty");break;
		case 4: System.out.println("Fourty");break;
		case 5: System.out.println("Fifty");break;
		case 6: System.out.println("Sixty");break;
		case 7: System.out.println("Seventy");break;
		case 8: System.out.println("Eighty");break;
		case 9: System.out.println("Ninety");break;
		//default: break;
	}
}
	public void Singles(int A) {
		int S = A%10;
		switch(S) {
		case 1: System.out.println("One");break;
		case 2: System.out.println("Two");break;
		case 3: System.out.println("Three");break;
		case 4: System.out.println("Four");break;
		case 5: System.out.println("Five");break;
		case 6: System.out.println("Six");break;
		case 7: System.out.println("Seven");break;
		case 8: System.out.println("Eight");break;
		case 9: System.out.println("Nine");break;
	}
}
	
}


// will need to work out length of int??
// will need to work out positioning of each int and have a separate string for each??