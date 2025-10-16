package ejercicios1_4Metodos_String;
public class Ejercicio11 {
	public void excercise11() {
		String s = "Esto es una cadena de prueba para probar las cadenas", s2="variable";
		s = s.replace("cadena", s2);
		System.out.println(s);
	}
	public static void main(String[] args) {
		new Ejercicio11().excercise11();
	}
}