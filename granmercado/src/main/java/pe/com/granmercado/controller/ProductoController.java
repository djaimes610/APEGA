package pe.com.granmercado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import pe.com.granmercado.model.Producto;
import pe.com.granmercado.service.ProductoService;

@RestController
public class ProductoController {
	@Autowired
	private ProductoService service;
	
	  @RequestMapping(value = "/getProductos" , method = RequestMethod.GET)
	
	    public List<Producto> message() {
		     
	        return service.getAll();
	    }

	
}
