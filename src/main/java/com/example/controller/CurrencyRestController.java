/**
 * 
 */
package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CurrencyDao;
import com.example.entity.Currency;
import com.example.service.CurrencyService;

/**
 * @author Ittipol
 *
 */
@RestController
public class CurrencyRestController {
	@Autowired CurrencyDao repo;
	@Autowired CurrencyService currencyService;
	@RequestMapping("/currencys")
	public List<Currency> listCurrencys(){
		return repo.findAll();
	}
	
	@RequestMapping("/currency/{id}")
	public Currency getById(@PathVariable Integer id){
		return repo.findOne(id);
	}
	
	@RequestMapping("/currency/findName/{name}")
	public List<Currency> findName(@PathVariable String name){
		return repo.findByName(name);
	}
	
	
	 // offer cheaper rate for large volume selling 
	@RequestMapping("/currency/cheaperRateSelling")
	public List<Currency> cheaperRateHandler(){
		return currencyService.cheaperRate();
	}
	
	
	 // more expensive rate for small volume buying
	@RequestMapping("/currency/expensiveRateBuying")
	public List<Currency> expensiveRateHandler(){
		return currencyService.expensiveRate();
	}
	
	
}
