package ejercicios1_2Funciones;
public class Ejercicio1 {
	public void excercise1() {
		System.out.println(addRemove(6, 9, true));
		System.out.println(addRemove(6, 9, false));
		System.out.println(addRemove(10, 50, true));
		System.out.println(addRemove(10+1, 50+1, !false));
	}
	public int addRemove(int num1, int num2, boolean value) {
		return value == true ? num1+num2:num1-num2;
	}
	public static void main(String[] args) {
		new Ejercicio1().excercise1();
	}
}
