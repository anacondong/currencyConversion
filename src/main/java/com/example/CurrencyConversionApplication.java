package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author Ittipol
 *
 */
//@EnableAutoConfiguration
@SpringBootApplication
public class CurrencyConversionApplication {
	
	// Sample API
	// http://localhost:8081/CurrencyConversion/currencys/
	// http://localhost:8081/CurrencyConversion/currency/findName/CNY
	// http://localhost:8081/CurrencyConversion/currency/11
	
	// Logic API
	// http://localhost:8081/CurrencyConversion/currency/cheaperRateSelling
	// http://localhost:8081/CurrencyConversion/currency/expensiveRateBuying
	
	// admin page
	// http://localhost:9000/admin/metrics
	// http://localhost:9000/admin/trace
	// http://localhost:9000/admin/env
	// http://localhost:9000/admin/beans
	// http://localhost:9000/admin/dump
	// http://localhost:9000/admin/mappings
	// ssh -p 2000 user@127.0.0.1
	// dashboard
	
	
	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionApplication.class, args);
	}
	
}




