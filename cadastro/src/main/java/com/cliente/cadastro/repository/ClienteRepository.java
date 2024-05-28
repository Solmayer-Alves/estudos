package com.cliente.cadastro.repository;

import com.cliente.cadastro.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
