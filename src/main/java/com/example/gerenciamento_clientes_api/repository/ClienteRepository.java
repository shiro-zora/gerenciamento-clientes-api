package com.example.gerenciamento_clientes_api.repository;

import com.example.gerenciamento_clientes_api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

    List<Cliente> findByEstado(String estado);

    List<Cliente> findByCpf(String cpf);

    List<Cliente> findByRepresentante(String representante);

    List<Cliente> findByNomeContainingIgnoreCase(String nome);
}


