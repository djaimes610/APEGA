package pe.com.granmercado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.com.granmercado.model.Producto;
import pe.com.granmercado.service.ProductoService;

@Controller
public class LinkController {
	@Autowired
	ProductoService productoService;

	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		ModelAndView model = new ModelAndView("index");
		
		List<Producto> lstProductos = productoService.getAll();
		
		model.addObject("lstProductos",lstProductos );
		
		return model;
	}

	@RequestMapping(value="/index")
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}

}
