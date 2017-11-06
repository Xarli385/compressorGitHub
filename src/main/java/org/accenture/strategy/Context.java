package org.accenture.strategy;

import org.accenture.strategy.compresor.Compressor;

public class Context {
	private Compressor strategy;
	
	public Context (Compressor compressor) {
		strategy = compressor;
		
	}
	
	public void setStrategy(Compressor compressor) {
		strategy = compressor;
	}
	
	public Data apply (Data data) {
		return strategy.compress(data);
	}

}
