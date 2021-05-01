package kodlama.io;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println("e�itmen  eklendi " + user.getFirstName() + user.getLastName());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("e�itmen silindi ");
	}
	
	@Override
	public void update(User user) {
		System.out.println("e�itmen g�ncellendi ");
	}
	
	public void allCourses(User[] users) {
		for(User user : users) {
		System.out.println(user.firstName +" "+user.lastName);
	 }
  }
}
