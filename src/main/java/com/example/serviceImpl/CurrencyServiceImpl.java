package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CurrencyDao;
import com.example.entity.Currency;
import com.example.service.CurrencyService;
/**
 * @author Ittipol
 *
 */
@Service
public class CurrencyServiceImpl implements CurrencyService {
	
	@Autowired
	private CurrencyDao currencyDao;


//	@Override
//	@Transactional(propagation = Propagation.REQUIRED, readOnly = false,isolation=Isolation.READ_UNCOMMITTED)


	@Override
	public List<Currency> cheaperRate(){
		return currencyDao.findAllByOrderBySellingRatesAscVolumnDesc();
	}
	
	@Override
	public List<Currency> expensiveRate(){
		return currencyDao.findAllByOrderByBuyingRatesDescVolumnAsc();
	}
	
	
	
	

}
