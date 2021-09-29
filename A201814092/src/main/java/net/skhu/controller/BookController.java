package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import net.skhu.dto.Book;

@Controller
@RequestMapping("book")
public class BookController {
	@GetMapping("edit")
	public String edit(Model model) {
		model.addAttribute("book", new Book());
		return "book/edit";
	}
	@PostMapping("edit")
	public String edit(Model model,Book book) {
		model.addAttribute("message","저장되었습니다");
		return "book/edit";
	}
}
