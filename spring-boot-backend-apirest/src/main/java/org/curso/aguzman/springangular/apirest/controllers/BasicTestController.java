package org.curso.aguzman.springangular.apirest.controllers;

import org.curso.aguzman.springangular.apirest.tricks.Tricks;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicTestController {

	@RequestMapping("/")
	public String home() {
		return "Hello World! <br/>" + (new Tricks()).fakeListaDeClientes();
	}
}
