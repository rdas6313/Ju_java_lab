class Student{
	private int roll;
	private String name;
	private int score;

	public Student(){
		this.roll = -1;
		this.name = "";
		this.score = 0;

	}

	public Student(int roll){
		this.roll = roll;
		this.name = "";
		this.score = 0;
	}

	public Student(int roll,String name){
		this.roll = roll;
		this.name = name;
		this.score = 0;
	}

	public Student(int roll,String name,int score){
		this.roll = roll;
		this.name = name;
		this.score = score;
	}

	public Student(Student obj){
		this.roll = obj.roll;
		this.name = obj.name;
		this.score = obj.score;
	}	
	
	public void display(){
		System.out.println("Name: "+ this.name);
		System.out.println("Roll: "+this.roll);
		System.out.println("Score: "+this.score);
	}
	}

class q8{
	public static void main(String args[]){
		Student stu = new Student(1,"Raja",20);
		stu.display();
		System.out.println("------Another student----------");
		Student stud = new Student(stu);
		stud.display();
		
	}
}