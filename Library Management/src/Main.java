public class Main {
	
	public static void main(String[] args) {
	
		
		LibraryItem book = new Book("Welcom to the World",99,"Ashok");
		StudentMember student = new StudentMember(99,"Feroz");
		FacultyMember faculty = new FacultyMember(999,"Suleman");
		 
		book.displayInfo();										                     //Book details
		student.borrowItem(book);		      				                         //Borrowing book
		System.out.print("Borrowed Items : ");
		student.getBorrowedItems().get(0).displayInfo();                              //Getting information about borrowed items
		student.returnItem(new Book("World famous Love",456,"Lokesh"));               // Book not borrowed
		
		student.returnItem(book);                                                     //Returning the book
		
		System.out.println("The Student name :"+student.getName());					  //Getting the type of Library Member
		System.out.println("The Faculty name :"+faculty.getName());					  //Getting the type of Library Member
		
		
	}
}