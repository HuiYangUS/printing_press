package com.example.printing_press;

import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.printing_press.config.PizzaConfig;
import com.example.printing_press.services.ColorPrinter;

@SpringBootApplication
public class PrintingPressApplication implements CommandLineRunner {

	private static final Logger log = Logger.getLogger(PrintingPressApplication.class.getName());

	private ColorPrinter colorPrinter;
	private PizzaConfig pizzaConfig;

	public PrintingPressApplication(ColorPrinter colorPrinter, PizzaConfig pizzaConfig) {
		this.colorPrinter = colorPrinter;
		this.pizzaConfig = pizzaConfig;
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colorPrinter.print());
		log.info(String.format("I want a %s crust pizza tops with %s and covers in %s sauce.", pizzaConfig.getCrust(),
				pizzaConfig.getTopping(), pizzaConfig.getSauce()));
	}

	public static void main(String[] args) {
		SpringApplication.run(PrintingPressApplication.class, args);
	}

}
