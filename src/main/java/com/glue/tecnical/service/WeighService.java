package com.glue.tecnical.service;

import org.springframework.stereotype.Service;

import com.glue.tecnical.dto.WeighDTO;
import com.glue.tecnical.model.Product;

@Service
public interface WeighService {

	public Double addAllWeights(Product product, WeighDTO weigh);

}
