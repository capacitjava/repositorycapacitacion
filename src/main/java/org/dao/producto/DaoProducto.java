package org.dao.producto;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.modelo.producto.Producto;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class DaoProducto {

	@SessionTarget
	private Session session;
	
	@TransactionTarget
	private Transaction transaction;
	
	@SuppressWarnings("unchecked")
	public List<Producto> listaProductos(String busqueda){
		List<Producto> productos = null;
		try {
			Criteria cr = session.createCriteria(Producto.class);
			cr.add(Restrictions.like("nombre", busqueda+"%"));
			productos = (List<Producto>) cr.list();
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
		return productos;
	}
}