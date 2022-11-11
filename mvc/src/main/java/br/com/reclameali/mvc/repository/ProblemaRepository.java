package br.com.reclameali.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.reclameali.mvc.model.Problema;

@Repository
public interface ProblemaRepository extends JpaRepository<Problema, Long> {
}
