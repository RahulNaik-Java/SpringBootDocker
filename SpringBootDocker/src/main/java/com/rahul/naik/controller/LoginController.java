package com.rahul.naik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rahul.naik.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	boolean loggedIn = false;
	
    @Autowired
    LoginService service;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @GetMapping("/welcome")
    public String welcome() {
    	
    	return "welcome"; 
    }
    
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

        boolean isValidUser = service.validateUser(name, password);
        
        
        if (!isValidUser) {
        	loggedIn = false;
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        loggedIn = true;
        model.put("name", name);
        model.put("password", password);

        return "welcome";
    }

}