package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.dao.ClienteDaoImplementacion;
import com.interfaceDao.IClienteDao;
import com.model.Cliente;
//import com.vista.VistaCliente;

public class ClienteControlador {
//private VistaCliente vista= new VistaCliente();
	
	public ClienteControlador() {
	}	
	
	//llama al DAO para guardar un cliente
		public boolean registrar(Cliente cliente ) {
			IClienteDao dao= new  ClienteDaoImplementacion();
			return dao.registrarCliente(cliente);
			
		}
	//llama al DAO para actualizar un cliente
	public void actualizar(Cliente cliente) {
		IClienteDao dao= new  ClienteDaoImplementacion();
		dao.actualizar(cliente);
	}
	
	//llama al DAO para eliminar un cliente
	public boolean eliminar(String id) {
		IClienteDao dao= new  ClienteDaoImplementacion();		
		return dao.eliminarById(id);
	}
	
	//llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public List<Cliente> getClientes(){
		List<Cliente> clientes = new ArrayList<Cliente>();
		IClienteDao dao= new  ClienteDaoImplementacion();
		clientes=dao.obtener();

		
		return clientes;
	}
	public List<Cliente> getCliente(String id){
		List<Cliente> clientes = new ArrayList<Cliente>();
		IClienteDao dao= new  ClienteDaoImplementacion();
		clientes=dao.obtenerUno(id);		
		
		return clientes;
	}

}
