package kodlama.io;

public class Instructor extends User{

	String allCourses;
	
	public Instructor() {
		
	}

	public Instructor(String allCourses) {
		super();
		this.allCourses = allCourses;
	}

	public String getAllCourses() {
		return allCourses;
	}

	public void setAllCourses(String allCourses) {
		this.allCourses = allCourses;
	}
}
