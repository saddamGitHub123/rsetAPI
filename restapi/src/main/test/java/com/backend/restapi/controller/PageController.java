package com.backend.restapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.backend.restapi.dao.UserDAO;
import com.backend.restapi.dto.User;

@Controller
@EnableWebMvc
public class PageController {
	
	
	@Autowired
	UserDAO userDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "welcome to spring web mvc new way to done ");
		return mv;
	}
	
	
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public  ModelAndView listUser() {
		logger.info("Entered addUserList()  - Add all user ");
		
		System.out.println("Entering list user method");
		List<User> user =  userDAO.list();
		
		System.out.println(user);
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "This is list of value  ");
		logger.info("Returring from controller ");
		return mv;
	}
	
	
}
