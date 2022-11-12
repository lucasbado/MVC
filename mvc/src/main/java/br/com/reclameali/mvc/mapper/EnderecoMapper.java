package br.com.reclameali.mvc.mapper;

import br.com.reclameali.mvc.dto.EnderecoDto;
import br.com.reclameali.mvc.model.Endereco;

public class EnderecoMapper {

    public static Endereco dtoParaEndereco(EnderecoDto dto){
        return new Endereco(null, dto.getUrl(), null);
    }

}
