package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
	
		List <Integer> list = Arrays.asList(1,45,98,556,4556,5555);
		
		Optional<Integer> sum =  list.stream().reduce((a,b) -> a+b);
		System.out.println("sum of numbers is:"+sum.get());

	}

}
