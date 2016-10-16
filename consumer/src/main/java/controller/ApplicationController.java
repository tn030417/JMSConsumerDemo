package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import consumer.service.ConsumerService;

@Controller
@RequestMapping
public class ApplicationController {
	
	@Autowired
	private ConsumerService consumerService;
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap model){
		return "index";
	}
	
	@RequestMapping(value = "/startConsumer", method = RequestMethod.GET)
	public String startConsumer(ModelMap model){		
		consumerService.start();
		return "index";
	}
	
	@RequestMapping(value = "/stopConsumer", method = RequestMethod.GET)
	public String stopConsumer(ModelMap model){		
		consumerService.stop();
		return "index";
	}
}
