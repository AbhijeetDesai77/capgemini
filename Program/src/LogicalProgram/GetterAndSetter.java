package LogicalProgram;

public class GetterAndSetter {
	
	private int rollNumber=10;
	
	public void display() {
	System.out.println(this.rollNumber);
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public static void main(String[]args) {
		GetterAndSetter gs=new GetterAndSetter();
		gs.setRollNumber(20);
		gs.display();
	}

}
