package com.Assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssignmentController {

	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
}
