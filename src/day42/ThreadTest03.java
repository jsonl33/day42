package day42;

class Thread03 extends Thread {
	String name;

	Thread03() {
	}

	Thread03(String name) {
		this.name = name;
	}

	public void start() {
		run();
	}

	public void run() {
		for (int k = 1; k <= 5; k++) {
			for (int a = 1; a < 100000000; a++)
				;
			System.out.println(name + " : " + k);
		}
	}
}

public class ThreadTest03 {
	public static void main(String[] args) {
		Thread03 t1 = new Thread03("첫번째 스레드");
		Thread03 t2 = new Thread03("두번째 스레드");
		t1.start();
		t2.start();
	}
}
