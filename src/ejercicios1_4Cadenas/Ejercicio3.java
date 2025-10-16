package ejercicios1_4Cadenas;
public class Ejercicio3 {
	public void excercise3() {
		StringBuilder s = new StringBuilder("Cadena de prueba");
		System.out.println(s);
		StringBuilder s2 = new StringBuilder("final");
		s = s.insert(7, s2);
		System.out.println(s);
		s = s.delete(12, 21);
		System.out.println(s);
		s = s.reverse();
		System.out.println(s);
	}
	public static void main(String[] args) {
		new Ejercicio3().excercise3();
	}
}