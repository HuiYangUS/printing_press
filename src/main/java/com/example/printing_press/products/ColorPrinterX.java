package com.example.printing_press.products;

import org.springframework.stereotype.Component;

import com.example.printing_press.services.RedPrinter;
import com.example.printing_press.services.BluePrinter;
import com.example.printing_press.services.WhitePrinter;
import com.example.printing_press.services.ColorPrinter;

@Component
public class ColorPrinterX implements ColorPrinter {

	private RedPrinter redPrinter;
	private BluePrinter bluePrinter;
	private WhitePrinter whitePrinter;

	public ColorPrinterX(RedPrinter redPrinter, BluePrinter bluePrinter, WhitePrinter whitePrinter) {
		this.redPrinter = redPrinter;
		this.bluePrinter = bluePrinter;
		this.whitePrinter = whitePrinter;
	}

	@Override
	public String print() {
		return String.join(", ", redPrinter.print(), bluePrinter.print(), whitePrinter.print());
	}

}
