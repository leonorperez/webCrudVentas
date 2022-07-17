package com.interfaceDao;

import java.util.List;

import com.model.Cliente;

public interface IClienteDao {
	
	public boolean registrarCliente(Cliente cliente);
	public List<Cliente> obtener();
	List<Cliente> obtenerUno(String id);
	boolean eliminarById(String id);
	boolean actualizarCliente(Cliente cliente);
	
}
