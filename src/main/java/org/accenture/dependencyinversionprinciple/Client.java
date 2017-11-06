package org.accenture.dependencyinversionprinciple;

public class Client {

	public static void main(String[] args) {
		
		Worker worker1 = new Worker ();
		SuperWorker superWorker = new SuperWorker();
		MiniWorker miniWorker = new MiniWorker();
		Worker worker2 = new Worker();
		
		
		Manager manager = new Manager ();
		
		manager.setWorker(worker1);
		manager.manage();
		
		
		manager.setWorker(superWorker);
		manager.manage();
		
		
		manager.setWorker(worker2);
		manager.manage();
		
		
		manager.setWorker(miniWorker);
		manager.manage();
	}

}
