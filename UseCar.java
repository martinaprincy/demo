package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UseCar {
@GetMapping(value="/getCar")
public Car getCar(@RequestBody Car c) {
	c.setPrice(c.getPrice()+100);
	return c;
	
}
@GetMapping(value="/getCar")
public ListCar getCar(@RequestBody Car
}
