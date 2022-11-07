package unico;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

final int TOTAL_MIN = 1440;
		
		int hora;
		int minuto;
		int mintransc; 
		int minrestante;
		
		System.out.print("A continuación deberá introducir una hora del día (formato 24 horas): ");
		hora = Integer.parseInt(teclado.nextLine());
		System.out.print("Ahora, introduzca los minutos: ");
		minuto = Integer.parseInt(teclado.nextLine());
		
		mintransc = (hora * 60) + minuto;
		minrestante = TOTAL_MIN - mintransc;
		
		System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + minrestante + " minutos.");
		
		}
}
	