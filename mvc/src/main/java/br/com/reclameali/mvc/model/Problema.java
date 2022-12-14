package br.com.reclameali.mvc.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Table(name= "TB_PROBLEMA")
@SequenceGenerator(name= "SQ_PROBLEMA", sequenceName= "SQ_PROBLEMA", initialValue= 1)
@Entity
public class Problema {

    @Id
    @Column(name= "cd_problema")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PROBLEMA")
    private Long id;

    @Column(name= "nm_problema")
    private String name;

    @Column(name= "ds_problema")
    private String problem;

    @Column(name="ds_tipo")
    private String type;

    @Column(name= "dt_criacao")
    private Date create;

    @Column(name= "dt_alteracao")
    private Date change;

    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario;

    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;


    public Problema(){}


    public Problema(Long id, String name, String problem, String type, Date create,
                    Date change, Usuario usuario, Endereco endereco) {
        this.id = id;
        this.name = name;
        this.problem = problem;
        this.type = type;
        this.create = create;
        this.change = change;
        this.usuario = usuario;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getType() {return type;}

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {this.create = create;}

    public Date getChange() {
        return change;
    }

    public void setChange(Date change) {
        this.change = change;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Endereco getEndereco() {return endereco;}

    public void setEndereco(Endereco endereco) {this.endereco = endereco;}

}
