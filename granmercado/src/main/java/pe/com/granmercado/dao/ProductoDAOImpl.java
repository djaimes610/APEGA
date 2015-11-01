package pe.com.granmercado.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;

import pe.com.granmercado.model.Producto;

@Repository("productoDao")
public class ProductoDAOImpl extends AbstractDao implements ProductoDAO {

	@SuppressWarnings("unchecked")
	public List<Producto> getAll() {
		 Criteria criteria = getSession().createCriteria(Producto.class);
	        try {
				return (List<Producto>) criteria.list();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("errorrr "+e.getMessage());
				e.printStackTrace();
			}
	    	return null;
	}

}
