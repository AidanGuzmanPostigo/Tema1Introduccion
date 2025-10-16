package ejercicios1_3Wrappers;
public class Ejercicio4 {
	public void excercise4() {
		boolean value;
		int num1;
		char char1;
		double nume1;
		value = true;
		num1 = 52;
		char1 = 'A';
		nume1 = 125.30;
		String finalValue = Boolean.toString(value) + Integer.toString(num1) + char1 + Double.toString(nume1);
		System.out.println(finalValue);
	}
	public static void main(String[] args) {
		new Ejercicio4().excercise4();
	}
}