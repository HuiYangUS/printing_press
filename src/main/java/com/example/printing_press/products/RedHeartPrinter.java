package com.example.printing_press.products;

import org.springframework.stereotype.Component;

import com.example.printing_press.services.RedPrinter;

@Component
public class RedHeartPrinter implements RedPrinter {

	@Override
	public String print() {
		return "Red Heart";
	}

}
