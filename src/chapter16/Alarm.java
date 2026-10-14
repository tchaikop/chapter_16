package chapter16;

public class Alarm extends Thread{

	@Override
	public void run() {
		for(int i=1; i<=3;i++) {
			try {
				Thread.sleep(2000);
				System.out.println("알람  삐삐");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println("알람  삐삐");
		}
	}

	
}
