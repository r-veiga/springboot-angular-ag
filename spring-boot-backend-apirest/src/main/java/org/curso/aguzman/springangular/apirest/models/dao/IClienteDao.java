package org.curso.aguzman.springangular.apirest.models.dao;

import org.curso.aguzman.springangular.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
