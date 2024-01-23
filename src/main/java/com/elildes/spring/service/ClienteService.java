package com.elildes.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elildes.spring.entity.Cliente;
import com.elildes.spring.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
    private ClienteRepository clienteRepository;
	
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    
    public List<Cliente> listaClientes(){
        return clienteRepository.findAll();
    }
    
    public Optional<Cliente> listaClienteId (Long idCliente) {
    	return clienteRepository.findById(idCliente);
    }
    
    public void apagarClientes() {
		clienteRepository.deleteAll();
	}
    
	public void apagarClientePorId(Long id) {
		clienteRepository.deleteById(id);		
	}
}
