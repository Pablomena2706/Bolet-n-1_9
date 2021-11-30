package Números;

import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		Random random = new Random();
		boolean num;
		String coin;

		num = random.nextBoolean();
		coin = num ? "Cara " : "Cruz ";
		System.out.println(coin);

	}

}
