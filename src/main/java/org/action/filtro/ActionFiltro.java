package org.action.filtro;

import java.util.ArrayList;
import java.util.List;

import org.dao.producto.DaoProducto;
import org.modelo.producto.Producto;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ActionFiltro extends ActionSupport implements ModelDriven<Producto>{

	private Producto producto = new Producto();
	private DaoProducto dao = new DaoProducto();
	private List<Producto> listaProductos = new ArrayList<Producto>(); //GET Y SET
	
	public String execute() {
		return SUCCESS;
	}
	public String list() {
		setListaProductos(dao.listaProductos(producto.getNombre()));
		return SUCCESS;
	}
	
	@Override
	public Producto getModel() {
		// TODO Auto-generated method stub
		return producto;
	}
	
	//GET AND SET OF LISTAPRODUCTOS
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
}