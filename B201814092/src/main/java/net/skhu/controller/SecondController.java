package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("second")
public class SecondController {

	@RequestMapping("exam3")
	public String test3(Model model, String name, String studentNumber) {
		model.addAttribute("name", name);
		model.addAttribute("studentNumber", studentNumber);
		return "second/exam3";
	}
}
