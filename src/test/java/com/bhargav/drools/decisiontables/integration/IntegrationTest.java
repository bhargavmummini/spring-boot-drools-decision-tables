package com.bhargav.drools.decisiontables.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@KarateOptions
public class IntegrationTest implements InitializingBean {

	@LocalServerPort
	int port;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.setProperty("local.server.port", String.valueOf(port));
	}

	@Test
	void testParallel() {
		final Results results = Runner.path("classpath:com").tags("~@ignore").parallel(5);
		assertEquals(0, results.getFailCount(), results.getErrorMessages());
	}
}
