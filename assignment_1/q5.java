import java.util.Scanner;
class q5{
	public static void check(String data,String tmp){
		System.out.println("Outcome of ==: " + (data == tmp));
		System.out.println("Outcome of equals: " + data.equals(tmp));
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String data = scan.nextLine();
		String tmp = data;
		check(data,tmp);
		System.out.println("Enter same string two times : ");
		data = scan.nextLine();
		tmp = scan.nextLine();
		check(data,tmp);
	}
}