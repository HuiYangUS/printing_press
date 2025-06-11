package com.example.printing_press.products;

import org.springframework.stereotype.Component;

import com.example.printing_press.services.WhitePrinter;

@Component
public class WhiteHeartPrinter implements WhitePrinter {

	@Override
	public String print() {
		return "White Heart";
	}

}
