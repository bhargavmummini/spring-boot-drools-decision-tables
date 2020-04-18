package com.bhargav.drools.decisiontables.facts;

public class WealthPredictabilityRequest {

	private Integer monthlyIncome;
	private WealthPredictabilityResponse predictedWealth;

	public Integer getMonthlyIncome() {
		return monthlyIncome;
	}

	public WealthPredictabilityResponse getPredictedWealth() {
		return predictedWealth;
	}

	public void setMonthlyIncome(final Integer monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public void setPredictedWealth(final String status) {
		this.predictedWealth = new WealthPredictabilityResponse(status);
	}

}
