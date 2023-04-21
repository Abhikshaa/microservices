package com.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.search.dto.LeadSerach;

@Controller
public class LeadSearchController {
	@Autowired
	private LeadRestSearchController leadRestSearchController;
	
	@RequestMapping("/showmePage")
	public String showme() {
		return "show";
	}
	
	@RequestMapping("/record")
	public String showReg(@RequestParam("id") long id ,ModelMap model) {
	LeadSerach lead=leadRestSearchController.getById(id);
	
	model.addAttribute("lead", lead);
		return "shower";
	}

}
