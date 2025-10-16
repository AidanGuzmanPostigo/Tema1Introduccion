package ejercicios1_4Introduccion;
public class Ejercicio2 {
	public void excercise2() {
		String chain1 = "text";
		String chain2 = new String("text");
		boolean value1, value2;
		value1 = chain1 == chain2;
		value2  = chain1.equals(chain2);
		System.out.println(value1);
		System.out.println(value2);
	}
	public static void main(String[] args) {
		new Ejercicio2().excercise2();
	}

}
