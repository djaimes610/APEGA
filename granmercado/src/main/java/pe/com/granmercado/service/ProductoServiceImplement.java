package pe.com.granmercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.granmercado.dao.ProductoDAO;
import pe.com.granmercado.model.Producto;

	@Service("productoService")
	@Transactional
public class ProductoServiceImplement implements ProductoService {
	@Autowired
	private ProductoDAO dao;
		
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
	
	
	
	

}
