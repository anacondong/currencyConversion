package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Ittipol
 *
 */
@RestController
public class HelloController {
		
		@RequestMapping("/")
		public String hello(){
			return "CurrencyConversion by Mr.Ittipol !";
		}
	
}
