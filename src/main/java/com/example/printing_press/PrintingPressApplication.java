package com.example.printing_press;

import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.printing_press.config.PizzaConfig;
import com.example.printing_press.services.ColorPrinter;
import com.example.printing_press.services.RosePrinter;

@SpringBootApplication
public class PrintingPressApplication implements CommandLineRunner {

	private static final Logger log = Logger.getLogger(PrintingPressApplication.class.getName());

	private ColorPrinter colorPrinter;
	private PizzaConfig pizzaConfig;
	private RosePrinter rosePrinter;

	public PrintingPressApplication(ColorPrinter colorPrinter, PizzaConfig pizzaConfig, RosePrinter rosePrinter) {
		this.colorPrinter = colorPrinter;
		this.pizzaConfig = pizzaConfig;
		this.rosePrinter = rosePrinter;
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("I love to have a " + rosePrinter.print() + ".");
		log.info(colorPrinter.print());
		log.info(String.format("I want a %s crust pizza tops with %s and covers in %s sauce.", pizzaConfig.getCrust(),
				pizzaConfig.getTopping(), pizzaConfig.getSauce()));
	}

	public static void main(String[] args) {
		SpringApplication.run(PrintingPressApplication.class, args);
	}

}
