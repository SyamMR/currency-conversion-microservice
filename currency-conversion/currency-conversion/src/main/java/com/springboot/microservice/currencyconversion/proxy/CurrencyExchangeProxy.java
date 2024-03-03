package com.springboot.microservice.currencyconversion.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.microservice.currencyconversion.entity.CurrencyConversion;

	@FeignClient(name="currency-exchange")
	public interface CurrencyExchangeProxy {
		
		@GetMapping("/currency-exchange/from/{from}/to/{to}")
		public CurrencyConversion retrieveExchangeValue(
				@PathVariable("from") String from,
				@PathVariable("to") String to);

	}


