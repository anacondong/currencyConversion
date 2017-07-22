package com.example;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.dao.CurrencyDao;
import com.example.entity.Currency;
import com.example.service.CurrencyService;
/**
 * @author Ittipol
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CurrencyConversionApplicationTests {

	@Autowired CurrencyDao repo;
	
	@Autowired CurrencyService currencyService;
	
	
	@Test
	public void getList() {
		// get all currencys
		List<Currency> currencys = repo.findAll();
		for(Currency cr : currencys){
			System.out.println(cr.toString()); 
		}
	}
	
	
	@Test
	public void cheaperRate(){
		
		List<Currency> currencys = currencyService.cheaperRate();
		assertEquals(currencys.get(0).getName(),"IDR" );
	}
	
	
	@Test
	public void expensiveRate(){
		List<Currency> currencys = currencyService.expensiveRate();
		assertEquals(currencys.get(0).getName(),"GBP");
	}
	

}
