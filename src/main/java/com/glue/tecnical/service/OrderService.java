package com.glue.tecnical.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.glue.tecnical.dto.WeighDTO;
import com.glue.tecnical.model.Product;

@Service
public interface OrderService {
	public List<Product> orderList(List<Product> listProducts, WeighDTO weigh);
}
