Exp1_OOP_With_JAVA
==================

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
//Class2
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
		return super.getStudentName();
	}
	@Override
	public int getStudentNumber() {
		return super.getStudentNumber();
	}

}

//Inheritance
import java.util.*;

public class Inheritance {		
	public static void main(String[] args) {
		Class1 s1= new Class1("Sultan",2);
		Class1 s2 =new Class1("Meltem",8);
		
		if(s1.equals(s2))
			System.out.println("Equals..");
		else
			System.out.println("Not Equals");
		System.out.println("###");
		Class2 s3 =new Class2("Melike",47,90);
		Class2 s4= new Class2("Ayben",15,100);
		Class2 s5= new Class2("Nazmiye",20,85);
		
		ArrayList<Class1>students = new ArrayList<Class1>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		for(int i=0;i<students.size();i++){
			students.get(i);
		}
		 Iterator<Class1> itr=students.iterator();
			while(itr.hasNext()){
				Class1 student =(Class1)itr.next();
				if(student instanceof Class1 || student instanceof Class2)
				System.out.println("Name :"+student.getStudentName());			
			}
	}

}
