package com.uallace.consultarCep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_endereco;
    public Integer getId_endereco() {
        return id_endereco;
    }
    public void setId_endereco(Integer id_endereco) {
        this.id_endereco = id_endereco;
    }

    private String cep;
    @Column(name="cep", length=8, nullable=false)
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    private String logradouro;
    @Column(name="logradouro", length=50, nullable=false)
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    private String numero;
    @Column(name="numero", length=8, nullable=false)
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    private String complemento;
    @Column(name="complemento", length=30, nullable=true)
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    private String bairro;
    @Column(name="bairro", length=30, nullable=false)
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    private String uf;
    @Column(name="uf", length=2, nullable=false)
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

    private String localidade;
    @Column(name="localidade", length=50, nullable=false)
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    
}
