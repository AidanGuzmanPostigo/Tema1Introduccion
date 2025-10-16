package ejercicios1_4Metodos_String;
public class Ejercicio5 {
	public void excercise5() {
		String s="CadenaCorta", s2="CadenaLarga";
		int num1 = s.compareTo(s2);
		System.out.println(num1==0? "Son iguales":num1>0? "La cadena 1 es mayor":"La cadena 1 es menor");
	}
	public static void main(String[] args) {
		new Ejercicio5().excercise5();
	}
}