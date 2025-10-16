package ejercicios1_3Wrappers;
public class Ejercicio3 {
	public void excercise3() {
		//1.
		Double num1 = 1.23;
		float nume1 = num1.floatValue();
		System.out.println(nume1);
		//2.
		Double num2 = 1.23;
		double nume2 = num2.doubleValue();
		System.out.println(nume2);
		//3.
		Double num3 = 1.23;
		boolean value1 = num3.isInfinite();
		System.out.println(value1);
		//4.
		double num4 = 1.23;
		boolean value2 = Double.isInfinite(num4);
		System.out.println(value2);
		//5.
		Double num5 = 1.23;
		boolean value3 = num5.isNaN();
		System.out.println(value3);
		//6.
		Double num6 = 1.23, nume4 = 1.28;
		double nume3 = Double.min(nume4, num6);
		System.out.println(nume3);
		//7.
		String text1 = "125.501";
		double nume5 = Double.parseDouble(text1);
		System.out.println(nume5);
		//8.
		double num7 = 1.23;
		double nume6 = Double.valueOf(num7);
		System.out.println(nume6);
		//9.
		String text2 = "125.063";
		double nume7 = Double.valueOf(text2);
		System.out.println(nume7);
	}
	public static void main(String[] args) {
		new Ejercicio3().excercise3();
	}
}