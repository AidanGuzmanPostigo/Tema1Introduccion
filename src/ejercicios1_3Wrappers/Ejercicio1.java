package ejercicios1_3Wrappers;
public class Ejercicio1 {
	public void excercise1(){
		//1.
		Character char1 = 'A';
		char chare1 = char1.charValue();
		System.out.println(chare1);
		//2.
		Character char2 = 'A';
		boolean value1 = Character.isDigit(char2);
		System.out.println(value1);
		//3.
		Character char3 = 'A';
		boolean value2 = Character.isUpperCase(char3);
		System.out.println(value2);
		//4.
		Character char4 = 'A';
		char chare2 = Character.toLowerCase(char4);
		System.out.println(chare2);
		//5.
		Character char5 = 'A';
		char chare3 = Character.valueOf(char5);
		System.out.println(chare3);
	}
	public static void main(String[] args) {
		new Ejercicio1().excercise1();
	}
}