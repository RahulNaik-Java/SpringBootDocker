package com.rahul.naik.controller;

import com.rahul.naik.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rahul.naik.service.LoginService;
import com.rahul.naik.service.TodoService;

import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    TodoService service;

    @RequestMapping(value="/list-todos", method = RequestMethod.GET)
    public String showTodos(ModelMap model){
        //String name = (String) model.get("name");
        List<Todo> todos = service.retrieveTodos();
        model.put("todos", todos); //service.retrieveTodos(name)
        System.out.println("----in todo controller start----");
        System.out.println(todos);
        System.out.println("----in todo controller end----");
        return "list-todos";
    }
}