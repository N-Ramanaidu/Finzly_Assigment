import java.util.*;
public class Main {
	public static void main(String[] args) {
		Manger mg = new Manger();
		Developer dv = new Developer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Name ");
		String Name = sc.next();
		System.out.println("ID ");
		int ID = sc.nextInt();
		System.out.println("Department ");
		String department  = sc.next();
		mg.show(Name, ID, department);
		System.out.println();
		System.out.println("Name ");
		String Name1 = sc.next();
		System.out.println("ID ");
		int ID1 = sc.nextInt();
		System.out.println("ProgrammingLanguage ");
		String ProgrammingLanguage = sc.next();
		dv.show(Name1,ID1,ProgrammingLanguage );
		
		

	}

}
