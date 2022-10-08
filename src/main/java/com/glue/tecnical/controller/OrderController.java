package com.glue.tecnical.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glue.tecnical.dto.WeighDTO;
import com.glue.tecnical.model.Product;
import com.glue.tecnical.service.LoadDataService;
import com.glue.tecnical.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderController {

	@Autowired
	LoadDataService loadDataService;

	@Autowired
	OrderService orderService;

	@GetMapping("/")
	public List<Product> orderByWeigh(@RequestBody WeighDTO weigh) throws Exception {
		List<Product> productList = loadDataService.readFile(new File("src/main/resources/database.csv"));
		return orderService.orderList(productList, weigh);
	}
}
