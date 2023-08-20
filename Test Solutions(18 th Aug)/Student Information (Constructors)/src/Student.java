import java.util.*;
public class Student {
	private String name;
	private int age;
	private int studentId;
	private static int studentId1=0;
	
	public Student() {
		this("Unknown",0);
	}
	public Student(String name,int age) {
		this(name,age,studentId1);
		studentId1++;
	}
	public Student(String name,int age,int studentId) {
		this.name=name;
		this.age=age;
		this.studentId=studentId;
	}
	
	public void show() {
		System.out.println("Student Name :" +name);
		System.out.println("Student Age :" +age);
		System.out.println("Student ID :" +studentId);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student std=new Student();
		System.out.println("Student Name :");
		String name=sc.nextLine();
		System.out.println("Student Age :");
		int age=sc.nextInt();
		Student std1=new Student(name,age);
		std.show();
		std1.show();
		
		
	}
	

}
