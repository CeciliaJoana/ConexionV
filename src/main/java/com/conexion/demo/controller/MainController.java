package com.conexion.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.conexion.demo.Entidades.EntidadONG;
import com.conexion.demo.InterfazServicio.InterfazServicio;


import java.util.*;

@Controller
@RequestMapping("/")
public class MainController {
	@Autowired
	private InterfazServicio service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<EntidadONG>entidades=service.listar();
		model.addAttribute("enti", entidades);
		return "index.html";
		
	
		
		
		
	}
	
}
