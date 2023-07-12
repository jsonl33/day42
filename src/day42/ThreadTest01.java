package day42;

class Thread01 extends Thread {
	Thread01(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int k=1;k<=5;k++) {
			for(int a=1;a<100000000;a++);
			System.out.println(getName()+" : "+k);
		}
	}
}

public class ThreadTest01 {
	public static void main(String[] args) {
		Thread01 t = new Thread01("첫번째 스레드");
		Thread01 t2 = new Thread01("두번째 스레드");
		
		t.start();
		t2.start();
	}
}
