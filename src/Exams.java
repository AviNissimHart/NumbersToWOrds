
public class Exams {
	private int phy, che, mat;
	private float total, per;
	
	public void Physics(int a) {
		if (a>= 0 && a<=150) {
			phy=a;
		} else {
			System.out.println(a+" Invalid Physics marks");
		}
	}
	public void Chemistry(int a) {
		if (a>= 0 && a<=150) {
			che=a;
		} else {
			System.out.println(a+" Invalid Chemistry marks");
		}
	}
	public void Maths(int a) {
		if (a>= 0 && a<=150) {
			mat=a;
		} else {
			System.out.println(a+" Invalid Maths marks");
		}
	}
	private void calculations() {
		total=phy+che+mat;
		per=total*100/450;
	}
	
	private String Grades(float per) {
		String Grade = "";
		if (per>= 90) {
			Grade = "A";
		} else {
			if(per>=80) {
				Grade="B";
			} else { 
				if (per>=70 ) {
					Grade = "C";
				} else {
					if (per>=60) {
						Grade = "D";
					} else {
						Grade = "Fail";
					}
				}
			}
		}
		return Grade;
	}
	
	public void showResults() {
		calculations();
		System.out.println("Total Marks: " + total);
		System.out.println("Percentage: " + per);
		//System.out.println("Grade is: "+ Grade);
		
	}
}
