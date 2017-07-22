/**
 * 
 */
package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Currency;

/**
 * @author Ittipol
 *
 */

@RepositoryRestResource
public interface CurrencyDao extends JpaRepository<Currency,Integer>{
	
	public List<Currency> findByName(@Param("name") String name);
	public List<Currency> findAllByOrderBySellingRatesAscVolumnDesc();
	public List<Currency> findAllByOrderByBuyingRatesDescVolumnAsc();

	
}
