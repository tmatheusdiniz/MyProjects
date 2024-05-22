package learning.advanced;

import learning.entities.CountdownTask;
import learning.entities.CountupTask;

public class ThreadExample {

	public static void main(String[] args) {

		// Criando e iniciando duas threads
		Thread countdownThread = new Thread(new CountdownTask());
		Thread countupThread = new Thread(new CountupTask());

		countdownThread.start();
		countupThread.start();

	}
}