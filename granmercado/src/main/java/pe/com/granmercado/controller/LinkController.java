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

	@RequestMapping(value = "/")
	public ModelAndView mainPage() {
		ModelAndView model = new ModelAndView("index");

		List<Producto> lstProductos = productoService.getAll();

		model.addObject("lstProductos", lstProductos);

		return model;
	}

	@RequestMapping(value = "/index")
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/contactenos")
	public ModelAndView contactenosPage() {
		return new ModelAndView("contactenos");
	}
	
	@RequestMapping(value = "/nosotros")
	public ModelAndView cnosotrosPage() {
		return new ModelAndView("nosotros");
	}
	
	@RequestMapping(value = "/producto_01")
	public ModelAndView producto01Page() {
		return new ModelAndView("producto_01");
	}
	
	@RequestMapping(value = "/productos")
	public ModelAndView productosPage() {
		return new ModelAndView("productos");
	}	

	@RequestMapping(value = "/quiero_comprar")
	public ModelAndView quieroComprarPage() {
		return new ModelAndView("quiero_comprar");
	}
	
	@RequestMapping(value = "/sube_tu_oferta")
	public ModelAndView subeTuOfertaPage() {
		return new ModelAndView("sube_tu_oferta");
	}	

}
