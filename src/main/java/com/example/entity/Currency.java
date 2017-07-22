/**
 * 
 */
package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Ittipol
 *
 */
@Entity
public class Currency {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private String detail;
	private double buyingRates;
	private double sellingRates;
	private double volumn;
	private Date chgDt;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBuyingRates() {
		return buyingRates;
	}
	public void setBuyingRates(double buyingRates) {
		this.buyingRates = buyingRates;
	}
	public double getSellingRates() {
		return sellingRates;
	}
	public void setSellingRates(double sellingRates) {
		this.sellingRates = sellingRates;
	}
	public Date getChgDt() {
		return chgDt;
	}
	public void setChgDt(Date chgDt) {
		this.chgDt = chgDt;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public double getVolumn() {
		return volumn;
	}
	public void setVolumn(double volumn) {
		this.volumn = volumn;
	}
	public Currency(){}
	
	
	@Override
	public String toString() {
		return "Currency [id=" + id + ", name=" + name + ", detail=" + detail + ", buyingRates=" + buyingRates
				+ ", sellingRates=" + sellingRates + ", volumn=" + volumn + ", chgDt=" + chgDt + "]";
	}
	
	
	
	
	

}
