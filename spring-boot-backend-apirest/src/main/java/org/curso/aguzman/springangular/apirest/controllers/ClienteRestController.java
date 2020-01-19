package org.curso.aguzman.springangular.apirest.controllers;

import java.util.List;

import org.curso.aguzman.springangular.apirest.models.entity.Cliente;
import org.curso.aguzman.springangular.apirest.models.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired 
	private IClienteService clienteService;
	
	@GetMapping("/clientes") 
	public List<Cliente> index() { 
		return clienteService.findAll();
	}
	
	@GetMapping("/clientes/{id}") 
	public Cliente show(@PathVariable Long id) { 
		return clienteService.findById(id);
	}
	
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) { 
		clienteService.delete(clienteService.findById(id));
	}
	
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		this.clienteService.save(cliente);
		return cliente;
	}
	
	@PutMapping("/clientes")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente clienteSerial = clienteService.findById(id);
		clienteSerial.setNombre(cliente.getNombre());
		clienteSerial.setApellido(cliente.getApellido());
		clienteSerial.setEmail(cliente.getEmail());
		this.clienteService.save(clienteSerial);
		return clienteSerial;
	}
}
