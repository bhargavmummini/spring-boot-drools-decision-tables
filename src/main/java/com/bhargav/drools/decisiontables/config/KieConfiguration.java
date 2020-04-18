package com.bhargav.drools.decisiontables.config;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KieConfiguration {
	@Bean
	public KieContainer kieContainer() {
		final KieServices ks = KieServices.Factory.get();
		return ks.getKieClasspathContainer();
	}
}
