package org.curso.aguzman.springangular.apirest.tricks;

import java.util.ArrayList;
import java.util.List;

import org.curso.aguzman.springangular.apirest.models.entity.*;

public class Tricks {
	
	public List<Cliente> fakeListaDeClientes() { 
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cli;
		
		cli = new Cliente();
		cli.setNombre("Albert");
		cli.setApellido("Einstein");
		cli.setEmail("albert.einstein@correo.com");
		clientes.add(cli);
		
		cli = new Cliente();
		cli.setNombre("Robert");
		cli.setApellido("Planck");
		cli.setEmail("robert.planck@correo.com");
		clientes.add(cli);
		
		cli = new Cliente();
		cli.setNombre("Reneé");
		cli.setApellido("Descartes");
		cli.setEmail("renee.descartes@correo.com");
		clientes.add(cli);
		
		cli = new Cliente();
		cli.setNombre("Stephen");
		cli.setApellido("Hawking");
		cli.setEmail("stephen.hawking@correo.com");
		clientes.add(cli);
		
		return clientes;		
	}
	
}
