package io.github.mikaelmessias.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;

/**
 * @author Giuvane Conti
 */
public class ConexaoHibernate {

    private static EntityManagerFactory factory;
    private volatile static EntityManager manager;

    private ConexaoHibernate() {
    }

    public static EntityManager getInstance() {
        if (manager == null) {
            synchronized (ConexaoHibernate.class) {
                if (manager == null) {

                    try {
                        factory = Persistence.createEntityManagerFactory("Revisao");
                        manager = factory.createEntityManager();
                    } catch (HibernateException he) {
                        System.err.println(he.getMessage());
                    }

                }
            }
        }
        return manager;
    }

}
