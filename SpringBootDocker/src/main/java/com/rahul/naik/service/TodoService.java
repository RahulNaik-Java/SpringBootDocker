package com.rahul.naik.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rahul.naik.model.Todo;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
    	
        todos.add(new Todo(1, "java", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "java", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "java", "Learn Hibernate", new Date(),
                false));
    }
  

    public List<Todo> retrieveTodos()  //String user
    {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
        	filteredTodos.add(todo);
			/*
			 * if (todo.getUser().equals(user)) { filteredTodos.add(todo); }
			 */
        }
        System.out.println(filteredTodos);
        return filteredTodos;
    }
}