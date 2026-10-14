package chapter16;

public class MainHosre {

	public static void main(String[] args) {
		
			System.out.println("경주마 경기가 시작 됩니다::=====");
			
			
			Horse01 h1 = new Horse01("번개");
			Horse01 h2 = new Horse01("바람");
			Horse01 h3 = new Horse01("대추");
			Horse01 h4 = new Horse01("사과");
			
			//  경주마 달리기 시작.동시에
			
			h1.start();
			h2.start();
			h3.start();
			h4.start();
			
			
			try {
				             // 모든 슬레드가 끝날때 까지 메인 슬래드가 기다리기
				h1.join();
				h2.join();
				h3.join();
				h4.join();  // 모든 경주마가 결승선 통과 후에 메인 슬레드가 실행
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			System.out.println("경주마가 다 달렸습니다::=====");
			
			
	}

}
