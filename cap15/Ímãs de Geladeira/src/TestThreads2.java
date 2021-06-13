
public class TestThreads2 {
	
	 public static void main(String[] args) {
	        ThreadOne t1 = new ThreadOne();
	        ThreadTwo t2 = new ThreadTwo();
	        Thread one = new Thread(t1);
	        Thread two = new Thread(t2);
	        two.start();
	        one.start();
	    }
}
