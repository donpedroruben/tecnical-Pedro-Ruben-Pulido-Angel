package com.glue.tecnical.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.glue.tecnical.dto.WeighDTO;
import com.glue.tecnical.model.Product;
import com.glue.tecnical.service.OrderService;

public class OrderServiceImplTest {

	private OrderService orderService;

	@Test
	public void orderListTest1() {
		List<Product> listProducts = new ArrayList<Product>();

		Map<String, Integer> stocks1 = new HashMap<String, Integer>();
		stocks1.put("S", 2);
		stocks1.put("M", 5);
		stocks1.put("L", 10);
		Product product1 = new Product(1L, "Test 1", 100, stocks1);
		listProducts.add(product1);

		Map<String, Integer> stocks2 = new HashMap<String, Integer>();
		stocks1.put("S", 10);
		stocks1.put("M", 5);
		stocks1.put("L", 2);
		Product product2 = new Product(2L, "Test 2", 50, stocks2);
		listProducts.add(product2);

		WeighDTO weigh = new WeighDTO(20, 80);
		// Product1: 3360
		// Product2: 2360
		List<Product> listOrdered = orderService.orderList(listProducts, weigh);
		assertNotNull(listOrdered);
		assertTrue("Test 1".equalsIgnoreCase(listOrdered.get(0).getName()));
		assertTrue("Test 2".equalsIgnoreCase(listOrdered.get(1).getName()));
	}

	@Test
	public void orderListTest2() {
		List<Product> listProducts = new ArrayList<Product>();

		Map<String, Integer> stocks1 = new HashMap<String, Integer>();
		stocks1.put("S", 2);
		stocks1.put("M", 5);
		stocks1.put("L", 10);
		Product product1 = new Product(1L, "Test 1", 20, stocks1);
		listProducts.add(product1);

		Map<String, Integer> stocks2 = new HashMap<String, Integer>();
		stocks1.put("S", 10);
		stocks1.put("M", 5);
		stocks1.put("L", 2);
		Product product2 = new Product(2L, "Test 2", 50, stocks2);
		listProducts.add(product2);

		WeighDTO weigh = new WeighDTO(80, 20);

		// Product1: 1940
		// Product2: 4340
		List<Product> listOrdered = orderService.orderList(listProducts, weigh);
		assertNotNull(listOrdered);
		assertTrue("Test 2".equalsIgnoreCase(listOrdered.get(0).getName()));
		assertTrue("Test 1".equalsIgnoreCase(listOrdered.get(1).getName()));
	}

}
