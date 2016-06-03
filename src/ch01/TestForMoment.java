package ch01;

import java.util.Stack;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestForMoment {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(9);
		Stack stack=new Stack();
		Timer timer=new Timer();
		TimeUnit.MILLISECONDS.sleep(100);
		Thread.yield();
	}

}
