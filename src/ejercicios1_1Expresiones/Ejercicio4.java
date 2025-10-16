package ejercicios1_1Expresiones;
public class Ejercicio4 {
	public void exercise4 () {
		//1.
		//La asignación es válida, la variable tiene que ser de tipo boolean y se almacena como false
		boolean z;
		z = 2 < 1;
		System.out.println(z);
		//2.
		//La asignación es válida, la variable es de tipo int y se almacena como 3 en este caso
		int a = 2; 
		a = a + 1;
		System.out.println(a);
		//3.
		//La asignación no es válida, ya que no puedes utilizar '' para darle nombre a la variable
		//char 'x' = 'y';
		//4.
		//La asignación es válida, la variable tiene que ser de tipo character y se almacena como 'y'
		char x = 'y';
		System.out.println(x);
		//5.
		//La asignación es válida, la variable será de tipo int y se almacena como 5 en este caso
		byte b = 5;
		byte a2 = b;
		System.out.println(a2);
		//6.
		//Sin realizar modificaciones la asignación no es válida, ya que el resultado es erróneo por los tipos de datos
		//int precio = 200;
		//precio = precio - precio *  (30/100);
		//7.
		//La asignación es válida, el tipo de dato es int y el valor guardado es 6
		int a3 = 1;
		int b2 = 2;
		a3 = a3<b2?5+1:7-3*2;
		System.out.println(a3);
		//8.
		//La asignación es válida, las variables son de tipo float y el valor almacenado en a4 es infinito
		float a4;
		float b3 =  5;
		a4 = b3/0;
		System.out.println(a4);
		//9.
		//La asignación es válida, las variables son de tipo int y el valor almacenado en i es el de j, lo que ocurre es que antes de asignar el valor j incrementa su valor en 1
		int i;
		int j = 4;
		i = ++j;
		System.out.println(i);
		System.out.println(j);
		//10.
		//La asignación es válida, las variables son de tipo int y el valor almacenado en i2 es el que tiene j, y luego se le suma un valor
		int i2;
		int j2 = 10;
		i2 = j2++;
		System.out.println(i2);
		System.out.println(j2);
		//11. 
		//La asignación no es válida, ya que al usar ' como valor sin utilizar \ hace que no se pueda asignar a una variable de tipo char
		//char c=''';
		//12.
		//La asignación es válida, la variable es de tipo char y se almacena el valor " en la variable c
		char c = '"';
		System.out.println(c);
		//13.
		//La asignación es válida, la variable es de tipo char y se almacena el valor c en la variable c2
		char c2 = 'c';
		System.out.println(c2);
		//14.
		//La asignación es válida, la variable es de tipo string y se almacena el valor ' en la variable s
		String s = "'";
		System.out.println(s);
		//15.
		//La asignación no es válida pues no se puede almacenar en un string " sin usar \ delante.
		// String s = """;
		//16.
		//La asignación es válida, la variable es de tipo char y el valor almacenado en la variable c3 es A
		char c3 = '\u0041';
		System.out.println(c3);
		//17.
		//La asignación es válida, la variable es de tipo int y el valor almacenado en la variable c4 es 65;
		int c4 = 65;
		System.out.println(c4);
		//18.
		//La asignación es válida, la variable x2 es double y a5 y b4 son float, el valor almacenado en la variable x2 es 16.200000000000003
		double x2;
		float a5 = 5f;
		float b4 = 4f;
		x2 = (a5>b4?5.4*3:65.1/8);
		System.out.println(x2);
		//19.
		//La asignación no es válida ya que está usando el operador comparativo en en vez del asignativo.
		//a == a>b?3+6:9-4
		//20.
		//La asignación es válida, las variables c5 y d son de tipo int y a es boolean,  el valor almacenado en d es el de c5 y c5 acaba valiendo c5+1
		int c5 = 8;
		int d;
		boolean a6 = false;
		d = !a6 ? c5++:--c5;
		System.out.println(d);
		System.out.println(c5);
	}
	public static void main(String[] args) {
		new Ejercicio4().exercise4();
	}
}