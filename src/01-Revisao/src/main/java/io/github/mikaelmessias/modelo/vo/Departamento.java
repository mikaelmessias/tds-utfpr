/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.mikaelmessias.modelo.vo;

import javax.persistence.*;

/**
 *
 * @author Mikael Pereira Messias
 */
@Entity
public class Departamento {
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
