package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(1,45,98,556,4556,5555,55,98);
		Integer max =list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);

		//minimum
		Integer min =list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		
	}

}
