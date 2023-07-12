package day42;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest04 {
	public static void main(String[] args) {
		String[] strArray = {"홍길동", "이순신", "세종대왕"};
		Stream<String> strStream = Arrays.stream(strArray);
		
		strStream.forEach(a -> System.out.println(a));
		System.out.println("============================");
		
		int[] intArray= {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(i -> System.out.println(i));
		
	}
}
