package com.dungsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dungsecurity.entity.StudentEntity;
import com.dungsecurity.service.StudentServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private StudentServiceImpl studentService;
	
	@RequestMapping(value = "/hello")
	public String home(ModelMap modelMap) {
		modelMap.addAttribute("message", "Chào dũng");
		return "hello";
	}
	
	@RequestMapping(value = "/helloWork")
	public String listStudent() {
		List<StudentEntity> list =  studentService.findAllStudent("");
		for (StudentEntity studentEntity : list) {
			System.out.println("studentEntity = "+studentEntity.getName());
		}
		return "hello";
	}
}
