package com.service.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/health")
	public String health() {
		return "Service is running...";
	}

	@GetMapping("/add")
	public double add(@RequestParam(value = "x") double x, @RequestParam(value = "y") double y) {
		return x + y;
	}

	@GetMapping("/subtract")
	public double subtract(@RequestParam(value = "x") double x, @RequestParam(value = "y") double y) {
		return x - y;
	}

	@GetMapping("/multiply")
	public double multiply(@RequestParam(value = "x") double x, @RequestParam(value = "y") double y) {
		return x * y;
	}

	@GetMapping("/divide")
	public double divide(@RequestParam(value = "x") double x, @RequestParam(value = "y") double y) {
		return x / y;
	}
}
