package streams;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 10, 20, 30, 15);

		// 1 10 400 900 225 (e*e)
		// 400 900 225 we need to print this values which are greater than 100
		// sum of those 3 numbers is 15225/3 = 508.3333
		double avg = list.stream().map(e -> e * e).filter(e -> e > 100).mapToInt(e -> e).average().getAsDouble();
		System.out.println(avg);
	}

}
