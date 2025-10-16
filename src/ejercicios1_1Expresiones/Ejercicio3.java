package ejercicios1_1Expresiones;
public class Ejercicio3 {
	public void exercise3 () {
		//1.
		//para resolver el fallo bastaría con quitar la L		
		int x = 165698;
		System.out.println(x);
		//2.
		//para resolver el fallo basta con hacer un casting
		short s = 56;
		byte b = (byte) s;
		System.out.println(b);
		//3.
		//para resolver el fallo basta con cambiar el tipo de dato
		short b2 = 129;
		System.out.println(b2);
		//4.
		//para resolver el fallo basta con poner una f al final del literal
		float f = 5.89f;
		System.out.println(f);
		//5.
		//para resolver el fallo basta con cambiar el tipo de dato por uno que admita decimales
		float l = 8.42f;
		System.out.println(l);
		//6.
		//para resolver el fallo basta con hacer un casting
		char c1 = 'a', c2;
		c2 = (char) (c1 + 7);
		System.out.println(c2);
		//7.
		//se soluciona cambiando el tipo de dato de b3 para que sea short
		short b3;
		short s2 = 7;
		boolean a = true;
		b3 =  a ? s2++:--s2;
		System.out.println(b3);
	}
	public static void main(String[] args) {
		new Ejercicio3().exercise3();
	}
}