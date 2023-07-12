package day42;

import java.util.stream.IntStream;

public class StreamTest05 {
	static int result = 0;
	public static void main(String[] args) {
		IntStream intStreamRange = IntStream.rangeClosed(1, 100);
		intStreamRange.forEach(i -> result+=i);
		System.out.println("1부터 100: "+result);
		
		int total=0;
		for(int i = 51;i<=100;i++) {
			total += i;
		}
		System.out.println("51부터 100: "+total);
	}
}
