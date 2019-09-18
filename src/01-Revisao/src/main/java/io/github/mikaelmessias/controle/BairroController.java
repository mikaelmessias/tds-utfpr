package io.github.mikaelmessias.controle;

import io.github.mikaelmessias.modelo.dao.GenericDAO;
import io.github.mikaelmessias.modelo.vo.Bairro;

import java.util.List;

public class BairroController {
    private GenericDAO<Bairro> genericDAO;

    public BairroController() {
        this.genericDAO = new GenericDAO<>();
    }

    public void salvar(Bairro bairro) {
        genericDAO.save(bairro);
    }

    public void atualizar(Bairro bairro) {
        genericDAO.update(bairro);
    }

    public void remover(Bairro bairro) {
        genericDAO.delete(bairro);
    }

    public List buscarTodos() {
        List<Bairro> bairros = genericDAO.listAll(Bairro.class);

        return bairros;
    }

    public Bairro buscar(String descricao) {
        Bairro bairro = genericDAO.listOne("descricao", descricao, Bairro.class);

        return bairro;
    }
}
