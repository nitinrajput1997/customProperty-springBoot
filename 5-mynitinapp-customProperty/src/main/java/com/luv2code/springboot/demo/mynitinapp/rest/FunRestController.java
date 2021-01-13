 package com.luv2code.springboot.demo.mynitinapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController 
{
	//injecting properties
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	//expose new endpoints
	@GetMapping("/TeamInfo")
	public String getTeamInfo()
	{
		
		return "Coach:" + coachName + ", Team Name: " + teamName ;
	}
	
	
	// expose "/" that return "Hello World !"
	
	@GetMapping("/")
	public String sayHello() 
	{
		return "Hello World ! Time On Server is :" + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getWorkout() 
	{
		return "Run as much as Possible";
	}
	
	@GetMapping("/lucky")
	public String getLucky() 
	{
		return "Your lucky number is 7 ";
	}
}
