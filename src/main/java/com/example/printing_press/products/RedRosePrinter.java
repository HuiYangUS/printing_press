package com.example.printing_press.products;

import com.example.printing_press.services.RosePrinter;

public class RedRosePrinter implements RosePrinter {

	@Override
	public String print() {
		return "red rose";
	}

}
