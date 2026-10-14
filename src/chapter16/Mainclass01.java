package chapter16;

public class Mainclass01 {

	public static void main(String[] args) {
		Alarm alarm = new Alarm();
		alarm.start();
		
		for(int i=6; i>=1;i--) {
			System.out.println("남은시간: " + i + "초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
