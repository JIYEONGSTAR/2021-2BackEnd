package net.skhu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.dto.Book;
import net.skhu.dto.Student;

@RestController
@RequestMapping("first")
public class FirstController {
	@RequestMapping("exam1")
	public Student exam1() {
		return new Student("박지영", "201814092");
	}

	@RequestMapping("exam2")
	public Book[] exam2() {
		return new Book[] { new Book(1, "레미제라블", "빅토르 위고", 10000), new Book(2, "홍길동전", "허준", 15000) };
	}

	@RequestMapping("exam4")
	public Student exam4(Model model, String name, String studentNumber) {
		return new Student(name, studentNumber);

	}
}
