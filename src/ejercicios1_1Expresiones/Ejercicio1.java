package ejercicios1_1Expresiones;
public class Ejercicio1 {
	public void exercise1 () {
		//1.
		byte num1 = 3*5-4/2;
		//15 - 2 = 13
		//2.
		byte num2 = 7-4*2-5*2;
		//7 -8 - 10 = -11
		//3.
		boolean num3 = 5+4<7+8;
		//9<15 = true
		//4.
		boolean num4 = 4<5*4/2-7;
		//4<20/2 - 7 = 4<10-7 = 4<3 = false
		//5.
		boolean num5 = !(4>6);
		//!(false) = true
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	}
	public static void main(String[] args) {
		new Ejercicio1().exercise1();
	}
}