package com.lostObjects.webApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {

	@RequestMapping("/home")
	public String homePage() {
		return "homePage";
	}
}
