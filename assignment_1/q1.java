import java.util.Scanner;
class q1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two short integer: ");
		short a = scan.nextShort();
		short b = scan.nextShort();
		System.out.println("Sum: "+(a+b));
	}
}