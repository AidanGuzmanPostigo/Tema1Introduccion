package ejercicios1_3Numeros_Aleatorios;
import java.util.Random;
public class Ejercicio1 {
	public void excercise1() {
		//1.
		String moneda;
		Random random = new Random();
		int rnum1 = random.nextInt(2);
		moneda = rnum1 == 0 ?"Cara":"Cruz";
		System.out.println(moneda);
		//2.
		int rnum2 = random.nextInt(6) + 1;
		System.out.println(rnum2);
		//3.
		int rnum3 = random.nextInt(68-34+1) + 34;
		System.out.println(rnum3);
		//4.
		double rnum4 = random.nextDouble();
		System.out.println(rnum4);
		//5.
		String finde;
		int rnum5 = random.nextInt(7);
		finde = rnum5 >= 5 ? "Sí, es fin de semana": "No es fin de semana";
		System.out.println(finde);
		//6.
		String verano;
		int rnum6 = random.nextInt(12);
		verano = rnum6 == 6? "Verano": rnum6 == 7 ? "Verano": "No, no es verano";
		System.out.println(verano);
		//7.
		String dia;
		int rnum7 = random.nextInt(7);
		dia = rnum7 == 0 ? "Lunes": rnum7 == 1 ? "Martes": rnum7 == 2 ? "Miércoles": rnum7 == 3 ? "Jueves": rnum7 == 4 ? "Viernes": rnum7 == 5 ? "Sábado": "Domingo";
		System.out.println(dia + ".");
		//8.
		String mes;
		int rnum8 = random.nextInt(12);
		mes = rnum8 == 0 ? "Enero": rnum8 == 1 ? "Febrero": rnum8 == 2 ? "Marzo": rnum8 == 3 ? "Abril": rnum8 == 4 ? "Mayo": rnum8 == 5 ? "Junio": rnum8 == 6 ? "Julio": rnum8 == 7 ? "Agosto": rnum8 == 8 ? "Septiembre": rnum8 == 9 ? "Octubre": rnum8 == 10 ? "Noviembre": "Diciembre";
		System.out.println(mes + ".");
	}
	public static void main(String[] args) {
		new Ejercicio1().excercise1();
	}
}