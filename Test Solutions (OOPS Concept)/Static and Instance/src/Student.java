
public class Student {
	private int studentID;
	private String name;
	static int totalstudent = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getTotalstudent() {
		return totalstudent;
	}
	public static void setTotalstudent(int totalstudent) {
		Student.totalstudent = totalstudent;
	}
	public void enroll(String name) {
		System.out.println("Enter Student Name to Enroll :" +name);
		totalstudent ++;
	}
	public void drop(String name) {
		System.out.println("Enter Student Name to drop :" + name);
		totalstudent --;
	}
	public static int returntotal() {
		return totalstudent;
	}
	public static void main(String[] args) {
		Student number = new Student();
		number.enroll("Feroz");
		number.enroll("Ashok");
		number.enroll("Sagar");
		number.enroll("Raju");
		number.enroll("Midhelish");
		number.enroll("Suleman");
		System.out.println("Total Number of students added :" + number.returntotal());
		number.drop("Sagar");
		number.drop("Raju");
		System.out.println("Total Number of students Remaining :" + number.returntotal());
		
	}

}
