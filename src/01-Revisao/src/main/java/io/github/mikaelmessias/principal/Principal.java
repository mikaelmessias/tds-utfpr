package io.github.mikaelmessias.principal;

import io.github.mikaelmessias.controle.BairroController;
import io.github.mikaelmessias.modelo.vo.Bairro;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mikael Pereira Messias
 */
public class Principal {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Revisao");

        BairroController bc = new BairroController();
        Bairro b = new Bairro();
        b.setDescricao("Centro");

        bc.salvar(b);

        System.out.println(bc.buscar("Centro"));

        factory.close();
    }
}
