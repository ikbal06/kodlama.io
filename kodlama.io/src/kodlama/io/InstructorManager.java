package kodlama.io;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println("eðitmen  eklendi " + user.getFirstName() + user.getLastName());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("eðitmen silindi ");
	}
	
	@Override
	public void update(User user) {
		System.out.println("eðitmen güncellendi ");
	}
	
	public void allCourses(User[] users) {
		for(User user : users) {
		System.out.println(user.firstName +" "+user.lastName);
	 }
  }
}
