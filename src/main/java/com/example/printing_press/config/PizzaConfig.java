package com.example.printing_press.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "pizza")
public class PizzaConfig {

	private String crust;
	private String topping;
	private String sauce;

	public PizzaConfig() {
		setCrust("thick");
		setTopping("pepperoni");
		setSauce("tomato");
	}

	public PizzaConfig(String crust, String topping, String sauce) {
		this.setCrust(crust);
		this.setTopping(topping);
		this.setSauce(sauce);
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

}
