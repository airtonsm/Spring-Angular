package io.github.airtons.clientes.service;

import io.github.airtons.clientes.model.Cliente;
import io.github.airtons.clientes.repositories.ClienteRepository;
import io.github.airtons.clientes.rest.exception.NegocioException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente salvar(Cliente cliente) throws NegocioException {
        Optional<Cliente> optionalCliente = repository.findByCpf(cliente.getCpf());
        if(!optionalCliente.isPresent()){
           return repository.save(cliente);
        }else
            throw new NegocioException(HttpStatus.CONFLICT,"Cpf já cadastrado!");
    }

}
