package io.github.mikaelmessias.modelo.vo;

import javax.persistence.*;

@Entity
public class Predio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long codigo;

    @Column(length = 60, nullable = false)
    private String descricao;

    @Column(length = 10, nullable = false)
    private String numero;

    @ManyToOne
    @JoinColumn(name = "codEndereco")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "codBairro")
    private Bairro bairro;

    @ManyToOne
    @JoinColumn(name = "codCidade")
    private Cidade cidade;

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

}
