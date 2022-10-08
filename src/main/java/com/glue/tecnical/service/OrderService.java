package com.glue.tecnical.service;

import java.util.List;

import com.glue.tecnical.dto.WeighDTO;
import com.glue.tecnical.model.Product;

public interface OrderService {

	public List<Product> orderList(List<Product> listProducts, WeighDTO weigh);

}
