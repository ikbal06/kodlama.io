package kodlama.io;

public class Student extends User{

	String[] myCourses;
	int percent;

	public Student() {
		
	}
	
	public Student(String[] myCourses, int percent) {
		super();
		this.myCourses = myCourses;
		this.percent = percent;
	}

	public String[] getMyCourses() {
		return myCourses;
	}

	public void setMyCourses(String[] myCourses) {
		this.myCourses = myCourses;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

}
