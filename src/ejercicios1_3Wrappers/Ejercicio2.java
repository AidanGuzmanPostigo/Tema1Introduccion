package ejercicios1_3Wrappers;
public class Ejercicio2 {
	public void excercise2() {
		//1.
		Integer num1 = 3;
		byte nume1= num1.byteValue();
		System.out.println(nume1);
		//2.
		Integer num2 = 3;
		int nume2 = num2.intValue();
		System.out.println(nume2);
		//3.
		Integer num3 = 3;
		double nume3 = num3.doubleValue();
		System.out.println(nume3);
		//4.
		Integer num4 = 3;
		String cadena = Integer.toHexString(num4);
		System.out.println(cadena);
		//5.
		String cadena2 = "563";
		int num5 = Integer.parseInt(cadena2);
		System.out.println(num5);
		//6.
		Integer num6 = 3;
		int nume4 = Integer.valueOf(num6);
		System.out.println(nume4);
		//7.
		String cadena3 = "586";
		int num7 = Integer.valueOf(cadena3);
		System.out.println(num7);
	}
	public static void main(String[] args) {
		new Ejercicio2().excercise2();
	}

}