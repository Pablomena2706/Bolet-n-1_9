package Números;

import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {
		Random random = new Random();
		int dado;

		dado = (random.nextInt(6) + 1);
		System.out.println("El número es " + dado);
	}

}
