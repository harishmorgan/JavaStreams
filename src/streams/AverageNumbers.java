package streams;

import java.util.Arrays;
import java.util.List;

public class AverageNumbers {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(1,45,98,556,4556,5555);
		double avg =	list.stream().mapToInt(a->a).average().getAsDouble();
		System.out.println("average of all numbers is:"+avg);

	}

}
