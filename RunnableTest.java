package com.feb24;

class Table implements Runnable {

	static void show(int n) {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(n * i);
		}
	}

	@Override
	public void run() {

		Table.show(10);

	}

}

public class Test3 {

	public static void main(String[] args) {

		Table t1 = new Table();

		Thread tt = new Thread(t1);
		Thread tt1 = new Thread(t1);
		tt.start();
		try {
			tt.join();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		tt1.start();
	}

}
