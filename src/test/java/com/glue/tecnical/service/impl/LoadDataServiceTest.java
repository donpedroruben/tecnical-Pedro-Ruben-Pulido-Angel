package com.glue.tecnical.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.junit.Test;

import com.glue.tecnical.model.Product;

public class LoadDataServiceTest {

	private LoadDataServiceImpl loadDataService;

	@Test
	public void readFile() {
		List<Product> listProducts = loadDataService.readFile(new File("src/test/resources/databaseTest.csv"));
		assertNotNull(listProducts);
		assertTrue(!listProducts.isEmpty());
	}

}
