package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestLowest {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(1,45,98,556,4556,5555,55,98);
		List<Integer>secondLowest = list.stream().sorted().distinct().limit(2).skip(1).collect(Collectors.toList());
		System.out.println(secondLowest);
		
		//secondHighest
		
		List<Integer>secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).collect(Collectors.toList());
		System.out.println(secondHighest);
	}

}
