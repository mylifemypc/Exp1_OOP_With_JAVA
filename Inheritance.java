package Example1;
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
