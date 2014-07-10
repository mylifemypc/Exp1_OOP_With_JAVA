package Example1;

public class Class2 extends Class1{
	private int point;

	public Class2(String studentName,int studentNumber,int point) {
		super(studentName,studentNumber);
		this.point=point;
	}
	public String toString(){
		return String.format("%s\t\tPoint  : %d",super.toString(),point );
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String getStudentName() {
		// TODO Auto-generated method stub
		return super.getStudentName();
	}
	@Override
	public int getStudentNumber() {
		// TODO Auto-generated method stub
		return super.getStudentNumber();
	}

}
