package com.glue.tecnical.dto;

public class WeighDTO {

	private double weighSalesUnits;
	private double weighStocks;

	public WeighDTO() {
		super();
	}

	public WeighDTO(double weighSalesUnits, double weighStocks) {
		super();
		this.weighSalesUnits = weighSalesUnits;
		this.weighStocks = weighStocks;
	}

	public double getWeighSalesUnits() {
		return weighSalesUnits;
	}

	public void setWeighSalesUnits(double weighSalesUnits) {
		this.weighSalesUnits = weighSalesUnits;
	}

	public double getWeighStocks() {
		return weighStocks;
	}

	public void setWeighStocks(double weighStocks) {
		this.weighStocks = weighStocks;
	}

	@Override
	public String toString() {
		return "WeighDTO [weighSalesUnits=" + weighSalesUnits + ", weighStocks=" + weighStocks + "]";
	}

}
