package com.search.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.search.dto.LeadSerach;

@Component
public class LeadRestSearchController {

	public LeadSerach getById(long id) {
		RestTemplate rt = new RestTemplate();
		LeadSerach serach = rt.getForObject("http://localhost:8080/api/rest/search/"+id, LeadSerach.class);
		
		return serach;
	}
	
	

}
