package day42;

class Thread04 implements Runnable{
	@Override
	public void run() {
		for (int k = 1; k <= 5; k++) {
			for (int a = 1; a < 100000000; a++);
			System.out.println(Thread.currentThread().getName() + " : " + k);
		}
	}
}

public class ThreadTest04 {
	public static void main(String[] args) {
		Thread04 t01 = new Thread04();
		Thread th01 = new Thread(t01, "첫번째 쓰레드");
		th01.start();
		
		Thread04 t02 = new Thread04();
		Thread th02 = new Thread(t02, "두번째 쓰레드");
		th02.start();
	}
}
