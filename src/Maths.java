
public class Maths {
	public void allEvens() {
		int a=1;
		for(;a<=10;a++) {
			if (a%2==0) {
				System.out.println(a);
			}
		}
	}
	public void oddEven() {
		int a=1;
		for(;a<=10;a++) {
			if (a%2==0) {
				System.out.println(a + " is even");
			} else {
				System.out.println(a + " is odd");
			}
		}
	}

}
