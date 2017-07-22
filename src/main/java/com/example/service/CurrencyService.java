package com.example.service;

import java.util.List;

import com.example.entity.Currency;
/**
 * @author Ittipol
 *
 */
public interface CurrencyService {

	public List<Currency> cheaperRate();
	public List<Currency> expensiveRate();
}
