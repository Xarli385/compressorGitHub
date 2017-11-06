package org.accenture.strategy;

import org.accenture.strategy.compresor.impl.Rar;
import org.accenture.strategy.compresor.impl.Zip;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context compressorContext;
		compressorContext = new Context (new Zip());
		
		Data data = compressorContext.apply(new Data ("Hello"));
		System.out.println(data.getData());
		
		compressorContext.setStrategy(new Rar());
		data = compressorContext.apply(new Data("GoodBye"));
		System.out.println(data.getData());

	}

}
