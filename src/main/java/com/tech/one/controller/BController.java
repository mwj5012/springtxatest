package com.tech.one.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BController {
	
	public JdbcTemplate template;
	
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//		Constant.template=this.template;
//	}
	
//	@Autowired
//	private SqlSession sqlSession;
	
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request,
			Model model) {
		System.out.println("pass by list()");

		return "list";
	}
	
}
