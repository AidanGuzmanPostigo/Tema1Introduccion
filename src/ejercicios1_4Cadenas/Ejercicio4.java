package ejercicios1_4Cadenas;
public class Ejercicio4 {
	public void excercise4() {
		String s = "      Bienvenidos al módulo de PROGRAMACIÓN      ";
		System.out.println(s.trim().toLowerCase().replace("programación", "Java"));
	}
	public static void main(String[] args) {
		new Ejercicio4().excercise4();
	}
}