package ejercicios1_1Expresiones;
public class Ejercicio2 {
	public void exercise2 () {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		//1.
		boolean value1 = a && b || a && c;
		//true Y false O true Y true = false O true = true
		System.out.println(value1);
		//2.
		boolean value2 = (a || !b) && (!a || c);
		//true O !false Y !true O true = true Y false = true
		System.out.println(value2);
		//3.
		boolean value3 = a || b && c;
		//true O false = true
		System.out.println(value3);
		//4.
		boolean value4 = !(a || b) && c;
		//!true Y true = false
		System.out.println(value4);
	}
	public static void main(String[] args) {
		new Ejercicio2().exercise2();
	}
}