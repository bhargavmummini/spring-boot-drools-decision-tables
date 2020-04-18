package com.bhargav.drools.decisiontables.service;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import com.bhargav.drools.decisiontables.facts.WealthPredictabilityRequest;

@Service
public class WealthPredictabilityService {

	private final KieContainer kieContainer;

	public WealthPredictabilityService(final KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public void predictWealth(final List<WealthPredictabilityRequest> requests) {
		final KieSession kSession = kieContainer.newKieSession("ksession-wealth");
		requests.stream().forEach(kSession::insert);
		kSession.fireAllRules();
	}

	public void predictWealth(final WealthPredictabilityRequest request) {
		final KieSession kSession = kieContainer.newKieSession("ksession-wealth");
		kSession.insert(request);
		kSession.fireAllRules();
	}
}
