package com.glue.tecnical.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.glue.tecnical.model.Product;

@Service
public interface WeighService {

	public Double multiply(Double weigh, Integer integer);

	public Double addAllWeights(Map<Double, Integer> mapToAddAllWeights);

	public Map<Double, Integer> buildMap(Product product);

	public Map<Double, Integer> buildMap(List<Product> listProducts);
}
