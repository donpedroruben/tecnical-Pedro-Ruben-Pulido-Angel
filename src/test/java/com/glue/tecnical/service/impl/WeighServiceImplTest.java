package com.glue.tecnical.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.glue.tecnical.service.WeighService;

public class WeighServiceImplTest {

	private WeighService weighService;

	@Test
	public void multiplyTest1() {
		Double weigh = 10.0;
		Integer integer = 2;
		Double result = weighService.multiply(weigh, integer);

		assertNotNull(result);
		assertTrue(result == 20);
	};

	@Test
	public void multiplyTest2() {
		Double weigh = 0.5;
		Integer integer = 10;
		Double result = weighService.multiply(weigh, integer);

		assertNotNull(result);
		assertTrue(result == 5);
	};

	@Test
	public void addAllWeights() {
		Map<Double, Integer> mapToAddAllWeights = new HashMap<Double, Integer>();
		mapToAddAllWeights.put(100.0, 20);
		mapToAddAllWeights.put(80.0, 2);
		mapToAddAllWeights.put(80.0, 5);
		mapToAddAllWeights.put(80.0, 10);

		Double result = weighService.addAllWeights(mapToAddAllWeights);

		assertTrue(result == 3360);
	}

}
