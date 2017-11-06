package org.accenture.strategy.compresor.impl;

import org.accenture.strategy.Data;
import org.accenture.strategy.compresor.Compressor;

public class Rar implements Compressor {
	public Data compress (Data data) {
		return new Data ("RAR - " + data.getData());
	}
}
