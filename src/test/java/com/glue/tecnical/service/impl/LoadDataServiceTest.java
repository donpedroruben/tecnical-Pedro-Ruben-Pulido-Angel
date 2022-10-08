package com.glue.tecnical.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.glue.tecnical.model.Product;

public class LoadDataServiceTest {

	@InjectMocks
	private LoadDataServiceImpl loadDataServiceImpl;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void readFile() {
		List<Product> listProducts = loadDataServiceImpl.readFile(new File("src/test/resources/databaseTest.csv"));
		assertNotNull(listProducts);
		assertTrue(!listProducts.isEmpty());
	}

}
