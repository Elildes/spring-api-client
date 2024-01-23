package com.elildes.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elildes.spring.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Optional<Cliente> findById(Long id);
	void deleteAll();
	void deleteById(String id);	
	Optional<Cliente> findByCpf(String cpf);
}
