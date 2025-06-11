package com.example.printing_press.products;

import com.example.printing_press.services.RedPrinter;

public class RedDiamondPrinter implements RedPrinter {

	@Override
	public String print() {
		return "Red Diamond";
	}

}
