package ejercicios1_4Metodos_String;
public class Ejercicio1 {
	public void excercise1() {
		String s = "Programación";
		int length1= s.length();
		char char1 = s.charAt(2);
		System.out.println(length1);
		System.out.println(char1);
	}
	public static void main(String[] args) {
		new Ejercicio1().excercise1();
	}
}