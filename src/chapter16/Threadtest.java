package chapter16;

public class Threadtest {

	public static void main(String[] args) {
		// thread를 사용하지 않는 경우
		
		
		 Thread t1 = new Thread(()->{
			 for(int i=1;i<=5;i++){
					System.out.println("==" + i);
			 } 
				 
		 } );
		 
		 
		

		 Thread t2 = new Thread(()->{
	for(int i=1;i<=5;i++){
	System.out.println("+++" + i);

}
});
		 
		 t1.start();
		 t2.start();
		 
}
}