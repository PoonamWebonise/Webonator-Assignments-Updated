package com.javaAssignments.myThreads;

public class ThreadTest {

	public static void main(String[] args) {
		
		Fork[] forks=new Fork[5];
		for(int i=0;i<5;i++)
			forks[i]= new Fork();
		
		Philosopher p1=new Philosopher(1,forks[0],forks[4]);
		Thread philosopher_1=new Thread(p1);
		philosopher_1.start();
		
		Philosopher p2=new Philosopher(2,forks[1],forks[0]);
		Thread philosopher_2=new Thread(p2);
		philosopher_2.start();
		
		Philosopher p3=new Philosopher(3,forks[2],forks[1]);
		Thread philosopher_3=new Thread(p3);
		philosopher_3.start();
		
		Philosopher p4=new Philosopher(4,forks[3],forks[2]);
		Thread philosopher_4=new Thread(p4);
		philosopher_4.start();
		
		Philosopher p5=new Philosopher(5,forks[4],forks[3]);
		Thread philosopher_5=new Thread(p5);
		philosopher_5.start();
	}

}

class Fork {
	int id;
	boolean status;
}

class Philosopher implements Runnable {

	int id;
	Fork left_fork,right_fork;
	
	Philosopher(int id, Fork left_fork, Fork right_fork)
	{
		this.id=id;
		this.left_fork=left_fork;
		this.right_fork=right_fork;
	}
	public void run() {
//		System.out.println(this.id+" Thread Started");
		try {
			while(true)
			{
				this.havingFood();
//				Thread.sleep(1000);
				this.waitingForFood();
//				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized void havingFood() throws InterruptedException
	{
		if(this.left_fork.status==false && this.right_fork.status==false)
		{
					this.left_fork.status=true;
					this.right_fork.status=true;
					System.out.println(this.id+" Philosopher is Eating");
					Thread.sleep(1000);
					System.out.println(this.id+" Philosopher done eating");
				}
				notify();
	}
	
	synchronized void waitingForFood() throws InterruptedException{
	
		left_fork.status=false;
		right_fork.status=false;
		System.out.println(this.id+" philosopher is thinking");
		if(this.left_fork.status==true && this.right_fork.status==true)
		{
			wait();
		}
		System.out.println(this.id+" philosopher is done thinking");
	}
	
}