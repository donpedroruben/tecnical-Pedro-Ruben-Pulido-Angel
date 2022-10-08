package com.glue.tecnical.controller;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.glue.tecnical.dto.WeighDTO;
import com.glue.tecnical.model.Product;
import com.glue.tecnical.service.impl.LoadDataServiceImpl;
import com.glue.tecnical.service.impl.OrderServiceImpl;
import com.glue.tecnical.service.impl.WeighServiceImpl;

public class OrderControllerTest {

	@InjectMocks
	private LoadDataServiceImpl loadDataServiceImpl = Mockito.spy(new LoadDataServiceImpl());

	@InjectMocks
	private OrderServiceImpl orderServiceImpl = Mockito.spy(new OrderServiceImpl());

	@InjectMocks
	private WeighServiceImpl weighServiceImpl = Mockito.spy(new WeighServiceImpl());

	@InjectMocks
	OrderController orderController;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void orderTest() throws Exception {
		WeighDTO weigh = new WeighDTO(80, 20);
		List<Product> productList = orderController.orderByWeigh(weigh);
		assertNotNull(productList);
	}

}
