package br.com.reclameali.mvc.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name= "TB_ENDERECO")
@SequenceGenerator(name= "SQ_ENDERECO", sequenceName = "SQ_ENDERECO", initialValue = 1)
@Entity
public class Endereco {

    @Id
    @Column(name= "cd_endereco")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    private Long id;

    @Column(name= "ds_url")
    private String url;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "endereco")
    private List<Problema> problemas;


    public Endereco(){}

    public Endereco(Long id, String url, List<Problema> problemas) {
        this.id = id;
        this.url = url;
        this.problemas = problemas;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Problema> getProblemas() {return problemas;}

    public void setProblemas(List<Problema> problemas) {this.problemas = problemas;}

}
