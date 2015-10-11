package com.lan.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lan.test.entities.Test;
import com.lan.test.services.TestService;

/** 
 * @author elan
 * @version 创建时间：2015年7月12日上午9:43:23 
 * 
 */

@Controller("lan_test_controller")
@RequestMapping("test")
public class TestController {

	@Autowired
	private TestService testService;
	
	@Value("${jdbc.url}")
	private String url;
	
	@RequestMapping("list")
	public String list(Model model){
		
		List<String> list = testService.selectAllName();
		model.addAttribute("list", list);
		model.addAttribute("url", url);
		return "test/index";
	}
	
	@RequestMapping("list2")
	public String list2(Model model){
		
		List<Test> list = testService.selectAllUser();
		model.addAttribute("list", list);
		return "test/index";
	}
	
	
	
}
