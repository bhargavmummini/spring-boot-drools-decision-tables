package com.bhargav.drools.decisiontables.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhargav.drools.decisiontables.facts.WealthPredictabilityRequest;
import com.bhargav.drools.decisiontables.service.WealthPredictabilityService;

@RestController
public class WealthPredictabilityController {
	private final WealthPredictabilityService wealthPredictabilityService;

	public WealthPredictabilityController(final WealthPredictabilityService wealthPredictabilityService) {
		this.wealthPredictabilityService = wealthPredictabilityService;
	}

	@PostMapping("predicateWealths")
	public List<WealthPredictabilityRequest> predicateWealth(
			@RequestBody final List<com.bhargav.drools.decisiontables.facts.WealthPredictabilityRequest> request) {
		wealthPredictabilityService.predictWealth(request);
		return request;
	}

	@PostMapping("predicateWealth")
	public WealthPredictabilityRequest predicateWealth(@RequestBody final WealthPredictabilityRequest request) {
		wealthPredictabilityService.predictWealth(request);
		return request;
	}
}
