package day42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest02 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("이순신", 100)
				);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name+ ": "+score);
		});
	}
}
