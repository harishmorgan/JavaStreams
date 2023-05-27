package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscendDescend {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(1,45,98,556,4556,5555,55,98);
		List<Integer>asc = list.stream().sorted().collect(Collectors.toList());
		System.out.println(asc);
		
		//descending
		
		List<Integer>desc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(desc);
		
	}

}
