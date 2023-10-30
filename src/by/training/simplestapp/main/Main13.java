package by.training.simplestapp.main;

public class Main13 {
	public static void main(String[] args) {
		double x1 = 1;
		double y1 = 2;

		double x2 = 3;
		double y2 = 4;

		double x3 = 5;
		double y3 = 10;

		double c1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double c2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double c3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		double p = c1 + c2 + c3;

		double s = p / 2;
		double S = Math.sqrt(s * (s - c1) * (s - c2) * (s - c3));

		System.out.println("Периметр = " + p);
		System.out.println("Площадь = " + S);
	}

}
