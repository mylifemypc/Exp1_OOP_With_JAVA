package Example1;

public class Class1 {
	private String studentName;
	private int studentNumber;

	public Class1(String studentName,int studentNumber) {
		this.studentName=studentName;
		this.studentNumber=studentNumber;
	}

	@Override
	public String toString() {
		return String.format("Name :%s\tNumber: %d",studentName,studentNumber );
	}
	public boolean equals(Object obj){
		if(studentName==((Class1)obj).studentName && studentNumber ==((Class1)obj).studentNumber)
			return true;
		else
			return false;		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

}
