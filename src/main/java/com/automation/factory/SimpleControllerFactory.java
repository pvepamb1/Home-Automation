package com.automation.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.automation.controller.RestlessController;
import com.automation.enums.SensorType;

@Component
public class SimpleControllerFactory {

	private static ApplicationContext ctx;

	@Autowired
	public SimpleControllerFactory(ApplicationContext applicationContext) {
		SimpleControllerFactory.ctx = applicationContext;
	}

	public static RestlessController getController(SensorType type) {
		return (RestlessController) ctx.getBean(type + "Controller");
	}
}