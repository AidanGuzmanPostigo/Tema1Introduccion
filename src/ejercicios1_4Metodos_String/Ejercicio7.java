package ejercicios1_4Metodos_String;
public class Ejercicio7 {
	public void excercise7() {
		String s = "Cadena", sUp, sLow;
		sUp = s.toUpperCase();
		sLow = s.toLowerCase();
		System.out.println(sUp);
		System.out.println(sLow);
	}
	public static void main(String[] args) {
		new Ejercicio7().excercise7();
	}
}