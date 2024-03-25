import java.util.Scanner;
class q3{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Height(in cm): ");

		int height = scan.nextInt();
		double inch = height/2.54;
		double foot = height/30.5;

		System.out.printf("Height in inch: %.2f\n", inch);
		System.out.printf("Height in foot: %.2f\n", foot);
	}
}