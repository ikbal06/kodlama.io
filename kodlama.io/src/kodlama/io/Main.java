package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		String[] courses= {"c#","java"};
		
		Instructor Instructor1=new Instructor();
		Instructor1.id=1;
		Instructor1.firstName="Engin";
		Instructor1.lastName="Demiroğ";
		Instructor1.email="engin@gmail.com";
		Instructor1.password="123";
		Instructor1.allCourses="courses";
		
		Student student1=new Student();
		student1.id=1;
		student1.firstName="İkbal";
		student1.lastName="Kırklar";
		student1.email="ikbal@gamil.com";
		student1.password="123";
		student1.myCourses=courses;
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(Instructor1);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		
		
 }

}
