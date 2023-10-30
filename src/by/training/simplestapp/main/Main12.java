package by.training.simplestapp.main;

public class Main12 {
	public static void main(String[] args) {
		double x1 = 2;
		double y1 = 4;

		double x2 = 8;
		double y2 = 11;

		double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("Расстояние между двумя точками = " + d);
	}
}
