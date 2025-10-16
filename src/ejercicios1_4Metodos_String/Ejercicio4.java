package ejercicios1_4Metodos_String;
public class Ejercicio4 {
	public void excercise4() {
		int num1=2, num2=3, result;
		result = num1 + num2;
		String s = String.valueOf(num1) + String.valueOf(num2);
		System.out.println(result);
		System.out.println(s);
	}
	public static void main(String[] args) {
		new Ejercicio4().excercise4();
	}
}