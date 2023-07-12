package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		System.out.println("===================================");
		
		total = 0;
		List<Integer> numList = new ArrayList<>();
		for(int i = 0;i<100;i++) {
			int randNum = (int)(Math.random()*10)+1;
			numList.add(randNum);
		}
		for(int x : numList) {
			total += x;
		}
		System.out.println(total);
	}
}
