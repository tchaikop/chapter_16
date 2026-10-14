package chapter16;

public class Main001 {

	public static void main(String[] args) {
	
		HelloThread h1 = new HelloThread();
		
		HiThread h2 = new HiThread();
		
		
		
		
		h1.start();
		h2.start();

	}

}
