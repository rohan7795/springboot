package com.springboot.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {

	private String[] cources = { "jws", "e2e porject", "angular" };

	private int count;

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("in read method");
		if (count < cources.length) {
			return cources[count++];
		} else {
			count = 0;
		}
		return null;
	}
	

}
