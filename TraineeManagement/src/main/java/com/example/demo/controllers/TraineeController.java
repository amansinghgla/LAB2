package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Trainee;
import com.example.demo.interfaces.TraineeServiceInterface;

@RestController
public class TraineeController {
	
	@Autowired
	private TraineeServiceInterface ts;

	@RequestMapping("/")
	public String login()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/listalltrainee")
	public String viewHomePage(Model model) {
	    List<Trainee> listtrainee = ts.retrieve();
	    model.addAttribute("list of trainee", listtrainee);
	     
	    return "home";
	}
	
	@RequestMapping(value = "/addtrainee", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("Add Trainee") Trainee trainee) {
		ts.addtrainee(trainee);
		
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "traineeid") int traineeid) {
		ts.delete(traineeid);
		return "redirect:/";		
	}



}
