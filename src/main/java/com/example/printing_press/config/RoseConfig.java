package com.example.printing_press.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.printing_press.products.RedRosePrinter;
import com.example.printing_press.products.YellowRosePrinter;
import com.example.printing_press.services.RosePrinter;

@Configuration
public class RoseConfig {

	@Bean
	public RosePrinter rosePrinter(YellowRosePrinter yellowRosePrinter) {
		return new YellowRosePrinter();
	}

	@Bean
	public RedRosePrinter redRosePrinter() {
		return new RedRosePrinter();
	}

	@Bean
	public YellowRosePrinter yellowRosePrinter() {
		return new YellowRosePrinter();
	}

}
