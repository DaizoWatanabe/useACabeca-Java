class ThreadTwo implements Runnable {
	
	Accum a = Accum.getAccum();
	
	public void run() {			
		
		for(int x=0; x<99; x++) {			
			try {
				Thread.sleep(50);
			} catch(InterruptedException ex) {}
				a.updateCounter(1);
		}
		System.out.println("two " + a.getCount());
	}
}
