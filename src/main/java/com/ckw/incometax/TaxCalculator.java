package com.ckw.incometax;

import org.springframework.stereotype.Service;

@Service
public class TaxCalculator {
	public IncomeTaxResponse calculateTax(IncomeTaxRequest request) {
        double income = request.getIncome();
        double taxAmount = 0.0;

        if (income > 5000 && income <= 20000) {
        	taxAmount = (income - 5000) * 0.01;
        	
        } else if (income > 20000 && income <= 35000) {
        	taxAmount = (income - 20000) * 0.03;
        	
        } else if (income > 35000 && income <= 50000) {
        	taxAmount = (income - 35000) * 0.06;
        	
        } else if (income > 50000 && income <= 70000) {
        	taxAmount = (income - 50000) * 0.11;
        	
        } else if (income > 70000 && income <= 100000) {
        	taxAmount = (income - 70000) * 0.19;
        	
        } else if (income > 100000 && income <= 400000) {
        	taxAmount = (income - 100000) * 0.25;
        	
        } else if (income > 400000 && income <= 600000) {
        	taxAmount = (income - 400000) * 0.26;
        	
        } else if (income > 600000 && income <= 2000000) {
        	taxAmount = (income - 600000) * 0.28;
        	
        } else if (income > 2000000) {
        	taxAmount = income * 0.3;
        }

        IncomeTaxResponse response = new IncomeTaxResponse();
        response.setTaxAmount(taxAmount);
        response.setTaxSlab(findTaxSlab(taxAmount));
        return response;
    }
	
	public String findTaxSlab(double taxAmount) {
		String taxSlab = "A";
		
		if (taxAmount > 0 && taxAmount <= 150) {
			taxSlab = "B";
        	
        } else if (taxAmount > 0 && taxAmount <= 150) {
        	taxSlab = "C";
        	
        } else if (taxAmount > 150 && taxAmount <= 450) {
        	taxSlab = "D";
        	
        } else if (taxAmount > 600 && taxAmount <= 900) {
        	taxSlab = "E";
        	
        } else if (taxAmount > 1500 && taxAmount <= 2200) {
        	taxSlab = "F";
        	
        } else if (taxAmount > 3700 && taxAmount <= 5700) {
        	taxSlab = "G";
        	
        } else if (taxAmount > 84400 && taxAmount <= 52000) {
        	taxSlab = "H";
        	
        } else if (taxAmount > 136400 && taxAmount <= 392000) {
        	taxSlab = "I";
        	
        } else if (taxAmount > 528400) {
        	taxSlab = "J";
        }
		
		return taxSlab;
	}
}
