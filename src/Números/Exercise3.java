package Números;

import java.util.Random;

public class Exercise3 {

	public static void main(String[] args) {
		Random random = new Random();
		int num;

		num = (random.nextInt(35) + 34);
		System.out.println("El número es " + num);

	}

}
