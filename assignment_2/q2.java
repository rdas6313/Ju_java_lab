import java.util.Scanner;

class Address {
	private String premises_number;
	private String street;
	private String city;
	private String pin;
	private String state;

	public Address(String premises_number, String street, String city, String pin, String state) {
		this.premises_number = premises_number;
		this.street = street;
		this.city = city;
		this.pin = pin;
		this.state = state;
	}

	public String getPremises_number() {
		return premises_number;
	}

	public void setPremises_number(String premises_number) {
		this.premises_number = premises_number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

class Person {
	private String name;
	private Address address;
	private String phone;
	private String email;

	public Person(String name, Address address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class Student extends Person {

	private int roll;
	private String course;

	public Student(String name, Address address, String phone, String email, int roll, String course) {
		super(name, address, phone, email);
		this.roll = roll;
		this.course = course;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}

class Faculty extends Person {

	private String emp_id;
	private String department;
	private String specialisation;

	public Faculty(String name, Address address, String phone, String email, String emp_id, String department,
			String specialisation) {
		super(name, address, phone, email);
		this.emp_id = emp_id;
		this.department = department;
		this.specialisation = specialisation;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

}

class q2 {
	public static void main(String[] args) {
		Address address = new Address("123", "maidan", "katwa", "713130", "west-bengal");
		Student student = new Student("Raja", address, "12345", "abc@ex.com", 2, "MCA");
		System.out.println("..Student Info..");
		System.out.println("Name: " + student.getName());
		System.out.println("Roll: " + student.getRoll());
		System.out.println("phone: " + student.getPhone());
		System.out.println("email: " + student.getEmail());
		System.out.println("Course: " + student.getCourse());
		System.out.println("Address: " + student.getAddress().getPremises_number() + " "
				+ student.getAddress().getStreet() + " " + student.getAddress().getCity() + " "
				+ student.getAddress().getPin() + " " + student.getAddress().getState());

		Address faddress = new Address("125", "clg street", "kolkata", "700002", "west-bengal");
		Faculty faculty = new Faculty("Mridul sarkar", faddress, "123452", "aws@ex.com", "1234", "CSE", "ML");
		System.out.println("\n..Faculty Info..");
		System.out.println("Name: " + faculty.getName());
		System.out.println("phone: " + faculty.getPhone());
		System.out.println("email: " + faculty.getEmail());
		System.out.println("Address: " + faculty.getAddress().getPremises_number() + " "
				+ faculty.getAddress().getStreet() + " " + faculty.getAddress().getCity() + " "
				+ faculty.getAddress().getPin() + " " + faculty.getAddress().getState());
		System.out.println("Emp id: " + faculty.getEmp_id());
		System.out.println("Department: " + faculty.getDepartment());
		System.out.println("Specialization: " + faculty.getSpecialisation());
	}
}