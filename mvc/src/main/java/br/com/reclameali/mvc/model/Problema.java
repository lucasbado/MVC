package br.com.reclameali.mvc.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Table(name= "TB_PROBLEMA")
@SequenceGenerator(name= "SQ_PROBLEMA", sequenceName= "SQ_PROBLEMA", initialValue= 1)
@Entity
public class Problema {

    @Id
    @Column(name = "cd_problema")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PROBLEMA")
    private Long id;

    @Column(name = "titulo")
    private String name;

    @Column(name = "comentario")
    private String problem;

    @Column(name = "categoria")
    private String type;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "TB_USUARIO_PROBLEMA", joinColumns = @JoinColumn(name = "cd_problema"),
    inverseJoinColumns = @JoinColumn(name = "cd_usuario"))
    private List<Usuario> usuarios;

    public Problema() {
    }

    public Problema(Long id, String name, String problem, String type, Date create, Date change, List<Usuario> usuarios) {
        this.id = id;
        this.name = name;
        this.problem = problem;
        this.type = type;
        this.usuarios = usuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
