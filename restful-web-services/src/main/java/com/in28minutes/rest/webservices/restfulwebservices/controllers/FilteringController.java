package com.in28minutes.rest.webservices.restfulwebservices.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.in28minutes.rest.webservices.restfulwebservices.entities.SomeBean;

@RestController
public class FilteringController {

	//field1,field2
	@GetMapping("/filtering")
	public MappingJacksonValue	restrieveSomeBean() {
		SomeBean someBean = new SomeBean("value1", "value2", "value3");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		mapping.setFilters(filters );
		
		return mapping;
//		return new SomeBean("value1", "value2", "value3");
	}

	//field2,field3
	@GetMapping("/filtering-list")
	public MappingJacksonValue	restrieveListOfSomeBeans() {
		List<SomeBean> list = Arrays.asList(new SomeBean("value1", "value2", "value3"), new SomeBean("value21", "value22", "value23"));
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(list);
		mapping.setFilters(filters );
		
		return mapping;
//		return new SomeBean("value1", "value2", "value3");
	}
	
//	@GetMapping("/filtering-list")
//	public List<SomeBean>restrieveListOfSomeBeans() {
//		return Arrays.asList(new SomeBean("value1", "value2", "value3"), new SomeBean("value21", "value22", "value23"));
//	}

}
