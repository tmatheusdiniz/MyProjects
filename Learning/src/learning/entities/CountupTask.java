package learning.entities;

public class CountupTask implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Contagem progressiva: " + i);
			try {
				Thread.sleep(1500); // Aguarda 1.5 segundos entre cada contagem
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
