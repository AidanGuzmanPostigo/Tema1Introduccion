package ejercicios1_4Metodos_String;
public class Ejercicio3 {
	public void excercise3(){
		String s1="Cadena", s2="CaDena";
		boolean value1, value2;
		value1 = s1.equals(s2);
		value2 = s1.equalsIgnoreCase(s2);
		System.out.println(value1);
		System.out.println(value2);
	}
	public static void main(String[] args) {
		new Ejercicio3().excercise3();
	}
}