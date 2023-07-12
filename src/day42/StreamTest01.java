package day42;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest01 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "이순신", "강감찬");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(" "+name);
		}
		System.out.println("\n==================================\n");
		
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(" "+name));
	}

}
