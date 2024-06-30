package com.sprinwar.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarContainner {
	
	@GetMapping("/wel/{name}")
	public String getMessage(@PathVariable ("name")String name) {
		return name+ " welcome to my first project";
	}

}
