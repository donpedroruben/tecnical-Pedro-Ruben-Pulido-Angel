package com.glue.tecnical.service.impl;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glue.tecnical.dto.WeighDTO;
import com.glue.tecnical.model.Product;
import com.glue.tecnical.service.OrderService;
import com.glue.tecnical.service.WeighService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	WeighService weighService;

	public List<Product> orderList(List<Product> listProducts, WeighDTO weigh) {
		for (Product product : listProducts) {
			product.setWeighing(weighService.addAllWeights(product, weigh));
		}

		listProducts.sort(Comparator.comparing(Product::getWeighing).reversed());

		return listProducts;
	}

}
