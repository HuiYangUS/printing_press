package com.example.printing_press.products;

import org.springframework.stereotype.Component;

import com.example.printing_press.services.BluePrinter;

@Component
public class BlueHeartPrinter implements BluePrinter {

	@Override
	public String print() {
		return "Blue Heart";
	}

}
