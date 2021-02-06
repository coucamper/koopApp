package com.hdc.caritaskoopera3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hdc.caritaskoopera3.modelos.ProductoVO;
import com.hdc.caritaskoopera3.modelos.VentaVO;
import com.hdc.caritaskoopera3.services.ServiceProducto;
import com.hdc.caritaskoopera3.services.ServiceVenta;

@Controller
public class VentaController {
	
	@Autowired
	ServiceVenta sventa;
	
	@Autowired
	ServiceProducto sp;
	
	@GetMapping("/mostrartodaslasventas")
	public String mostrartodaslasventas(Model modelo) {
		modelo.addAttribute("todaslasventas", sventa.findAll());
		return "vistaventas";
	}
	
	@GetMapping("/insertarventa")
	public String insertarventa(Model modelo) {
		modelo.addAttribute("nuevaventa",new VentaVO());
		return "insertarventa";
	}
	
	@GetMapping("/eliminarventa")
	public String eliminarventa(@RequestParam int idventa, Model modelo) {
		sventa.deleteById(idventa);
		modelo.addAttribute("bajaventa", sventa.findAll());
		return "vistaventas";
	}
	

	@GetMapping("/modificarventa")
	public String modificarventa(@RequestParam int idventa, Model modelo) {
		modelo.addAttribute("modificaventa", sventa.findById(idventa).get());
		return "modificarventa";
	}
	
	@PostMapping("/submitventa")
	public String submitventa(@ModelAttribute VentaVO venta, Model modelo) {
		sventa.save(venta);
		modelo.addAttribute("ventas", sventa.findAll());
		return "vistaventas";
	}
	
	@GetMapping("/calcularimporte")
	public String calcularimporte(@RequestParam int cantidad, @RequestParam int idproducto, Model modelo) {
		double importe = (sp.findById(idproducto).get().getPreciofull()*cantidad);
		modelo.addAttribute("importecompra", importe);
		return "vistaimporte";
	}
	


}
