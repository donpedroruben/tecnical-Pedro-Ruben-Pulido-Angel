package com.glue.tecnical.service.impl;

import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.glue.tecnical.dto.WeighDTO;
import com.glue.tecnical.model.Product;
import com.glue.tecnical.service.WeighService;

@Service
public class WeighServiceImpl implements WeighService {

	public Double addAllWeights(Product product, WeighDTO weigh) {
		Double result = weigh.getWeighSalesUnits() * product.getSalesUnits();

		Iterator<String> iterator = product.getStocks().keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Integer value = product.getStocks().get(key);
			result += value * weigh.getWeighStocks();
		}

		return result;
	}

}
