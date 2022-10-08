package com.glue.tecnical.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;

import com.glue.tecnical.model.Product;

@Service
public interface LoadDataService {

	public List<Product> readFile(File file);

}
