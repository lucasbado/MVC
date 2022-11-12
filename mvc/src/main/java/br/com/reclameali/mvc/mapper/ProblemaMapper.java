package br.com.reclameali.mvc.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.reclameali.mvc.dto.ProblemaDto;
import br.com.reclameali.mvc.model.Problema;

public class ProblemaMapper {

    public static Problema dtoParaProblema(ProblemaDto dto){
        return new Problema(null, dto.getName(), dto.getProblem(), dto.getType(),
                null, null, null, null);
    }

    public static ProblemaDto problemaParaDto (Problema problema){
        return new ProblemaDto(problema.getName(), problema.getProblem(), problema.getType());
    }

    public static List<ProblemaDto> listProblemaParaProblemaDto (List<Problema> listProblema){
        List<ProblemaDto> problemas = new ArrayList<>();
        listProblema.forEach(problema -> problemas.add(new ProblemaDto(problema.getName(), problema.getProblem(),
                problema.getType())));
        return problemas;
    }

}
