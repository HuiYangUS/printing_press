package com.example.printing_press;

import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.printing_press.services.ColorPrinter;

@SpringBootApplication
public class PrintingPressApplication implements CommandLineRunner {

	private ColorPrinter colorPrinter;
	private static final Logger log = Logger.getLogger(PrintingPressApplication.class.getName());

	public PrintingPressApplication(ColorPrinter colorPrinter) {
		this.colorPrinter = colorPrinter;
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colorPrinter.print());
	}

	public static void main(String[] args) {
		SpringApplication.run(PrintingPressApplication.class, args);
	}

}
