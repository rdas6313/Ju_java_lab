import java.util.Scanner;
class q4{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Circle radius: ");
		double radius = scan.nextDouble();
		final double pi = 3.14;
		double area = pi * radius * radius;
		System.out.println("Area: " + area);
	}
}