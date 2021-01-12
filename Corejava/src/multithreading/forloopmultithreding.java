package multithreading;
class Threads extends Thread{
	
	public void run(){
		boolean flag=false;
				synchronized(this){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	

	for(int i=0;i<10;i++){
		System.out.println(Thread.currentThread()+"superclass of run method is :"+i);
}
		}
	}
}
class Threads1 extends Thread{
	public void run(){
		synchronized(this){
			notify();	
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread()+" Subclass of run method is :"+i);	
		}
	}
	}
}
public class forloopmultithreding {

	public static void main(String[] args) {
Threads t=new Threads();
Threads1 t1=new Threads1();
t.start();
t1.start();
	}
}
