package io.github.airtons.clientes.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class servicoPrestadoDTO {

    private String descricao;
    private String preco;
    private String data;
    private Integer idCliente;

}
