package org.accenture.builder;

public class AlgorithmBuilder {
	private String name;
	private int maximumNumberOfEvaluations;
	private int maximumComputingTime;
	private int memoryRequirement;
	private String operator;

	public AlgorithmBuilder() {

	}

	public AlgorithmBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public AlgorithmBuilder setMaximumNumberOfEvaluations(int maximumNumberOfEvaluations) {
		this.maximumNumberOfEvaluations = maximumNumberOfEvaluations;
		return this;
	}

	public AlgorithmBuilder setMaximumComputingTime(int maximumComputingTime) {
		this.maximumComputingTime = maximumComputingTime;
		return this;
	}

	public AlgorithmBuilder setMaximumRequirement(int memoryRequirement) {
		this.memoryRequirement = memoryRequirement;
		return this;
	}

	public AlgorithmBuilder setOperator(String operator) {
		this.operator = operator;
		return this;
	}
	
	public Algorithm build () {
		return new Algorithm(name, maximumNumberOfEvaluations, maximumComputingTime, memoryRequirement, operator);

	}
	
}
