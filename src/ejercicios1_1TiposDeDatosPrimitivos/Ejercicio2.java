package ejercicios1_1TiposDeDatosPrimitivos;
public class Ejercicio2 {
	public void exercise2(){
		short s = 30000;
		byte b = (byte) s;
		System.out.println(b);
		//adquiere 48 de valor, pues da la casualidad de que ese es el valor que tiene el último byte en la memoria RAM de la variable s, ya que al ser mayor de 127 es imposible almacenar todo el valor de esta variable en una de tipo byte
	}
	public static void main(String[] args) {
		new Ejercicio2().exercise2();	
	}
}