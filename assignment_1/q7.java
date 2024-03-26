class Student{
	private int roll;
	private String name;
	private int score;
	public void setRoll(int roll){
		this.roll = roll;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setScore(int score){
		this.score = score;
	}
	public void display(){
		System.out.println("Name: "+ this.name);
		System.out.println("Roll: "+this.roll);
		System.out.println("Score: "+this.score);
	}
	public void copy(Student obj){
		obj.setName(name);
		obj.setRoll(roll);
		obj.setScore(score);
	}
}

class q7{
	public static void main(String args[]){
		Student stu = new Student();
		stu.setName("Raja");
		stu.setRoll(52);
		stu.setScore(100);
		stu.display();
		System.out.println("------Another student----------");
		Student stud = new Student();
		stu.copy(stud);
		stud.display();
		
	}
}