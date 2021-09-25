package io.github.airtons.clientes.repositories;

import io.github.airtons.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    //@Query("SELECT u FROM Cliente u WHERE u.cpf = ?1")

    Optional<Cliente> findByCpf(String cpf);

}
