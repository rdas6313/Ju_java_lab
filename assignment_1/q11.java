import java.util.Scanner;
class Instructor{
	private String name;
	private String phone_no;

	public Instructor(String nm,String ph){
		name = nm;
		phone_no = ph;
	}

	public void display(){
		System.out.println("Instructor name: "+ name);
		System.out.println("Instructor phone no :" + phone_no);
	}
}

class TextBook{
	private String title;
	private String author;
	private String publisher;

	public TextBook(String t,String a,String pub){
		title = t;
		author = a;
		publisher = pub;
	}

	public void display(){
		System.out.println("TextBook name: "+ title);
		System.out.println("Textbook author name :" + author);
		System.out.println("Textbook publisher name :" + publisher);
	}


}

class Course{
	private String name;
	private Instructor instructor;
	private TextBook textbook;

	public Course(String n,Instructor in,TextBook t){
		name = n;
		instructor = in;
		textbook = t;
	}

	public void display(){
		System.out.println("Course name: "+ name);
		System.out.println("---------------------");
		instructor.display();
		System.out.println("---------------------");
		textbook.display();
	}
}

class q11{
	public static void main(String[] args) {
		Instructor in = new Instructor("Prof Anshul kumar","1234");
		TextBook text = new TextBook("Computer organization","Willium stallings","Unknown");
		Course course = new Course("Introduction to computer architecture",in,text);
		course.display();
	}
}