package chapter16;

public class Horse01 extends Thread{
	
	private String name;
	private int distance = 0;
	
	public Horse01(String name) { // 객체 생성시 받기 위해
		this.name = name;
	}

	public String getHorseName() {
		return name;
	}

	public void setHorseName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while(distance < 100) { // 100미터 라고하고, 넘으면 결승선통과
			//  1~5 미터 사이에 랜덤한 거리로 전진
		int step = (int)(Math.random()*5)+1;
		
		distance = distance + step;
		
		if(distance > 100) {
			distance = 100;
		}
		
		// 트랙  그래픽 표시
		String track = "";  
		for(int i=0;i<distance;i++) {
			track = track + ">";
		}
		System.out.println("[" + name + "]" + distance + "m"  + track);
		
		
		
		
		
		
		try {   
			Thread.sleep(200);    // 게임이 넘 빨리 끝나지 않게
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
		
		System.out.println("[" + this.name + "] 경주마 결승점 통과 !");
		
	}
	
	
	
	
	

}
