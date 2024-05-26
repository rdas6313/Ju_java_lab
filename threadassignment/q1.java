class Task implements Runnable{
	
	private boolean add;

	public Task(boolean add){
		this.add = add;
	}

	@Override
	public void run(){

		if(add){
			Data.data += 1;
			System.out.println(Thread.currentThread().getName() + " operation add:" + add + " Data: " + Data.data);

		}
		else{
			Data.data -= 1;
			System.out.println(Thread.currentThread().getName() + " operation add:" + add + " Data: " + Data.data);

		}

		
	}
}

class Data{
	public static volatile int data = 10;
}

public class q1{
	public static void main(String[] args) {
		Thread t1 = new Thread(new Task(true));
		Thread t2 = new Thread(new Task(false));
		t1.start();
		t2.start();
	}
}