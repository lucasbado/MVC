package br.com.reclameali.mvc.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.reclameali.mvc.dto.ProblemaDto;
import br.com.reclameali.mvc.dto.ProblemaUsuariosDto;
import br.com.reclameali.mvc.model.Problema;

public class ProblemaMapper {

    public static Problema dtoParaProblema(ProblemaDto dto){
        return new Problema(null, dto.getName(), dto.getProblem(), dto.getType(),
                null, null, null);
    }

    public static ProblemaDto problemaParaDto (Problema problema){
        return new ProblemaDto(problema.getName(), problema.getProblem(), problema.getType());
    }

    public static List<ProblemaUsuariosDto> listProblemaParaProblemaDto (List<Problema> listProblema){
        List<ProblemaUsuariosDto> problemas = new ArrayList<>();
        listProblema.forEach(problema -> problemas.add(new ProblemaUsuariosDto(problema.getName(), problema.getProblem(),
                problema.getType(), UsuarioMapper.listaUsuarioParaUsuarioDto(problema.getUsuarios()))));
        return problemas;
    }

}
