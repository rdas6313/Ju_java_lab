import java.util.concurrent.*;
class Reader implements Runnable{

	private Semaphore readerSemaphore;
	private Semaphore writerSemaphore;

	public Reader(Semaphore rSemaphore,Semaphore wSemaphore){
		readerSemaphore = rSemaphore;
		writerSemaphore = wSemaphore;
	}

	public void run(){

		try{

			readerSemaphore.acquire();

			Data.readerCount++;

			if(Data.readerCount == 1)
				writerSemaphore.acquire();

		}catch(Exception e){
			System.out.println(e);
		}finally{
			readerSemaphore.release();
		}
		
		System.out.println(Thread.currentThread().getName() + ": " + Data.data);
		
		try{

			readerSemaphore.acquire();

			Data.readerCount--;
			if(Data.readerCount == 0){
				writerSemaphore.release();
			}

		}catch(Exception e){
			System.out.println(e);
		}finally{
			readerSemaphore.release();
		}
		
	}
}

class Writer implements Runnable{

	private Semaphore writerSemaphore;

	public Writer(Semaphore wSemaphore){
		writerSemaphore = wSemaphore;
	}

	public void run(){

		try{

			writerSemaphore.acquire();

			Data.data += 1;
			System.out.println(Thread.currentThread().getName() + ": updated data");

		}catch(Exception e){
			System.out.println(e);
		}finally{
			writerSemaphore.release();
		}

		

	}
}

class Data{
	public volatile static int data = 10;
	public volatile static int readerCount = 0;

}

public class q3{
	public static void main(String[] args) {
		Semaphore rSemaphore = new Semaphore(1,true);
		Semaphore wSemaphore = new Semaphore(1,true);
		System.out.println("Initial Data: " + Data.data);
		Thread t1 = new Thread(new Reader(rSemaphore,wSemaphore),"Reader 1");
		Thread t2 = new Thread(new Writer(wSemaphore),"Writer 1");
		Thread t3 = new Thread(new Reader(rSemaphore,wSemaphore),"Reader 2");
		Thread t4 = new Thread(new Writer(wSemaphore),"Writer 2");
		Thread t5 = new Thread(new Reader(rSemaphore,wSemaphore),"Reader 3");

		t5.start();
		t1.start();
		t3.start();
		t4.start();
		t2.start();

	}
}