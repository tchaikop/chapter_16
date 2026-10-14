package chapter16;

public class Mainclass2 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) {
			
			System.out.println( i);
			
			try {
				Thread.sleep(1000);   // 1초간 cpu휴식
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  // 단위: 밀리 세컨드 -> 1초

	}

}
}