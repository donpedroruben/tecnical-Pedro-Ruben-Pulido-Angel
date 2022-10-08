package com.glue.tecnical.model;

import java.util.Map;

public class Product {

	private Long id;
	private String name;
	private Integer salesUnits;
	private Map<String, Integer> stocks;
	private Double weighing;

	public Product() {
		super();
	}

	public Product(Long id, String name, Integer salesUnits, Map<String, Integer> stocks, Double weighing) {
		super();
		this.id = id;
		this.name = name;
		this.salesUnits = salesUnits;
		this.stocks = stocks;
		this.weighing = weighing;
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

	public Double getWeighing() {
		return weighing;
	}

	public void setWeighing(Double weighing) {
		this.weighing = weighing;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", salesUnits=" + salesUnits + ", stocks=" + stocks
				+ ", weighing=" + weighing + "]";
	}

}
