package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumberString {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(1,45,98,556,4556,5555,55,98);
		
		Set<Integer>duplicatNum = list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(duplicatNum);
	}

}
