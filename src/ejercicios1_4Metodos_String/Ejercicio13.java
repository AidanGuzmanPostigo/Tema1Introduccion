package ejercicios1_4Metodos_String;
public class Ejercicio13 {
	public void excercise13() {
		String s = "Cadenadeprueba";
		boolean val1 = s.regionMatches(true, 0,"caDEna",0, 6);
		System.out.println(val1);
	}
	public static void main(String[] args) {
		new Ejercicio13().excercise13();
	}
}