import java.util.Scanner;
class Metric{
	private final static double unitMile = 1.5;
	public static double convertToMile(double km){
		return km / unitMile;
	}
	public static double convertToKm(double mile){
		return mile * unitMile;
	}
}

class q10{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Distance(in km): ");
		System.out.println("Distance(in mile): " + Metric.convertToMile(scan.nextDouble()));
		System.out.print("Distance(in mile): ");
		System.out.println("Distance(in km): " + Metric.convertToKm(scan.nextDouble()));
	}
}