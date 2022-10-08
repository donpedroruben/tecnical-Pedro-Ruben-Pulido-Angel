package com.glue.tecnical.service.impl;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.glue.tecnical.dto.WeighDTO;
import com.glue.tecnical.model.Product;

public class WeighServiceImplTest {

	@InjectMocks
	private WeighServiceImpl weighServiceImpl;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void addAllWeights() {
		WeighDTO weigh = new WeighDTO(80, 20);

		Map<String, Integer> stocks1 = new HashMap<String, Integer>();
		stocks1.put("S", 2);
		stocks1.put("M", 5);
		stocks1.put("L", 10);
		Product product1 = new Product(1L, "Test 1", 200, stocks1, null);

		Double result = weighServiceImpl.addAllWeights(product1, weigh);

		assertTrue(result == 16340);
	}

}
