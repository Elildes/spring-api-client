package com.elildes.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.elildes.spring.entity.Cliente;
import com.elildes.spring.service.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    
    @PostMapping
    @NewSpan("salvar-clientes")
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente newCliente){
    	return ResponseEntity.ok(clienteService.salvar(newCliente));
    }

    @NewSpan("listar-clientes")
    @GetMapping
    public ResponseEntity<List<Cliente>> listaClientes(){
    	return ResponseEntity.ok(clienteService.listaClientes());
    }
    
    @GetMapping("/{id}")
    @NewSpan("listar-cliente-id")
    public ResponseEntity<Optional<Cliente>> listaClienteId(@PathVariable Long id){
    	return ResponseEntity.ok(clienteService.listaClienteId(id));
    }

    @DeleteMapping("/{id}")
    @NewSpan("deletar-clientes-id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void apagarClientePoId(@PathVariable Long id) {
		try {
			clienteService.apagarClientePorId(id);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
    
    @DeleteMapping
    @NewSpan("deletar-clientes")
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void apagarClientes() {
		try {
			clienteService.apagarClientes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
}
