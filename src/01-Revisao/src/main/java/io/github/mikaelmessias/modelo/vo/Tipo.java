package io.github.mikaelmessias.modelo.vo;

import javax.persistence.*;

@Entity
public class Tipo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long codigo;

    @Column(length = 60, nullable = false, unique = true)
    private String descricao;

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

}
