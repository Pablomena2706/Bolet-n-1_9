package Números;

import java.util.Random;

public class Exercise6 {

	public static void main(String[] args) {
		Random random = new Random();
		int number;
		String verano;
		String mes;

		number = random.nextInt(12) + 1;
		verano = (number == 7 || number == 8) ? "es verano" : "no es verano";
		mes = number == 1 ? "Enero"
				: number == 2 ? "Febrero"
						: number == 3 ? "Marzo"
								: number == 4 ? "Abril"
										: number == 5 ? "Mayo"
												: number == 6 ? "Junio"
														: number == 7 ? "Julio"
																: number == 8 ? "Agosto"
																		: number == 9 ? "Septiembre"
																				: number == 10 ? "Octubre"
																						: number == 11 ? "Noviembre"
																								: "Diciembre";
		System.out.println("Es mes " + mes + " y " + verano);

	}

}
