package com.grj;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hello world");
			}
		}, 5000, 500);
		//5000, ÿ�ε�0.5��
	}
	
	
}
