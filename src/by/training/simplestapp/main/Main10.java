package by.training.simplestapp.main;

public class Main10 {
	public static void main(String[] args) {
		double x = 10;
		double y = 20;
		double z = ((Math.sin(x) + Math.cos(y)) / ((Math.cos(x) - Math.sin(y))) * Math.tan(x * y));

		System.out.println(z);

	}
}
