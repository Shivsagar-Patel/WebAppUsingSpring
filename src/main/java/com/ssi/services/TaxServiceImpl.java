package com.ssi.services;

import org.springframework.stereotype.Service;

import com.ssi.models.TaxModel;

@Service
public class TaxServiceImpl implements TaxService {
	public void computeTax(TaxModel model) {
		int tax = 0;
		if (model.getIncome() >= 500000) {
			tax = model.getIncome() * 15 / 100;
		} else {
			tax = model.getIncome() * 10 / 100;
		}
		model.setTax(tax);
	}
}
