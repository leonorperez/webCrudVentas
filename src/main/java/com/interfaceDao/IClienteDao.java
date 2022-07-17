package com.interfaceDao;

import java.util.List;

import com.model.Cliente;

public interface IClienteDao {
	
	public boolean registrarCliente(Cliente cliente);
	public List<Cliente> obtener();
	public boolean actualizar(Cliente cliente);
	public boolean eliminar(Cliente cliente);
	List<Cliente> obtenerUno(String id);
	
}
