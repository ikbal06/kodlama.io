package kodlama.io;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println("��renci eklendi " + user.getFirstName());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("��renci silindi ");
	}
	
	@Override
	public void update(User user) {
		System.out.println("��renci g�ncellendi ");
	}
	
	public void addCourse(String myCourses,int percent) {
		System.out.println(myCourses+" "+ percent);
	}
	
}
