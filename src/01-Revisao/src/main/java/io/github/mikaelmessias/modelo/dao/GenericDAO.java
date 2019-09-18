package io.github.mikaelmessias.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * @author Giuvane Conti
 */
public class GenericDAO<T> implements iGenericDAO<T> {

    EntityManager manager = ConexaoHibernate.getInstance();

    public void commit() {
        manager.getTransaction().commit();
    }

    @Override
    public void save(T object) {
        manager.getTransaction().begin();
        manager.persist(object);
        manager.getTransaction().commit();
        System.out.println(object.getClass().getSimpleName() + " salvo com sucesso!");
    }

    @Override
    public void update(T object) {
        manager.getTransaction().begin();
        manager.persist(object);
        manager.getTransaction().commit();
        System.out.println(object.getClass().getSimpleName() + " atualizado com sucesso!");

    }

    @Override
    public void delete(T object) {
        manager.getTransaction().begin();
        manager.remove(object);
        manager.getTransaction().commit();
        System.out.println(object.getClass().getSimpleName() + " excluído com sucesso!");
    }

    public T listOne(String pkName, int pkValue, Class clazz) {
        String jpql = " SELECT t FROM " + clazz.getTypeName() + " t where t." + pkName + " = " + pkValue;
        Query query = manager.createQuery(jpql);
        Object obj = query.getSingleResult();
        return (T) obj;
    }

    public T listOne(String pkName, String pkValue, Class clazz) {
        String jpql = " SELECT t FROM " + clazz.getTypeName() + " t where t." + pkName + " = " + pkValue;
        Query query = manager.createQuery(jpql);
        Object obj = query.getSingleResult();
        return (T) obj;
    }

    @Override
    public List listAll(Class clazz) {
        String jpql = " SELECT t FROM " + clazz.getTypeName() + " t";
        Query query = manager.createQuery(jpql);
        List<T> objects = query.getResultList();
        return objects;
    }

}