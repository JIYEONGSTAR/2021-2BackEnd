package net.skhu.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {
	@RequestMapping("index")
	public String index(Model model) {
		model.addAttribute("studentNumber", "201814092");
		model.addAttribute("name", "박지영");
		model.addAttribute("now", new Date());
		return "hello/index";
	}
}
