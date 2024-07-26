package com.ckw.incometax;

public class IncomeTaxResponse {
	private double taxAmount;
	private String taxSlab;

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

	public String getTaxSlab() {
		return taxSlab;
	}

	public void setTaxSlab(String taxSlab) {
		this.taxSlab = taxSlab;
	}
}
