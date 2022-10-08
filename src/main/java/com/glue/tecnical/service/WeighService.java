package com.glue.tecnical.service;

import com.glue.tecnical.dto.WeighDTO;
import com.glue.tecnical.model.Product;

public interface WeighService {

	public Double addAllWeights(Product product, WeighDTO weigh);

}
