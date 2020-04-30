package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;


import com.example.demo.entities.Trainee;
import com.example.demo.service.TraineeService;
import com.example.demo.service.UserService;
import com.example.demo.entities.User;
@Controller
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	@Autowired
	private UserService userService;



	@RequestMapping("/")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGIN");
		return "addtrainee";
	}

	@RequestMapping("/login")
	public String loginUser(@ModelAttribute User user, HttpServletRequest request) {
		if (userService.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			return "home";
		} else {
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "addtrainee";

		}
	}

	@RequestMapping("/addtrainee")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "addtrainee";
	}

	@PostMapping("/save-trainee")
	public String registerUser(@ModelAttribute Trainee trainee, BindingResult bindingResult,
			HttpServletRequest request) {
		traineeService.addtrainee(trainee);

		return "home";
	}

	@GetMapping("/show-trainee")
	public String showAllUsers(HttpServletRequest request) {
		request.setAttribute("trainees", traineeService.retrieve());
		request.setAttribute("mode", "ALL_USERS");
		return "addtrainee";
	}

	@RequestMapping("/delete-trainee")
	public String deleteUser(@RequestParam int traineeid, HttpServletRequest request) {
		traineeService.deletetrainee(traineeid);
		request.setAttribute("trainees", traineeService.retrieve());
		request.setAttribute("mode", "ALL_USERS");
		return "addtrainee";
	}

	@RequestMapping("/edit-trainee")
	public String updatetrainee(@RequestParam int traineeid, HttpServletRequest request) {
		request.setAttribute("trainee", traineeService.edittrainee(traineeid));
		request.setAttribute("mode", "MODE_UPDATE");
		return "addtrainee";
	}

}


