package day42;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Thread05 extends Frame implements Runnable {
	int x = 1;

	public Thread05() {
		setBackground(new Color(0, 0, 0));
		setSize(380, 160);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
			}
			repaint();
			x += 5;
			if(x > 380) {
				x = -380;
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		Dimension d;
		d=getSize();
		g.setColor(Color.ORANGE);
		g.drawString("내일부터 장마가 시작됩니다. 시간당 00mm가 내리니 주의하시길 바랍니다",x,d.height/2);
		g.setFont(new Font("궁서체",Font.BOLD, 36));
	}
	
}

public class ThreadTest05 {
	public static void main(String[] args) {
		Thread05 th = new Thread05();
		Thread th01 = new Thread(th);
		th01.start();
	}
}
