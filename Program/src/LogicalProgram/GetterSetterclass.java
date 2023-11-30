package LogicalProgram;

public class GetterSetterclass {
	
	private int rollNumber;
	private String studentname;
	private int marks;
	private int roll;
	
	private String name;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public Object setRollNumber(int rollNumber) {
		return this.rollNumber = rollNumber;
	}
	public String getStudentname() {
		return studentname;
	}
	public String setStudentname(String studentname) {
		return this.studentname = studentname;
	}
	public int getMarks() {
		return marks;
	}
	public Object setMarks(int marks) {
		return this.marks = marks;
	}
	GetterSetterclass(){
		
	}
	
	GetterSetterclass(String name,int roll){
		 this.name=name;
		 this.roll=roll;
	}
	

}
