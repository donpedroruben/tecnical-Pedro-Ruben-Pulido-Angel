package com.glue.tecnical.model;

import java.util.Map;

public class Product {

	private Long id;
	private String name;
	private Integer salesUnits;
	private Map<String, Integer> stocks;

	public Product() {
		super();
	}

	public Product(Long id, String name, Integer salesUnits, Map<String, Integer> stocks) {
		super();
		this.id = id;
		this.name = name;
		this.salesUnits = salesUnits;
		this.stocks = stocks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalesUnits() {
		return salesUnits;
	}

	public void setSalesUnits(Integer salesUnits) {
		this.salesUnits = salesUnits;
	}

	public Map<String, Integer> getStocks() {
		return stocks;
	}

	public void setStocks(Map<String, Integer> stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", salesUnits=" + salesUnits + ", stocks=" + stocks + "]";
	}

}
