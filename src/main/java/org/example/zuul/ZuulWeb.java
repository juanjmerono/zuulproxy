package org.example.zuul;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ZuulWeb {

	@GetMapping("/")
	public String index() {
		return "index";
	}

}