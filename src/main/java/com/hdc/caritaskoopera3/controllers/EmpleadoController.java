package com.hdc.caritaskoopera3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hdc.caritaskoopera3.modelos.EmpleadoVO;
import com.hdc.caritaskoopera3.modelos.VentaVO;
import com.hdc.caritaskoopera3.services.ServiceEmpleado;

@Controller
public class EmpleadoController {
	
	@Autowired
	ServiceEmpleado sempleado;
	
	@GetMapping("/mostrartodoslosempleados")
	public String mostrartodoslosempleados(Model modelo) {
		modelo.addAttribute("todoslosempleados", sempleado.findAll());
		return "vistaempleados";
	}
	
	@GetMapping("/insertarempleado")
	public String insertarempleado(Model modelo) {
		modelo.addAttribute("nuevoempleado",new EmpleadoVO());
		return "insertarempleado";
	}
	
	@GetMapping("/eliminarempleado")
	public String eliminarempleado(@RequestParam int idempleado, Model modelo) {
		sempleado.deleteById(idempleado);
		modelo.addAttribute("bajaempleado", sempleado.findAll());
		return "vistaempleados";
	}
	

	
	@GetMapping("/modificarempleado")
	public String modificarempleado(@RequestParam int idempleado, Model modelo) {
		modelo.addAttribute("modificaempleado", sempleado.findById(idempleado).get());
		return "modificarempleado";
	}
	
	@PostMapping("/submitempleado")
	public String submitempleado(@ModelAttribute EmpleadoVO empleado, Model modelo) {
		sempleado.save(empleado);
		modelo.addAttribute("ventas", sempleado.findAll());
		return "vistaempleados";
	}
	


}