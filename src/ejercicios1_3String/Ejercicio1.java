package ejercicios1_3String;
public class Ejercicio1 {
	public void excercise1() {
		//1.
		String text1 = "Cadena";
		char char1 = text1.charAt(0);
		System.out.println(char1);
		//2.
		String text2 = "Cadena";
		int num1 = text2.length();
		System.out.println(num1);
		//3.
		String text3 ="Cadena", texttext1 = " Memoria", textresult1;
		textresult1 = text3.concat(texttext1);
		System.out.println(textresult1);
		//4.
		String text4 = "Cadena";
		boolean value1 = text4.endsWith("ena");
		System.out.println(value1);
		//5.
		String text5 = "Cadena";
		char char2 = 'a';
		int num2 = text5.indexOf(char2);
		System.out.println(num2);
		//6.
		String text6 = "Cadena";
		char char3 = 'a';
		int num3 = text6.indexOf(char3, 3);
		System.out.println(num3);
		//7.
		String text7 = "Cadena";
		int num4 = text7.indexOf("de");
		System.out.println(num4);
		//8.
		String text8 = "Repetitiva";
		int num5 = text8.indexOf("ti", 5);
		System.out.println(num5);
		//9.
		String text9 = "";
		boolean value2 = text9.isEmpty();
		System.out.println(value2);
		//10.
		String text10 = "Repetitiva";
		int num6 = text10.lastIndexOf('a');
		System.out.println(num6);
		//11.
		String text11 = "Repetitiva";
		int num7 = text11.lastIndexOf('i', 6);
		System.out.println(num7);
		//12.
		String text12 = "Repetitiva";
		int num8 = text12.lastIndexOf("ti");
		System.out.println(num8);
		//13.
		String text13 = "Repetitiva";
		int num9 = text13.lastIndexOf("ti", 5);
		System.out.println(num9);
		//14
		String text14 = "Repetitiva";
		String texttext2 = text14.replace('R', 'C');
		System.out.println(texttext2);
		//15.
		String text15 = "Repetitiva";
		text15 = text15.toUpperCase();
		System.out.println(text15);
		//16.
		String text16 = " Repetitiva ";
		text16 = text16.trim();
		System.out.println(text16);
		//17.
		String text17 = String.valueOf(17.5);
		System.out.println(text17);
	}
	public static void main(String[] args) {
		new Ejercicio1().excercise1();
	}
}