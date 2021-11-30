package Números;

import java.util.Random;

public class Exercise5 {

	public static void main(String[] args) {
		Random random = new Random();
		int number;
		String weekend;
		String day;

		System.out.println(random.nextBoolean());
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(68 - 34 + 1) + 34);
		System.out.println(random.nextDouble());

		number = random.nextInt((7) + 1);
		weekend = (number > 5) ? "is weekend" : "is not weekend";
		day = number == 1 ? "monday"
				: number == 2 ? "Tuesday"
						: number == 3 ? "Wednesday"
								: number == 4 ? "Thrusday"
										: number == 5 ? "Friday" : number == 6 ? "Saturday" : "Sunday";
		System.out.println(" Today is " + day + " and " + weekend);

	}

}
