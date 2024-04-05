package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KallController {

	@GetMapping("/getApprisalRaiting")
	public int getApprisalRaiting() {
		return 10;
	}

}
