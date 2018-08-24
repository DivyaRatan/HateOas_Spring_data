package com.demo.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.rest.pojo.Employee;
import com.demo.rest.service.EmployeeService;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        	SpringApplication.run(App.class, args);
    }
    @Bean
    public CommandLineRunner loadInitialData(EmployeeService service) {
    	return(args)->{
    		service.addEmployee(new Employee(101,"Div"));
    		service.addEmployee(new Employee(102,"Rat"));
    		service.addEmployee(new Employee(103,"Abhi"));
    		service.addEmployee(new Employee(104,"Jay"));
    		service.addEmployee(new Employee(105,"Nish"));
    	};
    }
}
