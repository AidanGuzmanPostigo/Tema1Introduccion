package ejercicios1_4Metodos_String;
public class Ejercicio15 {
	public void excercise15() {
		String s = """
				Línea 1
				Línea 2
				Línea 3
				""", s2, s3;
		s2 = s.indent(3);
		s3 = s2.indent(-2);
		System.out.println(s2);
		System.out.println(s3);
	}
	public static void main(String[] args) {
		new Ejercicio15().excercise15();
	}
}