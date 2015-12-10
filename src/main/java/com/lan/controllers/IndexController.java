package com.lan.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @author elan
 * @version 创建时间：2015年7月9日下午11:26:19 
 * 
 */
@Controller("lan.indexcontroller")
@RequestMapping("/")
public class IndexController {

	@RequestMapping("")
	public String index(Model model,HttpServletRequest request){
		
		String path = request.getContextPath() + "/assert";
		model.addAttribute("url_path", path);
		return "index";
	}
	
}
