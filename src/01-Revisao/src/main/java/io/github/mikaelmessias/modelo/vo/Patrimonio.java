package io.github.mikaelmessias.modelo.vo;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Patrimonio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long codigo;

    @Column(length = 60, nullable = false)
    private String descricao;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataFabricacao;

    @Column(nullable = false)
    private Calendar dataAquisicao;

    private Calendar dataEliminacao;

    @Column(length = 10, precision = 2)
    private Double valorAquisicao;

    @Column(length = 100)
    private String obs;

    @Column(length = 100)
    private String localizacao;

    @ManyToOne
    @JoinColumn(name = "codTipo")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "codMarca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "codDepartamento")
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "codPredio")
    private Predio predio;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Calendar dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Calendar getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Calendar dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Calendar getDataEliminacao() {
        return dataEliminacao;
    }

    public void setDataEliminacao(Calendar dataEliminacao) {
        this.dataEliminacao = dataEliminacao;
    }

    public Double getValorAquisicao() {
        return valorAquisicao;
    }

    public void setValorAquisicao(Double valorAquisicao) {
        this.valorAquisicao = valorAquisicao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }
}
