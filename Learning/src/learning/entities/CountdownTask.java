package learning.entities;

public class CountdownTask implements Runnable {
	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println("Contagem regressiva: " + i);
			try {
				Thread.sleep(1000); // Aguarda 1 segundo entre cada contagem
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}