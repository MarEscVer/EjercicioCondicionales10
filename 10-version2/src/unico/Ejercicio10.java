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
		String formato;
		int horasfaltan;
		int minfaltan;
		
		System.out.print("A continuación deberá introducir una hora del día (formato 12 horas): ");
		hora = Integer.parseInt(teclado.nextLine());
		System.out.print("¿AM / PM?");
		formato = teclado.nextLine();
		System.out.print("Ahora, introduzca los minutos: ");
		minuto = Integer.parseInt(teclado.nextLine());
		
		if ( formato.equalsIgnoreCase("PM")) {
			hora += 12;	
		}
		
		mintransc = (hora * 60) + minuto;
		minrestante = TOTAL_MIN - mintransc;
		horasfaltan = (int) (minrestante / 60);
		minfaltan = minrestante % 60;
		
		System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + horasfaltan + " horas y " + minfaltan +  " minutos.");
		System.out.println("Es decir " + minrestante +  " minutos.");
		}

}