package io.github.mikaelmessias.modelo.dao;

import java.util.List;

/**
 * @author Giuvane Conti
 */
interface iGenericDAO<T> {
    public void save(T object);

    public List listAll(Class object);

    public void update(T object);

    public void delete(T object);
}