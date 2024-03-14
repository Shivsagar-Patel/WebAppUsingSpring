package com.ssi.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.models.TaxModel;
import com.ssi.services.TaxServiceImpl;

@Controller
public class ProductController {

	@Autowired
	private TaxServiceImpl service;
	//private TaxService service = new TaxService();

	@RequestMapping("/process")
	public ModelAndView processRequest(@ModelAttribute("info") TaxModel model) {
		// read the data using map
		System.out.println(model);
		// process the data

		service.computeTax(model);
		// provide response
		ModelAndView mv=new ModelAndView("result.jsp");
		//mv.setViewName("result.jsp");
		//mv.addObject("info",model);//request scope
		mv.addObject("author","Sagar Patel");//request scope
		return mv;
		

	}

	@RequestMapping("/inputs")
	public String provideInputPage() {
		return "details.jsp"; // view name
	}

}
