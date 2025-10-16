package ejercicios1_4Metodos_String;
import java.util.Random;
public class Ejercicio2 {
	public void excercise2() {
	String s = "Cadena";
	Random random = new Random();
	int rnum1 = random.nextInt(6);
	char char1 = s.charAt(rnum1);
	System.out.println(char1);
	}
	public static void main(String[] args) {
		new Ejercicio2().excercise2();
	}
}