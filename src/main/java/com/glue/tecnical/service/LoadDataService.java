package com.glue.tecnical.service;

import java.io.File;
import java.util.List;

import com.glue.tecnical.model.Product;

public interface LoadDataService {

	public List<Product> readFile(File file);

}
