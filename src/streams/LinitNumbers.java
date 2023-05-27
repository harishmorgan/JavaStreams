package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LinitNumbers {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(1,45,98,556,4556,5555,55,98,989,97,065,900,10);
		
		//get first 5 numbers --->sum of 5 numbers
		 List<Integer> l = list.stream().limit(5).collect(Collectors.toList());
		 System.out.println(l);
		 
		 Integer sum = list.stream().limit(5).reduce((p,q)-> p+q).get();
		 
		 System.out.println(sum);
		 
		List<Integer>skipped =  list.stream().skip(5).collect(Collectors.toList());
		
		System.out.println(skipped);
		
		Integer sum5k = list.stream().skip(5).reduce((p,q)-> p+q).get();
		 
		 System.out.println(sum5k);
		

	}

}
