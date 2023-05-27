package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(1,45,98,556,4556,5555);
		
		List<Integer>even = list.stream().filter(a->a%2==0).collect(Collectors.toList());
		
		System.out.println(even);
		
		//odd
		List<Integer>odd = list.stream().filter(a->a%2 != 0).collect(Collectors.toList());
		
		System.out.println(odd);
	}

}
