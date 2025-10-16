package ejercicios1_4Metodos_String;
public class Ejercicio12 {
	public void excercise12() {
		String s = "Cadena de texto", s2;
		s2 = s.substring(5, 10);
		System.out.println(s2);
	}
	public static void main(String[] args) {
		new Ejercicio12().excercise12();
	}
}