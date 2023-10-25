package by.training.simplestapp.main;

public class Main11 {

	public static void main(String[] args) {
		double a = 3;
		double b = 4;
		double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		double p = a + b + c;
		double s = Math.sqrt(p * ((p - c) * (p - b) * (p - a)));
		System.out.println("периметр " + p);
		System.out.println("площадь " + s);

	}

}
